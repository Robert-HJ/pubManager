package com.toyProject.pubManager.orders;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
@Tag(name = "Orders")
public class OrdersController {

    private final OrdersService ordersService;

    @GetMapping("/{no}")
    public OrdersDto getOrders(@PathVariable("no") int no) {
        return ordersService.getOrders(no);
    }

    @GetMapping("")
    public List<OrdersDto> getOrdersList(){
        return ordersService.getOrdersList();
    }

    @PostMapping("")
    public int registOrders(@RequestBody OrdersDto param){
        return ordersService.registOrders(param);
    }

    @PutMapping("/{no}")
    public void modifyOrders(@PathVariable("no") int no, @RequestBody OrdersDto param) {
        ordersService.modifyOrders(no, param);
    }

    @DeleteMapping("/{no}")
    public void deleteOrders(@PathVariable("no") int no) {
        ordersService.deleteOrders(no);
    }

}
