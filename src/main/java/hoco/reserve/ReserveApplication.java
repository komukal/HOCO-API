package hoco.reserve;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hoco.reserve.utils.DemoData;

@SpringBootApplication
public class ReserveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReserveApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(DemoData demoData) {
		return (args) -> {
			demoData.populate();
		};
	}

}
