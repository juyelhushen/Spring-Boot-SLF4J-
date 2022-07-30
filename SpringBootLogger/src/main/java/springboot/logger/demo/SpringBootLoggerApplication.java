package springboot.logger.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLoggerApplication 
{
	private static final Logger log = LoggerFactory.getLogger(SpringBootLoggerApplication.class);
	
	public static void main(String[] args) 
	{
		log.debug("i m in main logger application class");
		SpringApplication.run(SpringBootLoggerApplication.class, args);
	}
}
