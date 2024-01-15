package org.ronaldogonzalez.consumemspokemon.Models;

import com.fasterxml.jackson.annotation.*;
import org.ronaldogonzalez.pokemon.entity.MainRegion;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "main_region",
        "pokemon_species"
})

public class PokemonGeneration {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("main_region")
    private MainRegion mainRegion;
    @JsonProperty("name")
    private String name;
    @JsonProperty("pokemon_species")
    private List<Object> pokemonSpecies;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("main_region")
    public MainRegion getMainRegion() {
        return mainRegion;
    }

    @JsonProperty("main_region")
    public void setMainRegion(MainRegion mainRegion) {
        this.mainRegion = mainRegion;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("pokemon_species")
    public List<Object> getPokemonSpecies() {
        return pokemonSpecies;
    }

    @JsonProperty("pokemon_species")
    public void setPokemonSpecies(List<Object> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

}