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
        "damage_relations",
        "game_indices",
        "generation",
        "id",
        "move_damage_class",
        "moves",
        "names",
        "past_damage_relations",
        "pokemon"
})

public class PokemonType {

    @JsonProperty("damage_relations")
    private DamageRelations damageRelations;
    @JsonProperty("game_indices")
    private List<Object> gameIndices;
    @JsonProperty("generation")
    private Generation generation;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("move_damage_class")
    private MoveDamageClass moveDamageClass;
    @JsonProperty("moves")
    private List<Object> moves;
    @JsonProperty("name")
    private String name;
    @JsonProperty("names")
    private List<Object> names;
    @JsonProperty("past_damage_relations")
    private List<Object> pastDamageRelations;
    @JsonProperty("pokemon")
    private List<Object> pokemon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("damage_relations")
    public DamageRelations getDamageRelations() {
        return damageRelations;
    }

    @JsonProperty("damage_relations")
    public void setDamageRelations(DamageRelations damageRelations) {
        this.damageRelations = damageRelations;
    }

    @JsonProperty("game_indices")
    public List<Object> getGameIndices() {
        return gameIndices;
    }

    @JsonProperty("game_indices")
    public void setGameIndices(List<Object> gameIndices) {
        this.gameIndices = gameIndices;
    }

    @JsonProperty("generation")
    public Generation getGeneration() {
        return generation;
    }

    @JsonProperty("generation")
    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("move_damage_class")
    public MoveDamageClass getMoveDamageClass() {
        return moveDamageClass;
    }

    @JsonProperty("move_damage_class")
    public void setMoveDamageClass(MoveDamageClass moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
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

    @JsonProperty("past_damage_relations")
    public List<Object> getPastDamageRelations() {
        return pastDamageRelations;
    }

    @JsonProperty("past_damage_relations")
    public void setPastDamageRelations(List<Object> pastDamageRelations) {
        this.pastDamageRelations = pastDamageRelations;
    }

    @JsonProperty("pokemon")
    public List<Object> getPokemon() {
        return pokemon;
    }

    @JsonProperty("pokemon")
    public void setPokemon(List<Object> pokemon) {
        this.pokemon = pokemon;
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
