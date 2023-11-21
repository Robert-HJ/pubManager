package com.toyProject.pubManager.menu;

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
public class MenuDto extends BaseDto {

    private String name;
    private int categoryNo;
    private int price;
    private int imageNo;

    public MenuEntity toEntity(){
        return MenuEntity.builder()
                .categoryNo(categoryNo)
                .name(name)
                .price(price)
                .imageNo(imageNo)
                .build();
    }

}
