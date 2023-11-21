package com.toyProject.pubManager.menuCategory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuCategoryService {

    private final MenuCategoryRepository menuCategoryRepository;

    public List<MenuCategoryDto> getMenuCategoryList(){
        List<MenuCategoryEntity> entityList = menuCategoryRepository.findAll();
        List<MenuCategoryDto> dtoList = new ArrayList<>();

        for (MenuCategoryEntity entity : entityList) {
            dtoList.add(entity.toDto());
        }

        return dtoList;
    }

    public MenuCategoryDto getMenuCategory(int no){

        Optional<MenuCategoryEntity> menuCategoryOptional = menuCategoryRepository.findById(no);

        MenuCategoryDto menuCategoryDto = null;
        if(menuCategoryOptional.isPresent()){
            menuCategoryDto = menuCategoryOptional.get().toDto();
        }

        return menuCategoryDto;
    }

    @Transactional
    public int registMenuCategory(MenuCategoryDto dto){
        MenuCategoryEntity entity = dto.toEntity();
        entity = menuCategoryRepository.save(entity);

        return entity.getNo();
    }

    @Transactional
    public void modifyMenuCategory(int no, MenuCategoryDto dto){
        Optional<MenuCategoryEntity> entity = menuCategoryRepository.findById(no);
        entity.ifPresent(menuCategoryEntity -> menuCategoryEntity.updateMenuCategory(dto.getName()));
    }

    @Transactional
    public void deleteMenuCategory(int no){
        menuCategoryRepository.deleteById(no);
    }



}
