package com.toyProject.pubManager.tables;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TablesService {

    private final TablesRepository tablesRepository;

    public List<TablesDto> getTablesList(){
        List<TablesEntity> entityList = tablesRepository.findAll();
        List<TablesDto> dtoList = new ArrayList<>();

        for (TablesEntity entity : entityList) {
            dtoList.add(entity.toDto());
        }

        return dtoList;
    }

    public TablesDto getTables(int no){

        Optional<TablesEntity> tablesOptional = tablesRepository.findById(no);

        TablesDto tablesDto = null;
        if(tablesOptional.isPresent()){
            tablesDto = tablesOptional.get().toDto();
        }

        return tablesDto;
    }

    @Transactional
    public int registTables(TablesDto dto){
        TablesEntity entity = dto.toEntity();
        entity = tablesRepository.save(entity);

        return entity.getNo();
    }

    @Transactional
    public void modifyTables(int no, TablesDto dto){
        Optional<TablesEntity> entity = tablesRepository.findById(no);
        entity.ifPresent(tablesEntity -> tablesEntity.updateTables(dto.getName()));
    }

    @Transactional
    public void deleteTables(int no){
        // TODO : 연관 된 데이터가 있을 시 삭제 불가능하도록 해야 함.
        tablesRepository.deleteById(no);
    }

    @Transactional
    public void deleteTablesAll(){
        // TODO : delete ALL 하기 전에 삭제해도 되는지 확인 필요
        tablesRepository.deleteAll();
    }

    @Transactional
    public void registTablesAuto(int count) {

        int number = 1;
        if (!getTablesList().isEmpty()) {
            number = getTablesList().size();
        }

        String suffix = "번";

        TablesDto tablesDto = null;
        for (int i = number + 1; i <= number + count; i++) {
            tablesDto = new TablesDto();
            tablesDto.setName(i + suffix);
            registTables(tablesDto);
        }
    }
}
