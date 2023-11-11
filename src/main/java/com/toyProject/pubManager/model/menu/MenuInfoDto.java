package com.toyProject.pubManager.model.menu;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MenuInfoDto {

    private long no;
    private long categoryNo;
    private String name;
    private long price;
    private long imageId;

    @Builder
    public MenuInfoDto(long no, long categoryNo, String name, long price, long imageId) {
        this.no = no;
        this.categoryNo = categoryNo;
        this.name = name;
        this.price = price;
        this.imageId = imageId;
    }

    public MenuInfoEntity toEntity(){
        return MenuInfoEntity.builder()
                .categoryNo(categoryNo)
                .name(name)
                .price(price)
                .imageId(imageId)
                .build();
    }

}
