package br.com.ht7.match.domain.services;

import br.com.ht7.match.domain.Match;
import br.com.ht7.match.domain.ports.repositories.MatchRepository;
import br.com.ht7.match.domain.ports.presenters.MatchPresenter;

import java.util.List;
import java.util.Optional;

public class MatchService implements MatchPresenter {
    private MatchRepository repository;

    public MatchService(MatchRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Match> getById(String id) {
        return repository.getById(id);
    }

    @Override
    public void delete(Match match) {
        repository.delete(match);
    }

    @Override
    public List<Match> list() {
        return repository.listFromCache();
    }

    @Override
    public Match save(Match match) {
        return repository.save(match);
    }
}
