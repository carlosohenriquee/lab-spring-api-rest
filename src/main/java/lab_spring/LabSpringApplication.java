package lab_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabSpringApplication.class, args);
	}

}
