package org.ronaldogonzalez.consumemspokemon.Service;

import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonMoves;
import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonNumber;
import org.ronaldogonzalez.consumemspokemon.Models.PokemonMoves;
import org.ronaldogonzalez.consumemspokemon.Models.PokemonNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service("serviceRestTemplate1")
public class ConsultaPokemonMovesServiceImpl implements ConsultaPokemonMovesService {
    @Autowired
    private RestTemplate clienteRest;

    @Override
    public ConsultaPokemonMoves findByNumber(String number) {
        Map<String, String> pathVariables = new HashMap<String, String>();
        pathVariables.put("number", number);
        PokemonMoves pokemonMoves = clienteRest.getForObject("http://servicio-api-pokemon/pokedex/{number}", PokemonMoves.class, pathVariables);
        return new ConsultaPokemonMoves(pokemonMoves);
    }
}

