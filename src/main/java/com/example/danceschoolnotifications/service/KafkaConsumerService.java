package com.example.danceschoolnotifications.service;

import com.example.danceschoolnotifications.event.UserEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumerService {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = "user-created", groupId = "notifications-group")
    public void consume(String message) {
        try {
            UserEvent event = objectMapper.readValue(message, UserEvent.class);
            log.info("Received UserEvent: {}", event);
        } catch (Exception e) {
            log.error("Failed to deserialize message: {}", message, e);
        }
    }
}