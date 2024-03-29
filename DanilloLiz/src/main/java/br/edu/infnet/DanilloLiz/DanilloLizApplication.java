  package br.edu.infnet.DanilloLiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DanilloLizApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanilloLizApplication.class, args);
	}

}
