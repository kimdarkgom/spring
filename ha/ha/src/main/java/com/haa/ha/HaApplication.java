package com.haa.ha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class HaApplication {
	public static void main(String[] args) {
		SpringApplication.run(HaApplication.class, args);
	}

}
