package com.toyProject.pubManager.model.menu;

import com.toyProject.pubManager.model.repository.MenuInfoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuInfoService {

    private final MenuInfoRepository menuInfoRepository;

    public List<MenuInfoDto> getMenuInfoList(){
        List<MenuInfoEntity> entityList = menuInfoRepository.findAll();
        List<MenuInfoDto> dtoList = new ArrayList<>();

        for (MenuInfoEntity entity : entityList) {
            dtoList.add(entity.toDto());
        }

        return dtoList;
    }

    public MenuInfoDto getMenuInfo(long menuNu){
        Optional<MenuInfoEntity> menuInfo = menuInfoRepository.findById(menuNu);

        MenuInfoDto menuInfoDto = null;
        if (menuInfo.isPresent()){
            menuInfoDto = menuInfo.get().toDto();
        }

        return menuInfoDto;
    }

    @Transactional
    public long registMenuInfo(MenuInfoDto dto){
        MenuInfoEntity entity = dto.toEntity();

        entity = menuInfoRepository.save(entity);

        return entity.getNo();
    }

    @Transactional
    public void modifyMenuInfo(MenuInfoDto dto){
        Optional<MenuInfoEntity> entity = menuInfoRepository.findById(dto.getNo());
        entity.get().updateMenuInfo(dto.getCategoryNo(), dto.getName(), dto.getPrice(), dto.getImageId());

    }가

    @Transactional
    public void deleteMenuInfo(long no){
        menuInfoRepository.deleteById(no);
    }

}
