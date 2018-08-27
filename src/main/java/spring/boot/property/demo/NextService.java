/**
 * 
 */
package spring.boot.property.demo;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gselvaratnam
 *
 */
@RestController
@PropertySource(value="classpath:test.properties")
public class NextService {

	private static final Logger logger = LogManager.getLogger(NextService.class);

	@Value("${the.value.from.file}")
	private String theValue;

	@Value("${the.new.value.from.file}")
	private String theNewValue;

	@PostConstruct
	public void helloWorld() {
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("theValue : " + theValue);
		System.out.println("theNewValue : " + theNewValue);
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
	}

	@RequestMapping("/hello-world")
	public String sayHello() {
		logger.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		logger.info("                         SAY HELLO                           ");
		logger.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		return "SayHello";
	}
}
