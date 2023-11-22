package com.toyProject.pubManager.menuCategory;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/menuCategory")
@Tag(name = "Menu Category")
public class MenuCategoryController {

    private final MenuCategoryService menuCategoryService;

    @GetMapping("/{no}")
    public MenuCategoryDto getMenuCategory(@PathVariable("no") int no) {
        return menuCategoryService.getMenuCategory(no);
    }

    @GetMapping("")
    public List<MenuCategoryDto> getMenuCategoryList(){
        return menuCategoryService.getMenuCategoryList();
    }

    @PostMapping("")
    public int registMenuCategory(@RequestBody MenuCategoryDto param){
        return menuCategoryService.registMenuCategory(param);
    }

    @PutMapping("/{no}")
    public void modifyMenuCategory(@PathVariable("no") int no, @RequestBody MenuCategoryDto param) {
        menuCategoryService.modifyMenuCategory(no, param);
    }

    @DeleteMapping("/{no}")
    public void deleteMenuCategory(@PathVariable("no") int no) {
        menuCategoryService.deleteMenuCategory(no);
    }

}
