package com.example.ttest;

import com.example.ttest.config.OConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(OConfig.class)
public class TtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TtestApplication.class, args);
	}
}
