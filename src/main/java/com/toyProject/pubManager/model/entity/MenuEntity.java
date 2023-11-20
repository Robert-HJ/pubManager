package com.toyProject.pubManager.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "menu")
public class MenuEntity extends BaseEntity{

    @Column(nullable = false, unique = true, length = 60)
    private String name;

    @Column(nullable = false)
    private int category_no;

    private int price;

    private int image_no;

}
