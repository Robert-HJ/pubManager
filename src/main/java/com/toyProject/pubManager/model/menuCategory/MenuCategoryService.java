package com.toyProject.pubManager.model.menuCategory;

import com.toyProject.pubManager.model.repository.MenuCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuCategoryService {

    private final MenuCategoryRepository menuCategoryRepository;

    public List<MenuCategoryDto> getMenuInfoList(){

    }

}
