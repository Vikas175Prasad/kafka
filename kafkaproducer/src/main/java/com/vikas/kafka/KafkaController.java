package com.vikas.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/kafka")
public class KafkaController {

	@Autowired
	KafkaProducer kp;
	
	@GetMapping(value = "/publishmessage")
	public String produce(@RequestParam("message")String message) {
		kp.send(message);
		return "Message successfully published to topic";
	}
}
