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
        "id",
        "name",
        "main_region",
        "pokemon_species",
        "abilities",
        "moves",
        "names",
        "types",
        "version_groups"
})

public class PokemonGeneration {

    @JsonProperty("abilities")
    private List<Object> abilities;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("main_region")
    private MainRegion mainRegion;
    @JsonProperty("moves")
    private List<Object> moves;
    @JsonProperty("name")
    private String name;
    @JsonProperty("names")
    private List<Object> names;
    @JsonProperty("pokemon_species")
    private List<Object> pokemonSpecies;
    @JsonProperty("types")
    private List<Object> types;
    @JsonProperty("version_groups")
    private List<Object> versionGroups;
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

    @JsonProperty("moves")
    public List<Object> getMoves() {
        return moves;
    }

    @JsonProperty("moves")
    public void setMoves(List<Object> moves) {
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

    @JsonProperty("names")
    public List<Object> getNames() {
        return names;
    }

    @JsonProperty("names")
    public void setNames(List<Object> names) {
        this.names = names;
    }

    @JsonProperty("pokemon_species")
    public List<Object> getPokemonSpecies() {
        return pokemonSpecies;
    }

    @JsonProperty("pokemon_species")
    public void setPokemonSpecies(List<Object> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    @JsonProperty("types")
    public List<Object> getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(List<Object> types) {
        this.types = types;
    }

    @JsonProperty("version_groups")
    public List<Object> getVersionGroups() {
        return versionGroups;
    }

    @JsonProperty("version_groups")
    public void setVersionGroups(List<Object> versionGroups) {
        this.versionGroups = versionGroups;
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
