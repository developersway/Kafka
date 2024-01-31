package com.example.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

@Service
public class ProducerClass {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMsgToConsumer(String msg)
	{
		kafkaTemplate.send("kafkaTopic", msg);
	}
	
}
