package br.com.ht7.match.domain.ports.repositories;

import br.com.ht7.match.domain.Match;
import br.com.ht7.match.domain.usecases.MatchUseCase;

import java.util.List;

public interface MatchRepository extends MatchUseCase {
    List<Match> listFromCache();
}
