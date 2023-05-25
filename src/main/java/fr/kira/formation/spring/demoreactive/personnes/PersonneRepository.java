package fr.kira.formation.spring.demoreactive.personnes;


import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface PersonneRepository extends R2dbcRepository<Personne, Long> {

}
