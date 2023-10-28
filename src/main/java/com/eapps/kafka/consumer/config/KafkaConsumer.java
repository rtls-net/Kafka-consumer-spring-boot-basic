package com.eapps.kafka.consumer.config;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "eapps-topic",groupId = "eapps-1")
    public void consumer(String message){
        System.out.println("Message received1 {}:"+message);
    }

   /* @KafkaListener(topics = "eapps-topic",groupId = "eapps-1")
    public void consumer2(String message){
        System.out.println("Message received2 {}:"+message);
    }

    @KafkaListener(topics = "eapps-topic",groupId = "eapps-1")
    public void consumer3(String message){
        System.out.println("Message received3 {}:"+message);
    }

    @KafkaListener(topics = "eapps-topic",groupId = "eapps-1")
    public void consumer4(String message){
        System.out.println("Message received4 {}:"+message);
    }*/
}