package com.toyProject.pubManager.menu;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/menu")
@Tag(name = "Menu")
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/{no}")
    public MenuDto getMenu(@PathVariable("no") int no) {
        return menuService.getMenu(no);
    }

    @GetMapping("")
    public List<MenuDto> getMenu(){
        return menuService.getMenuList();
    }

    @PostMapping("")
    public long registMenu(@RequestBody MenuDto param){
        return menuService.registMenu(param);
    }

    @PutMapping("/{no}")
    public void modifyMenu(@PathVariable("no") int no, @RequestBody MenuDto param) {
        menuService.modifyMenu(no, param);
    }

    @DeleteMapping("/{no}")
    public void deleteMenu(@PathVariable("no") int no) {
        menuService.deleteMenu(no);
    }
}
