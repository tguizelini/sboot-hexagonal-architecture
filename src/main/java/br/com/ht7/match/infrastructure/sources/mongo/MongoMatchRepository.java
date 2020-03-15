package br.com.ht7.match.infrastructure.sources.mongo;

import br.com.ht7.match.domain.Match;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoMatchRepository extends MongoRepository<Match, String> {
}
