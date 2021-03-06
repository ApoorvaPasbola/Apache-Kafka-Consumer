package com.apoorva.kafka.spirngbootkafkaconsumer.listener;

import com.apoorva.kafka.spirngbootkafkaconsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {

    @KafkaListener(topics = "Kafka_Example2",group = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(topics = "Kafka_Example_json2",group = "group_json",containerFactory = "userKafkaListenerFactory")
    public void consumeUser(User u){
        System.out.println("Consumed User: " + u);
    }
}