package com.toyProject.pubManager.payment;

import com.toyProject.pubManager.framework.BaseDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class PaymentDto extends BaseDto {

    private int tableNo;
    private int totalPrice;
    private PaymentTypeEnum status;
    private String phoneNumber;

    public PaymentEntity toEntity(){
        return PaymentEntity.builder()
                .tableNo(tableNo)
                .totalPrice(totalPrice)
                .status(status)
                .phoneNumber(phoneNumber)
                .build();
    }
}
