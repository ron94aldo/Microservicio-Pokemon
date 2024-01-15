package org.ronaldogonzalez.consumemspokemon.Models;

import com.fasterxml.jackson.annotation.*;
import org.ronaldogonzalez.pokemon.entity.Sprites;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "types",
        "height",
        "weight",
        "stats",
        "abilities",
        "order",
        "sprites",
        "past_abilities",
        "past_types"
})

public class PokemonNumber {

    @JsonProperty("abilities")
    private List<Object> abilities;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("order")
    private Integer order;
    @JsonProperty("past_abilities")
    private List<Object> pastAbilities;
    @JsonProperty("past_types")
    private List<Object> pastTypes;
    @JsonProperty("sprites")
    private Sprites sprites;
    @JsonProperty("stats")
    private List<Object> stats;
    @JsonProperty("types")
    private List<Object> types;
    @JsonProperty("weight")
    private Integer weight;


    @JsonProperty("abilities")
    public List<Object> getAbilities() {
        return abilities;
    }

    @JsonProperty("abilities")
    public void setAbilities(List<Object> abilities) {
        this.abilities = abilities;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    @JsonProperty("past_abilities")
    public List<Object> getPastAbilities() {
        return pastAbilities;
    }

    @JsonProperty("past_abilities")
    public void setPastAbilities(List<Object> pastAbilities) {
        this.pastAbilities = pastAbilities;
    }

    @JsonProperty("past_types")
    public List<Object> getPastTypes() {
        return pastTypes;
    }

    @JsonProperty("past_types")
    public void setPastTypes(List<Object> pastTypes) {
        this.pastTypes = pastTypes;
    }

    @JsonProperty("sprites")
    public Sprites getSprites() {
        return sprites;
    }

    @JsonProperty("sprites")
    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    @JsonProperty("stats")
    public List<Object> getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(List<Object> stats) {
        this.stats = stats;
    }

    @JsonProperty("types")
    public List<Object> getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(List<Object> types) {
        this.types = types;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

}