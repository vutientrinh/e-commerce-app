package com.example.notification.kafka;

import com.example.notification.email.EmailService;
import com.example.notification.kafka.order.OrderConfirmation;
import com.example.notification.notification.NotificationRepository;
import com.example.notification.kafka.payment.PaymentConfirmation;
import com.example.notification.notification.Notification;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static com.example.notification.enums.NotificationType.ORDER_CONFIRMATION;
import static com.example.notification.enums.NotificationType.PAYMENT_CONFIRMATION;
import static java.lang.String.format;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationConsumer {
    private final NotificationRepository notificationRepository;
    private final EmailService emailService;
    @KafkaListener(topics = "payment-topic", groupId = "paymentGroup")
    public void consumePaymentSuccessNotification(PaymentConfirmation paymentConfirmation) throws MessagingException {
        log.info(format("Consuming the message from payment-topic Topic:: %s", paymentConfirmation));
//        notificationRepository.save(
//                Notification.builder()
//                        .type(PAYMENT_CONFIRMATION)
//                        .notificationDate(LocalDateTime.now())
//                        .paymentConfirmation(paymentConfirmation
//                        )
//                        .build()
//        );
//        // Send email
//        var customerName = paymentConfirmation.customerFirstName() + " " + paymentConfirmation.customerLastName();
//        emailService.sentPaymentSuccessEmail(
//                paymentConfirmation.customerEmail(),
//                customerName,
//                paymentConfirmation.amount(),
//                paymentConfirmation.orderReference()
//        );
    }
    @KafkaListener(topics = "order-topic", groupId = "orderGroup")
    public void consumeOrderConfirmationNotification(OrderConfirmation orderConfirmation) throws MessagingException {
        log.info(format("Consuming the message from order-topic Topic:: %s", orderConfirmation));
//        notificationRepository.save(
//                Notification.builder()
//                        .type(ORDER_CONFIRMATION)
//                        .notificationDate(LocalDateTime.now())
//                        .orderConfirmation(orderConfirmation)
//                        .build()
//        );
//        var customerName = orderConfirmation.customer().firstName() + " " + orderConfirmation.customer().lastName();
//        emailService.sentOrderConfirmationSuccessEmail(
//                orderConfirmation.customer().email(),
//                customerName,
//                orderConfirmation.totalAmount(),
//                orderConfirmation.orderReference(),
//                orderConfirmation.products()
//        );

    }
}
