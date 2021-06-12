package com.vikas.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	@Autowired
	private KafkaTemplate<String, String> kt;
	
	String kafkaTopic = "kafka_topic";
	
	public void send(String message) {
		kt.send(kafkaTopic, message);
	}
}
