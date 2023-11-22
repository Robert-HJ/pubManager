package com.toyProject.pubManager.tables;

import com.toyProject.pubManager.framework.BaseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
public class TablesDto extends BaseDto {

    private String name;

    public TablesEntity toEntity(){
        return TablesEntity.builder()
                .name(name)
                .build();
    }
}
