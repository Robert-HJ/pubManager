package com.toyProject.pubManager.model.menu;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="menu_info")
public class MenuInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long no;

    private long categoryNo;

    private String name;

    private long price;

    private long imageId;

    @Builder
    public MenuInfoEntity(long categoryNo, String name, long price, long imageId){
        this.categoryNo = categoryNo;
        this.name = name;
        this.price = price;
        this.imageId = imageId;
    }

    public MenuInfoDto toDto(){
        return MenuInfoDto.builder()
                .no(no)
                .categoryNo(categoryNo)
                .name(name)
                .price(price)
                .imageId(imageId)
                .build();
    }

    public void updateMenuInfo(Long categoryNo, String name, Long price, Long imageId) {
        if(categoryNo != null) this.categoryNo = categoryNo;

        if(name != null) this.name = name;

        if(price != null) this.price = price;

        if(imageId != null) this.imageId = imageId;
    }


}
