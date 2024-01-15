package org.ronaldogonzalez.consumemspokemon.Models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.ronaldogonzalez.pokemon.entity.Move;
import org.ronaldogonzalez.pokemon.entity.MoveName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "types",
        "moves"
})

public class PokemonMoves {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("moves")
    private List<Move> moves;
    @JsonProperty("name")
    private String name;
    @JsonProperty("types")
    private List<Object> types;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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

    @JsonProperty("types")
    public List<Object> getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(List<Object> types) {
        this.types = types;
    }

}