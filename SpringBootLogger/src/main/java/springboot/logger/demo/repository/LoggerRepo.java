package springboot.logger.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.logger.demo.model.LoggerDemo;

@Repository
public interface LoggerRepo extends JpaRepository<LoggerDemo, Integer>
{

	List<LoggerDemo> findAll();

}
