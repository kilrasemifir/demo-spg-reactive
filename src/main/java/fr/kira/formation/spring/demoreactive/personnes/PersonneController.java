package fr.kira.formation.spring.demoreactive.personnes;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("personnes")
public class PersonneController {

    private final PersonneService service;

    public PersonneController(PersonneService service) {
        this.service = service;
    }

    @PostMapping
    public Mono<Personne> save(@RequestBody Personne entity) {
        return service.save(entity);
    }

    @GetMapping("{id}")
    public Mono<Personne> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public Flux<Personne> findAll() {
        return service.findAll();
    }

    @DeleteMapping("{id}")
    public Mono<Void> deleteById(@PathVariable Long id) {
        return service.deleteById(id);
    }
}
