package com.example.WebRTC;

import com.example.WebRTC.User.User;
import com.example.WebRTC.User.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebRtcApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebRtcApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
							.username("Thushanka")
							.email("tpjk@gmail.com")
							.password("123")
					.build());

			service.register(User.builder()
					.username("Pramuka")
					.email("pramuka@gmail.com")
					.password("12345")
					.build());

			service.register(User.builder()
					.username("Dinushanka")
					.email("dinushanka@gmail.com")
					.password("12345")
					.build());
			service.register(User.builder()
					.username("Luthira")
					.email("luthira@gmail.com")
					.password("12345")
					.build());
		};
	}
}
