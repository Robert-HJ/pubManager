package com.toyProject.pubManager.payment;

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

    @Builder
    public PaymentEntity(int tableNo, int totalPrice, PaymentTypeEnum status, String phoneNumber) {
        this.tableNo = tableNo;
        this.totalPrice = totalPrice;
        this.status = status;
        this.phoneNumber = phoneNumber;
    }

    public PaymentDto toDto(){
        return PaymentDto.builder()
                .no(no)
                .tableNo(tableNo)
                .totalPrice(totalPrice)
                .status(status)
                .phoneNumber(phoneNumber)
                .createDate(createDate)
                .updateDate(updateDate)
                .build();
    }

    public void updatePayment(int tableNo, int totalPrice, PaymentTypeEnum status, String phoneNumber) {
        this.tableNo = tableNo;
        this.totalPrice = totalPrice;
        this.status = status;
        this.phoneNumber = phoneNumber;
    }

}
