package _MessageReceiver;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Runner implements CommandLineRunner {
	
	private final RabbitTemplate rabbitTemplate;
	private final ObjectMapper objectMapper;
	
	@Autowired
	private ConfigurableApplicationContext context;

	public Runner(RabbitTemplate template, ObjectMapper mapper) {
		super();
		this.rabbitTemplate = template;
		this.objectMapper = mapper;
	}
	
	@Override
	public void run(String ... args) throws Exception {
		int index = (int) (( (Math.random()) * (28-1) )+ 10);		// 28 is room number row
					// get random number between 1-28
		
		AsyncPayload payload = new AsyncPayload();
		payload.setId(index);
		payload.setModel("ROOM");
		
		rabbitTemplate.convertAndSend("ROOM", "com._TheymeLeaf_Pract1.AsyncPackage.RoomCleanerListener",
				objectMapper.writeValueAsString(payload) );
		context.close();
	}
	
}
