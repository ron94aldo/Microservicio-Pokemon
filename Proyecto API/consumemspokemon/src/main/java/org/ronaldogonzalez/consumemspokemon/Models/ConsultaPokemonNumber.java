package org.ronaldogonzalez.consumemspokemon.Models;

public class ConsultaPokemonNumber {

    private PokemonNumber pokemonNumber;

    public ConsultaPokemonNumber() {
    }

    public ConsultaPokemonNumber(PokemonNumber pokemon) {
        this.pokemonNumber = pokemon;
    }

    public PokemonNumber getPokemon() {
        return pokemonNumber;
    }

    public void setPokemon(PokemonNumber pokemon) {
        this.pokemonNumber = pokemon;
    }

}