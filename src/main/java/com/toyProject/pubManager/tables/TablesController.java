package com.toyProject.pubManager.tables;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tables")
@Tag(name = "Tables")
public class TablesController {

    private final TablesService tablesService;

    @GetMapping("/{no}")
    public TablesDto getTables(@PathVariable("no") int no) {
        return tablesService.getTables(no);
    }

    @GetMapping("")
    public List<TablesDto> getTablesList(){
        return tablesService.getTablesList();
    }

    @PostMapping("")
    public int registTables(@RequestBody TablesDto param){
        return tablesService.registTables(param);
    }

    @PostMapping("/{count}")
    public void registTablesAuto(@PathVariable("count") int count){
        tablesService.registTablesAuto(count);
    }

    @PutMapping("/{no}")
    public void modifyTables(@PathVariable("no") int no, @RequestBody TablesDto param) {
        tablesService.modifyTables(no, param);
    }

    @DeleteMapping("/{no}")
    public void deleteTables(@PathVariable("no") int no) {
        tablesService.deleteTables(no);
    }

    @DeleteMapping("/all")
    public void deleteTables() {
        tablesService.deleteTablesAll();
    }

}
