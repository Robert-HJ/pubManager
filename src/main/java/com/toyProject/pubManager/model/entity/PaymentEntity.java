package com.toyProject.pubManager.model.entity;

import com.toyProject.pubManager.model.enums.PaymentTypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "payment")
public class PaymentEntity extends BaseEntity {

    @Column(nullable = false)
    private int tableNo;

    @Column(nullable = false)
    private int totalPrice;

    @Column(length = 45)
    private PaymentTypeEnum status;

    @Column(length = 11)
    private String phoneNumber;

}
