package fr.kira.formation.spring.demoreactive.personnes;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Personne {
    @Id
    private long id;
    private String nom;
    private String prenom;
}
