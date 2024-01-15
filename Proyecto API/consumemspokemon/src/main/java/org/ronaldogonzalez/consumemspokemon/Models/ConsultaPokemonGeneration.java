package org.ronaldogonzalez.consumemspokemon.Models;

public class ConsultaPokemonGeneration {

    private PokemonGeneration pokemonGeneration;

    public ConsultaPokemonGeneration() {
    }

    public ConsultaPokemonGeneration(PokemonGeneration pokemonGeneration) {
        this.pokemonGeneration = pokemonGeneration;
    }

    public PokemonGeneration getPokemonGeneration() {
        return pokemonGeneration;
    }

    public void setPokemonGeneration(PokemonGeneration pokemonGeneration) {
        this.pokemonGeneration = pokemonGeneration;
    }
}
