package br.com.ht7.match.domain.usecases;

import br.com.ht7.match.domain.Match;

import java.util.List;
import java.util.Optional;

public interface MatchUseCase {
    void delete(Match match);
    Optional<Match> getById(String id);
    List<Match> list();
    Match save(Match match);
}
