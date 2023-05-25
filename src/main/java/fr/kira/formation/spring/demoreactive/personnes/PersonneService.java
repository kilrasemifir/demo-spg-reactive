package fr.kira.formation.spring.demoreactive.personnes;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonneService {

    private final PersonneRepository repository;

    public PersonneService(PersonneRepository repository) {
        this.repository = repository;
    }

    public  Mono<Personne> save(Personne entity) {
        return repository.save(entity);
    }

    public Mono<Personne> findById(Long aLong) {
        return repository.findById(aLong);
    }

    public Flux<Personne> findAll() {
        return repository.findAll();
    }

    public Mono<Void> deleteById(Long aLong) {
        return repository.deleteById(aLong);
    }
}
