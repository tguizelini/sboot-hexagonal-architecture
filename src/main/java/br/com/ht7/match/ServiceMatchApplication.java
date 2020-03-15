package br.com.ht7.match;

import br.com.ht7.match.domain.ports.repositories.MatchRepository;
import br.com.ht7.match.domain.Match;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootApplication
@EnableResourceServer
public class ServiceMatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMatchApplication.class, args);
	}

	@Bean
	CommandLineRunner seed(MatchRepository repository) {
		return args -> {
			List<Match> matches = new ArrayList<Match>();

			matches.add(new Match(null, "A x B"));
			matches.add(new Match(null, "AB x C"));
			matches.add(new Match(null, "AVV x YL"));

			matches.forEach(repository::save);

			log.info("Matches created");
		};
	}

}
