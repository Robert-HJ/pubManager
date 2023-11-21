package com.toyProject.pubManager.payment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public List<PaymentDto> getPaymentList(){
        List<PaymentEntity> entityList = paymentRepository.findAll();
        List<PaymentDto> dtoList = new ArrayList<>();

        for (PaymentEntity entity : entityList) {
            dtoList.add(entity.toDto());
        }

        return dtoList;
    }

    public PaymentDto getPayment(int no){

        Optional<PaymentEntity> paymentOptional = paymentRepository.findById(no);

        PaymentDto paymentDto = null;
        if(paymentOptional.isPresent()){
            paymentDto = paymentOptional.get().toDto();
        }

        return paymentDto;
    }

    @Transactional
    public int registPayment(PaymentDto dto){
        PaymentEntity entity = dto.toEntity();
        entity = paymentRepository.save(entity);

        return entity.getNo();
    }

    @Transactional
    public void modifyPayment(int no, PaymentDto dto){
        Optional<PaymentEntity> entity = paymentRepository.findById(no);
        entity.ifPresent(paymentEntity -> paymentEntity.updatePayment(dto.getTableNo(), dto.getTotalPrice(), dto.getStatus(), dto.getPhoneNumber()));
    }

    @Transactional
    public void deletePayment(int no){
        paymentRepository.deleteById(no);
    }



}
