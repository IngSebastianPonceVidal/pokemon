package gml.pokemon.pokemon.dbpokemon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PokemonDetailsCommandRunner implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private PokemonDetailsRepository pokemonDetailsRepository;


    public PokemonDetailsCommandRunner(PokemonDetailsRepository pokemonDetailsRepository) {
        this.pokemonDetailsRepository = pokemonDetailsRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
