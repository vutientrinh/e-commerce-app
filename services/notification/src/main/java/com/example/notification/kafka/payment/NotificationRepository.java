package com.example.notification.kafka.payment;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<PaymentMethod,String> {
}
