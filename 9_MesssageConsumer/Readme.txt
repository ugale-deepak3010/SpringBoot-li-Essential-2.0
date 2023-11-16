

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

	-----------------------------------------------------------------------------------------------------------------------------
	
		We don't want to generate ddl command. we want to use our own sql files.
		
		spring.jpa.hibernate.ddl-auto=none
		
	4.	Updated Room Model and Added @Entity, @Table, setup @Column, @GeneratedValue
	
	5.	Create new package "Data" -> RoomRepository	extends JPARespository
	
		"""public interface RoomRepository extends JpaRepository<Room, Long> {
		
			}"""
			
	5.	Updated RoomService and getting load data from Data Repository
		
		

	-----------------------------------------------------------------------------------------------------------------------------


	Challenge Start






























































