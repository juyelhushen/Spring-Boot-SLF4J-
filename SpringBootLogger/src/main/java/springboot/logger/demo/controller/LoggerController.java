package springboot.logger.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.logger.demo.model.LoggerDemo;
import springboot.logger.demo.service.LoggerService;

@RestController
@RequestMapping(path = "/api")
public class LoggerController 
{
	private static final Logger log = LoggerFactory.getLogger(LoggerController.class);
	
	@Autowired
	LoggerService service;
	
	@GetMapping(path = "/get")
	public List<LoggerDemo> getLoggerDemo()
	{
		log.debug("i am in Controller GetLoggerDemo");
		log.warn("This is for Warning");
		return service.getAll();
	}

}
