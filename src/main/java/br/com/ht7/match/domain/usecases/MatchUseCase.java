package br.com.ht7.match.domain.usecases;

import br.com.ht7.match.domain.usecases.matches.MatchDeleteUseCase;
import br.com.ht7.match.domain.usecases.matches.MatchGetUseCase;
import br.com.ht7.match.domain.usecases.matches.MatchListUseCase;
import br.com.ht7.match.domain.usecases.matches.MatchSaveUseCase;

public interface MatchUseCase extends MatchGetUseCase, MatchSaveUseCase, MatchListUseCase, MatchDeleteUseCase {

}
