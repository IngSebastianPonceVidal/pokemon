package gml.pokemon.pokemon.dbpokemon;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PokemonListDBRepository extends JpaRepository<PokemonListDB,Long> {
  List<PokemonListDB> findAll();
}
