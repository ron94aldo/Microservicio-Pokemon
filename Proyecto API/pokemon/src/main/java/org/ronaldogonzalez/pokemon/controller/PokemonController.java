package org.ronaldogonzalez.pokemon.controller;

import org.ronaldogonzalez.pokemon.entity.PokemonGeneration;
import org.ronaldogonzalez.pokemon.entity.PokemonNumber;
import org.ronaldogonzalez.pokemon.entity.PokemonType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PokemonController {

    @GetMapping("/pokedex/{number}")
    public PokemonNumber consulta1 (@PathVariable("number") String number) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PokemonNumber> resp =
                restTemplate
                        .getForEntity(
                                String.format("https://pokeapi.co/api/v2/pokemon/%s", number),
                                PokemonNumber.class);
        return resp.getBody();
    }

    @GetMapping("/tipo/{type}")
    public PokemonType consulta2 (@PathVariable("type") String type) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PokemonType> resp =
                restTemplate
                        .getForEntity(
                                String.format("https://pokeapi.co/api/v2/type/%s", type),
                                PokemonType.class);
        return resp.getBody();
    }

    @GetMapping("/generacion/{id}")
    public PokemonGeneration consulta3 (@PathVariable("id") String id) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PokemonGeneration> resp =
                restTemplate
                        .getForEntity(
                                String.format("https://pokeapi.co/api/v2/generation/%s", id),
                                PokemonGeneration.class);
        return resp.getBody();
    }

}
