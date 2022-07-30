package springboot.logger.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.logger.demo.model.LoggerDemo;
import springboot.logger.demo.repository.LoggerRepo;

@Service
public class LoggerService 
{
	private static final Logger log = LoggerFactory.getLogger(LoggerService.class);
	
	
	@Autowired
	LoggerRepo repo;
	
	public List<LoggerDemo> getAll()
	{
		log.debug("I am in getAll() in logger service ");
		return repo.findAll();
	}

}
