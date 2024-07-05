package gml.pokemon.pokemon.dbpokemon;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PokemonDetailsDB {

    @Id
    Long id;
    private String name;
    private String url;

    public PokemonDetailsDB(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
