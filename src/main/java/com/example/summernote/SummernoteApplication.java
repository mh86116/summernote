package com.example.summernote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SummernoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SummernoteApplication.class, args);
	}

	@Bean(name = "uploadPath")
	public String uploadPath() {
		return "d:/study/summernote/src/main/resources/static/image/";
	}
}
