package com.example.notification.kafka;

import com.example.notification.kafka.payment.NotificationRepository;
import com.example.notification.kafka.payment.PaymentConfirmation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationConsumer {
    private final NotificationRepository notificationRepository;
    public void consumePaymentSuccessNotification(PaymentConfirmation paymentConfirmation){

    }
}
