package com._TheymeLeaf_Pract1.Config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com._TheymeLeaf_Pract1.AsyncPackage.RoomCleanerListener;

@Configuration
public class AsyncConfig {
	
	public static final String QueueName = "room-cleaner";
	public static final String ExchangeName = "operations";
	
	@Bean
	public Queue queue() {
		return new Queue(QueueName, false);
	}
	
	@Bean
	public TopicExchange exchange() {
		return new TopicExchange(ExchangeName);
	}
	
	@Bean
	public Binding binding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with("com._TheymeLeaf_Pract1.AsyncPackage.RoomCleanerListener");
	}

	@Bean
	public MessageListenerAdapter listenerAdapter(RoomCleanerListener listener) {
		return new MessageListenerAdapter(listener, "receiveMessage");
	}
	
	@Bean
	public SimpleMessageListenerContainer container(ConnectionFactory connectionFactory, MessageListenerAdapter listenerAdapter) {
		
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		container.setQueueNames(QueueName);
		container.setMessageListener(listenerAdapter);
		
		return container;
	}
}
