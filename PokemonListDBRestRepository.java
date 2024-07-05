package gml.pokemon.pokemon.dbpokemon;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PokemonListDBRestRepository extends PagingAndSortingRepository<PokemonListDB, Long> {
    List<PokemonListDB> findAll();
}
