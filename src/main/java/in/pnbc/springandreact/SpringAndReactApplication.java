package in.pnbc.springandreact;

import java.util.Base64;
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


//		showEncriptedPwd("test);
	}

	private static void showEncriptedPwd(String s){
		String b64encoded = Base64.getEncoder().encodeToString(s.getBytes());
		System.out.println(b64encoded);

		//for decreption
		/*String actual = new String(Base64.getDecoder().decode(b64encoded));
		System.out.println(actual);*/
	}
}
