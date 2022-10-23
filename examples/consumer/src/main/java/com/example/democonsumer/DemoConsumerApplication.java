package com.example.democonsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

@SpringBootApplication
public class DemoConsumerApplication {

    public static final String TOPIC_NAME = "KafkaHelloTopic";


    public static void main(String[] args) {
        SpringApplication.run(DemoConsumerApplication.class, args);
    }

    @KafkaListener(topics = TOPIC_NAME)
    public void listenWithHeaders(
            @Payload String message,
            @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println(
                "Received Message: " + message
                        + "from partition: " + partition);
    }

}
