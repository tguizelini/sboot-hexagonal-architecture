package br.com.ht7.match.domain.usecases.matches;

import br.com.ht7.match.domain.Match;

import java.util.Optional;

public interface MatchGetUseCase {
    Optional<Match> getById(String id);
}
