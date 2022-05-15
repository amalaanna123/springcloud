package com.cloud.server;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/insurance-service")
public class SpringbootCloudServerApplication {
	@GetMapping("/getUpdatePlans")
	public List<String> getPlans(){
		return Stream.of("Permium","Gold","Platinum").collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudServerApplication.class, args);
	}

}
