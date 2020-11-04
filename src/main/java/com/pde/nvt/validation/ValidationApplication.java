package com.pde.nvt.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class ValidationApplication.
 * @author Debadatta Mishra
 */
@EnableAspectJAutoProxy
@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = { "com.pde.nvt" })
public class ValidationApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ValidationApplication.class, args);
	}

}
