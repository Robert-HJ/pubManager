package com.toyProject.pubManager.menuCategory;

import com.toyProject.pubManager.framework.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="menu_category")
public class MenuCategoryEntity extends BaseEntity {

    @Column(nullable = false, unique = true, length = 60)
    private String name;

    @Builder
    public MenuCategoryEntity(String name) {
        this.name = name;
    }

    public MenuCategoryDto toDto(){
        return MenuCategoryDto.builder()
                .no(no)
                .name(name)
                .createDate(createDate)
                .updateDate(updateDate)
                .build();
    }

    public void updateMenuCategory(String name) {
        this.name = name;
    }

}
