package br.com.ht7.match.infrastructure.adapters;

import br.com.ht7.match.domain.Match;
import br.com.ht7.match.domain.ports.repositories.MatchRepository;
import br.com.ht7.match.infrastructure.sources.mongo.MongoMatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MatchRepositoryAdapter implements MatchRepository {
    private MongoMatchRepository repository;

    @Autowired
    public MatchRepositoryAdapter(MongoMatchRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Match> getById(String id) {
        return repository.findById(id);
    }

    @Override
    public List<Match> list() {
        return repository.findAll();
    }

    @Override
    public Match save(Match match) {
        return repository.save(match);
    }

    @Override
    public void delete(Match match) {
        repository.delete(match);
    }

    @Override
    public List<Match> listFromCache() {
        return null;
    }
}
