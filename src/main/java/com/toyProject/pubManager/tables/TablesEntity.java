package com.toyProject.pubManager.tables;

import com.toyProject.pubManager.framework.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="tables")
public class TablesEntity extends BaseEntity {

    @Column(nullable = false, unique = true, length = 60)
    private String name;

    @Builder
    public TablesEntity(String name){
        this.name = name;
    }

    public TablesDto toDto(){
        return TablesDto.builder()
                .no(no)
                .name(name)
                .createDate(createDate)
                .updateDate(updateDate)
                .build();
    }

    public void updateTables(String name) {
        this.name = name;
    }

}
