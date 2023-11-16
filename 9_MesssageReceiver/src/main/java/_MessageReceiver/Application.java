package _MessageReceiver;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
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

}
