package com.zomato.EndUser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.zomato.EndUser.constant.AppConstant;

@Configuration
public class KafkaConfig {
	
	
	@KafkaListener(topics = AppConstant.LOCATION_TOPIC_NAME, groupId = AppConstant.GROUP_ID)
	public void updatedLocation(String value) {
		
		System.out.println(value);
		
	}

}
