package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.ProducerClass;

@RestController
@RequestMapping("/api")
public class RestContoller {
	
	@Autowired
	ProducerClass producerClass;
	
	@GetMapping("/producermsg")
	public String getMessageFromApi(@RequestParam("message")String message)
	{
		producerClass.sendMsgToConsumer(message);
		return message;
	}
}
