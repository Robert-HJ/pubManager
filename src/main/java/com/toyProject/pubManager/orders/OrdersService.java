package com.toyProject.pubManager.orders;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrdersService {

    private final OrdersRepository ordersRepository;

    public List<OrdersDto> getOrdersList(){
        List<OrdersEntity> entityList = ordersRepository.findAll();
        List<OrdersDto> dtoList = new ArrayList<>();

        for (OrdersEntity entity : entityList) {
            dtoList.add(entity.toDto());
        }

        return dtoList;
    }

    public OrdersDto getOrders(int no){

        Optional<OrdersEntity> ordersOptional = ordersRepository.findById(no);

        OrdersDto ordersDto = null;
        if(ordersOptional.isPresent()){
            ordersDto = ordersOptional.get().toDto();
        }

        return ordersDto;
    }

    @Transactional
    public int registOrders(OrdersDto dto){
        OrdersEntity entity = dto.toEntity();
        entity = ordersRepository.save(entity);

        return entity.getNo();
    }

    @Transactional
    public void modifyOrders(int no, OrdersDto dto){
        Optional<OrdersEntity> entity = ordersRepository.findById(no);
        entity.ifPresent(ordersEntity -> ordersEntity.updateOrders(dto.getTableNo(), dto.getMenuNo(), dto.getCount()));
    }

    @Transactional
    public void deleteOrders(int no){
        ordersRepository.deleteById(no);
    }



}
