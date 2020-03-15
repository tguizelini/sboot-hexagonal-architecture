package br.com.ht7.match.application.adapters;

import br.com.ht7.match.domain.Match;
import br.com.ht7.match.domain.ports.presenters.MatchPresenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("matches/")
public class MatchControllerAdapter implements MatchPresenter {
    private MatchPresenter presenter;

    @Autowired
    public MatchControllerAdapter(MatchPresenter presenter) {
        this.presenter = presenter;
    }

    @Override @GetMapping("id/{id}")
    public Optional<Match> getById(@PathVariable String id) {
        return presenter.getById(id);
    }

    @Override @GetMapping()
    public List<Match> list() {
        return presenter.list();
    }

    @Override @PostMapping
    public Match save(@Validated @RequestBody Match match) {
        return presenter.save(match);
    }

    @Override
    public void delete(Match match) {
        presenter.delete(match);
    }
}
