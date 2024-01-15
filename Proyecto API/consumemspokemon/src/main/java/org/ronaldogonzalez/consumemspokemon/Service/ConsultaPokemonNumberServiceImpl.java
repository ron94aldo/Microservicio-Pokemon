package org.ronaldogonzalez.consumemspokemon.Service;

import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonNumber;
import org.ronaldogonzalez.consumemspokemon.Models.PokemonMoves;
import org.ronaldogonzalez.consumemspokemon.Models.PokemonNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service("serviceRestTemplate")
public class ConsultaPokemonNumberServiceImpl implements ConsultaPokemonNumberService {
    @Autowired
    private RestTemplate clienteRest;

    @Override
    public ConsultaPokemonNumber findByNumber(String number) {
        Map<String, String> pathVariables = new HashMap<String, String>();
        pathVariables.put("number", number);
        PokemonNumber pokemonNumber = clienteRest.getForObject("http://servicio-api-pokemon/pokedex/{number}", PokemonNumber.class, pathVariables);
        return new ConsultaPokemonNumber(pokemonNumber);
    }
}

