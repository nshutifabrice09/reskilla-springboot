package rw.reskilla_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ReskillaBackendApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to CODM";
	}
	public static void main(String[] args) {
		SpringApplication.run(ReskillaBackendApplication.class, args);
	}

}
