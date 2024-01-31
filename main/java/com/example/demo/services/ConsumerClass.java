package com.example.demo.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerClass {
	
	@KafkaListener(topics = "kafkaTopic", groupId = "101")
	public void getMsgFromProducer(String msg)
	{
		System.out.println(msg);
	}
}
