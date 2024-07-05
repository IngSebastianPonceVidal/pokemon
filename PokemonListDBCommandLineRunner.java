package gml.pokemon.pokemon.dbpokemon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PokemonListDBCommandLineRunner implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private PokemonListDBRepository pokemonListDBRepository;

    public PokemonListDBCommandLineRunner(PokemonListDBRepository pokemonListDBRepository) {
        this.pokemonListDBRepository = pokemonListDBRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        pokemonListDBRepository.save(new PokemonListDB(1302,"","https://pokeapi.co/api/v2/pokemon?offset=20&limit=20"));
        List<PokemonListDB> pokemons = pokemonListDBRepository.findAll();
    }
}
