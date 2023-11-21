package com.toyProject.pubManager.orders;

import com.toyProject.pubManager.framework.BaseEntity;
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
@Table(name = "orders")
public class OrdersEntity extends BaseEntity {

    private int tableNo;

    private int menuNo;

    private int count;

    @Builder
    public OrdersEntity(int tableNo, int menuNo, int count) {
        this.tableNo = tableNo;
        this.menuNo = menuNo;
        this.count = count;
    }

    public OrdersDto toDto(){
        return OrdersDto.builder()
                .no(no)
                .tableNo(tableNo)
                .menuNo(menuNo)
                .count(count)
                .createDate(createDate)
                .updateDate(updateDate)
                .build();
    }

    public void updateOrders(int tableNo, int menuNo, int count) {
        this.tableNo = tableNo;
        this.menuNo = menuNo;
        this.count = count;
    }
}
