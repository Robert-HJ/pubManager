package com.toyProject.pubManager.menu;

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
@Table(name = "menu")
public class MenuEntity extends BaseEntity {

    @Column(nullable = false, unique = true, length = 60)
    private String name;

    @Column(nullable = false)
    private int categoryNo;

    private int price;

    private int imageNo;

    @Builder
    public MenuEntity(String name, int categoryNo, int price, int imageNo) {
        this.name = name;
        this.categoryNo = categoryNo;
        this.price = price;
        this.imageNo = imageNo;
    }

    public MenuDto toDto(){
        return MenuDto.builder()
                .no(no)
                .name(name)
                .categoryNo(categoryNo)
                .price(price)
                .imageNo(imageNo)
                .createDate(createDate)
                .updateDate(updateDate)
                .build();
    }

    public void updateMenu(String name, int categoryNo, int price, int imageNo) {
        this.name = name;
        this.categoryNo = categoryNo;
        this.price = price;
        this.imageNo = imageNo;
    }

}
