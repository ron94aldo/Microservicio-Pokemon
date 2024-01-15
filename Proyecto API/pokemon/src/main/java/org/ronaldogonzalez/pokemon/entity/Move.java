package org.ronaldogonzalez.pokemon.entity;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "move"
})
@Generated("jsonschema2pojo")
public class Move {

    @JsonProperty("move")
    private MoveName move;

    @JsonProperty("move")
    public MoveName getMove() {
        return move;
    }

    @JsonProperty("move")
    public void setMove(MoveName move) {
        this.move = move;
    }

}
