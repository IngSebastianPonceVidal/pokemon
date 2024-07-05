package gml.pokemon.pokemon.list;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokemonResource {
    private  PokemonService pokemonService;

    public PokemonResource(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @RequestMapping("/pokemons")
    public List<PokemonList> retrieveAllPokemon(){
        List<PokemonList> pokemons = pokemonService.retrieveAllPokemon();
        return pokemons;
    }
}
