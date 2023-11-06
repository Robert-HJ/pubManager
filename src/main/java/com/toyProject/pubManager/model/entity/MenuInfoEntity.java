package com.toyProject.pubManager.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="menu_info")
public class MenuInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sequenceId;

    private long categoryId;

    private String name;

    private long price;

    private long imageId;

    @Builder
    public MenuInfoEntity(long categoryId, String name, long price, long imageId){
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
        this.imageId = imageId;
    }



}
