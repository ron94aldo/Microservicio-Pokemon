package org.ronaldogonzalez.consumemspokemon.Models;

public class ConsultaPokemonMoves {

    private PokemonMoves pokemonMoves;

    public PokemonMoves getPokemonMoves() {
        return pokemonMoves;
    }

    public void setPokemonMoves(PokemonMoves pokemonMoves) {
        this.pokemonMoves = pokemonMoves;
    }

    public ConsultaPokemonMoves(PokemonMoves pokemonMoves) {
        this.pokemonMoves = pokemonMoves;
    }

    public ConsultaPokemonMoves() {
    }
}
