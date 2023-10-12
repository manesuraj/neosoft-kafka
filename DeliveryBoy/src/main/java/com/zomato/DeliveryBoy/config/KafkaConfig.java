package com.zomato.DeliveryBoy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.retrytopic.RetryTopicConfigurationBuilder;

@Configuration
public class KafkaConfig {
	
	@Bean
	public NewTopic newTopic() {
		return TopicBuilder.name("location-update-topic").build();
	}

}
