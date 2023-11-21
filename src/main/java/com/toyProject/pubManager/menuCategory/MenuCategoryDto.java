package com.toyProject.pubManager.menuCategory;

import com.toyProject.pubManager.framework.BaseDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@SuperBuilder
public class MenuCategoryDto extends BaseDto {

    private String name;

    public MenuCategoryEntity toEntity(){
        return MenuCategoryEntity.builder().name(name).build();
    }
}
