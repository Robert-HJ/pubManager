package com.toyProject.pubManager.model.menuCategory;

import com.toyProject.pubManager.model.menu.MenuInfoDto;
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
    public MenuCategoryDto getMenuCategory(@PathVariable("no") Long no) {
        return menuCategoryService.getMenuInfo(no);
    }

    @GetMapping("")
    public List<MenuInfoDto> getMenuInfo(){
        return menuCategoryService.getMenuInfoList();
    }

    @PostMapping("")
    public long registMenuInfo(@RequestBody MenuInfoDto param){
        return menuInfoService.registMenuInfo(param);
    }

    @PutMapping("")
    public void modifyMenuInfo(@RequestBody MenuInfoDto param) {
        menuInfoService.modifyMenuInfo(param);
    }

    @DeleteMapping("/{no}")
    public void deleteMenuInfo(@PathVariable("no") long no) {
        menuInfoService.deleteMenuInfo(no);
    }


}
