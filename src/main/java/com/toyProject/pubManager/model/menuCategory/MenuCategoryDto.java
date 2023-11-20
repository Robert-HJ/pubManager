package com.toyProject.pubManager.model.menuCategory;

import com.toyProject.pubManager.model.entity.BaseDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class MenuCategoryDto extends BaseDto {

    private String name;

}
