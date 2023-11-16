

		Steps:
		
		
	I copied this project from another.
	
	1.	Add dependencies 
			spring-boot-starter-data-jpa
			h2
			
		Update Maven
	
	2.	Add SQL files in resources folder.
			DML commands
			Table Schema 
			
	3.	Update properties
		
		logging.level.org.springframework.jdbc.datasource.init.ScriptUtils=debug
		
		for DB
		spring.h2.console.enabled=true
		spring.datasource.url=jdbc:h2:mem:TestDB	// mem for memory

































































