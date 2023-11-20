package com.toyProject.pubManager.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class OrdersEntity extends BaseEntity{

    private int tableNo;

    private int menuNo;

    private int count;
}
