package com.example.payment.service;


import com.example.payment.dto.PaymentRequest;
import com.example.payment.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;
    public Integer createPayment(PaymentRequest paymentRequest) {
        var payment = paymentRepository.save(paymentMapper.toPayment(paymentRequest));
        return null;
    }
}
