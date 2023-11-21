package com.toyProject.pubManager.payment;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payment")
@Tag(name = "Payment")
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping("/{no}")
    public PaymentDto getPayment(@PathVariable("no") int no) {
        return paymentService.getPayment(no);
    }

    @GetMapping("")
    public List<PaymentDto> getPaymentList(){
        return paymentService.getPaymentList();
    }

    @PostMapping("")
    public long registPayment(@RequestBody PaymentDto param){
        return paymentService.registPayment(param);
    }

    @PutMapping("/{no}")
    public void modifyPayment(@PathVariable("no") int no, @RequestBody PaymentDto param) {
        paymentService.modifyPayment(no, param);
    }

    @DeleteMapping("/{no}")
    public void deletePayment(@PathVariable("no") int no) {
        paymentService.deletePayment(no);
    }

}
