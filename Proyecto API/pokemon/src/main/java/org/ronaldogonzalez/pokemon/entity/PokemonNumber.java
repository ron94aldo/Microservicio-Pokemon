package org.ronaldogonzalez.pokemon.entity;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "abilities",
        "base_experience",
        "forms",
        "game_indices",
        "height",
        "held_items",
        "id",
        "is_default",
        "location_area_encounters",
        "moves",
        "order",
        "past_abilities",
        "past_types",
        "species",
        "sprites",
        "stats",
        "types",
        "weight"
})

public class PokemonNumber {

    @JsonProperty("abilities")
    private List<Object> abilities;
    @JsonProperty("base_experience")
    private Integer baseExperience;
    @JsonProperty("forms")
    private List<Object> forms;
    @JsonProperty("game_indices")
    private List<Object> gameIndices;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("held_items")
    private List<Object> heldItems;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("is_default")
    private Boolean isDefault;
    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters;
    @JsonProperty("moves")
    private List<Move> moves;
    @JsonProperty("name")
    private String name;
    @JsonProperty("order")
    private Integer order;
    @JsonProperty("past_abilities")
    private List<Object> pastAbilities;
    @JsonProperty("past_types")
    private List<Object> pastTypes;
    @JsonProperty("species")
    private Species species;
    @JsonProperty("sprites")
    private Sprites sprites;
    @JsonProperty("stats")
    private List<Object> stats;
    @JsonProperty("types")
    private List<Object> types;
    @JsonProperty("weight")
    private Integer weight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("abilities")
    public List<Object> getAbilities() {
        return abilities;
    }

    @JsonProperty("abilities")
    public void setAbilities(List<Object> abilities) {
        this.abilities = abilities;
    }

    @JsonProperty("base_experience")
    public Integer getBaseExperience() {
        return baseExperience;
    }

    @JsonProperty("base_experience")
    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    @JsonProperty("forms")
    public List<Object> getForms() {
        return forms;
    }

    @JsonProperty("forms")
    public void setForms(List<Object> forms) {
        this.forms = forms;
    }

    @JsonProperty("game_indices")
    public List<Object> getGameIndices() {
        return gameIndices;
    }

    @JsonProperty("game_indices")
    public void setGameIndices(List<Object> gameIndices) {
        this.gameIndices = gameIndices;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("held_items")
    public List<Object> getHeldItems() {
        return heldItems;
    }

    @JsonProperty("held_items")
    public void setHeldItems(List<Object> heldItems) {
        this.heldItems = heldItems;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("is_default")
    public Boolean getIsDefault() {
        return isDefault;
    }

    @JsonProperty("is_default")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @JsonProperty("location_area_encounters")
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    @JsonProperty("location_area_encounters")
    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    @JsonProperty("moves")
    public List<Move> getMoves() {
        return moves;
    }

    @JsonProperty("moves")
    public void setMoves(List<Move> moves) {
        this.moves = moves;
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

    @JsonProperty("species")
    public Species getSpecies() {
        return species;
    }

    @JsonProperty("species")
    public void setSpecies(Species species) {
        this.species = species;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}