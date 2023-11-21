package com.toyProject.pubManager.orders;

import com.toyProject.pubManager.framework.BaseDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class OrdersDto extends BaseDto {

    private int tableNo;

    private int menuNo;

    private int count;

    public OrdersEntity toEntity(){
        return OrdersEntity.builder()
                .tableNo(tableNo)
                .menuNo(menuNo)
                .count(count)
                .build();
    }
}
