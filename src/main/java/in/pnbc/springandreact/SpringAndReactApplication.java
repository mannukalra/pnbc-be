package in.pnbc.springandreact;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAndReactApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringAndReactApplication.class, args);
		SpringApplication app = new SpringApplication(SpringAndReactApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8008"));
        
        app.run(args);
	}
}
