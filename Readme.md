This is a Eureka server application :
 the entire logic is present in the application.properties file. 
 
 There are two modes here :
 1. Standalone mode
 2. Clustered mode
 
 run maven install and the jar file is formed in the target folder.
 
 so we have to select an active profile to run in any of the above said modes.
 
 To run in standalone mode :
 -------------------------------------------
 
 java -Dspring.profiles.active=standalone -jar target/eureka-ha-server-0.0.1-SNAPSHOT.jar
 
 
 To run in cluster mode:
 ----------------------------------------------
 1. Lets run the application in two ports 1111 and 2222.
 2. So if any one is down , then the other will become the master.
 
 java -Dspring.profiles.active=clustered 
      -Dserver.port=1111 
      -DhostName=localhost 
      -Denvironment=dev/stg/prd
      -DeurekaServerUrls=http://localhost:1111/eureka/,
      			 http://localhost:2222/eureka/ 
     -jar eureka-ha-server-0.0.1-SNAPSHOT.jar &
     
     
     
java -Dspring.profiles.active=clustered 
	 -Dserver.port=1112 
	 -DhostName=localhost 
	 -Denvironment=dev/stg/prd
	 -DeurekaServerUrls=http://localhost:1111/eureka/,
	 			http://localhost:1112/eureka/ 
	 -jar eureka-ha-server-0.0.1-SNAPSHOT.jar &
	 
You can also run the above commands in two different terminals.
 
