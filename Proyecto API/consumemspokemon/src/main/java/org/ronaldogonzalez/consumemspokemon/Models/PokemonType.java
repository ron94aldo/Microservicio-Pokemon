package org.ronaldogonzalez.consumemspokemon.Models;

import com.fasterxml.jackson.annotation.*;
import org.ronaldogonzalez.pokemon.entity.DamageRelations;
import org.ronaldogonzalez.pokemon.entity.MoveDamageClass;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "damage_relations",
        "move_damage_class",
        "moves",
        "pokemon"
})

public class PokemonType {

    @JsonProperty("damage_relations")
    private DamageRelations damageRelations;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("move_damage_class")
    private MoveDamageClass moveDamageClass;
    @JsonProperty("moves")
    private List<Object> moves;
    @JsonProperty("name")
    private String name;
    @JsonProperty("pokemon")
    private List<Object> pokemon;

    @JsonProperty("damage_relations")
    public DamageRelations getDamageRelations() {
        return damageRelations;
    }

    @JsonProperty("damage_relations")
    public void setDamageRelations(DamageRelations damageRelations) {
        this.damageRelations = damageRelations;
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

    @JsonProperty("pokemon")
    public List<Object> getPokemon() {
        return pokemon;
    }

    @JsonProperty("pokemon")
    public void setPokemon(List<Object> pokemon) {
        this.pokemon = pokemon;
    }

}