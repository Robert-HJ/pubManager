package com.toyProject.pubManager.menu;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public List<MenuDto> getMenuList(){
        List<MenuEntity> entityList = menuRepository.findAll();
        List<MenuDto> dtoList = new ArrayList<>();

        for (MenuEntity entity : entityList) {
            dtoList.add(entity.toDto());
        }

        return dtoList;
    }

    public MenuDto getMenu(int no){
        Optional<MenuEntity> menuInfo = menuRepository.findById(no);

        MenuDto menuInfoDto = null;
        if (menuInfo.isPresent()){
            menuInfoDto = menuInfo.get().toDto();
        }

        return menuInfoDto;
    }

    @Transactional
    public long registMenu(MenuDto dto){
        MenuEntity entity = dto.toEntity();

        entity = menuRepository.save(entity);

        return entity.getNo();
    }

    @Transactional
    public void modifyMenu(int no, MenuDto dto){
        Optional<MenuEntity> entity = menuRepository.findById(no);

        entity.ifPresent(menuEntity ->
                            menuEntity.updateMenu(dto.getName(), dto.getCategoryNo(), dto.getPrice(), dto.getImageNo())
                        );

    }

    @Transactional
    public void deleteMenu(int no){
        menuRepository.deleteById(no);
    }

}
