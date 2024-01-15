package org.ronaldogonzalez.consumemspokemon.ClientRest;


import org.ronaldogonzalez.consumemspokemon.Models.PokemonGeneration;
import org.ronaldogonzalez.consumemspokemon.Models.PokemonMoves;
import org.ronaldogonzalez.consumemspokemon.Models.PokemonNumber;
import org.ronaldogonzalez.consumemspokemon.Models.PokemonType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "servicio-api-pokemon")
public interface PokemonClientRest {

    @GetMapping("/pokedex/{number}")
    public PokemonNumber consulta1(@PathVariable String number);

    @GetMapping("/pokedex/{number}")
    public PokemonMoves consulta4(@PathVariable String number);

    @GetMapping("/tipo/{type}")
    public PokemonType consulta2(@PathVariable String type);

    @GetMapping("/generacion/{id}")
    public PokemonGeneration consulta3(@PathVariable String id);

}