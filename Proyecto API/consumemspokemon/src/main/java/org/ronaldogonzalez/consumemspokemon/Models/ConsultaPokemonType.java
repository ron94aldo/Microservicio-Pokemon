package org.ronaldogonzalez.consumemspokemon.Models;

public class ConsultaPokemonType {

    private PokemonType pokemonType;

    public ConsultaPokemonType() {
    }

    public ConsultaPokemonType(PokemonType pokemonType) {
        this.pokemonType = pokemonType;
    }

    public PokemonType getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(PokemonType pokemonType) {
        this.pokemonType = pokemonType;
    }
}
