package gml.pokemon.pokemon.list;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PokemonService {

    private static List<PokemonList> pokemons = new ArrayList<>();

    static {
        ResultClass r1 = new ResultClass("sigilyph","https://pokeapi.co/api/v2/pokemon/561/");
        ResultClass r2 = new ResultClass("yamask","https://pokeapi.co/api/v2/pokemon/562/");
        ResultClass r3 = new ResultClass("cofagrigus","https://pokeapi.co/api/v2/pokemon/563/");

        List<ResultClass> questions = new ArrayList<>(Arrays.asList(r1,
                r2, r3));

        PokemonList pokemon = new PokemonList("https://pokeapi.co/api/v2/pokemon?offset=580&limit=20",
                "https://pokeapi.co/api/v2/pokemon?offset=540&limit=20"
                ,1302,
                questions);
        pokemons.add(pokemon);
    }

    public List<PokemonList> retrieveAllPokemon()
    {
        return pokemons;
    }
}
