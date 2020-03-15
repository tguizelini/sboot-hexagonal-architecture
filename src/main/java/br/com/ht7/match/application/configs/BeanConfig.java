package br.com.ht7.match.application.configs;

import br.com.ht7.match.domain.ports.presenters.MatchPresenter;
import br.com.ht7.match.domain.services.MatchService;
import br.com.ht7.match.infrastructure.adapters.MatchRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    MatchPresenter matchPresenter(MatchRepositoryAdapter repositoryAdapter) {
        return new MatchService(repositoryAdapter);
    }
}
