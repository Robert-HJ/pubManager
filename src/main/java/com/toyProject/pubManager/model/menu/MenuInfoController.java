package com.toyProject.pubManager.model.menu;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
@RequiredArgsConstructor
@Tag(name = "Menu Info")
public class MenuInfoController {

    private final MenuInfoService menuInfoService;

    @GetMapping("/{no}")
    public MenuInfoDto getMenuInfo(@PathVariable("no") Long no) {
        return menuInfoService.getMenuInfo(no);
    }

    @GetMapping("")
    public List<MenuInfoDto> getMenuInfo(){
        return menuInfoService.getMenuInfoList();
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
