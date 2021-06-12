package com.vikas.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = {"kafka_topic"}, groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed Message:"+message);
	}
}
