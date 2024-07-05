package gml.pokemon.pokemon.dbpokemon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PokemonListDB {
    @Id
    @GeneratedValue
    private Long id;

    private int countField;
    private String previousField;
    private String nextField;

    public PokemonListDB() {
    }

    public PokemonListDB(int countField, String previousField, String nextField) {
        this.countField = countField;
        this.previousField = previousField;
        this.nextField = nextField;
    }

    public Long getId() {
        return id;
    }

    public int getCountField() {
        return countField;
    }

    public String getPreviousField() {
        return previousField;
    }

    public String getNextField() {
        return nextField;
    }
}
