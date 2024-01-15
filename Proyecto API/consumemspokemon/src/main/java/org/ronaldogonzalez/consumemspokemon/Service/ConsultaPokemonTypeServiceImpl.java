package org.ronaldogonzalez.consumemspokemon.Service;

import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonType;
import org.ronaldogonzalez.consumemspokemon.Models.PokemonType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service("serviceRestTemplate2")
public class ConsultaPokemonTypeServiceImpl implements ConsultaPokemonTypeService {
    @Autowired
    private RestTemplate clienteRest;

    @Override
    public ConsultaPokemonType findByType(String type) {
        Map<String, String> pathVariables = new HashMap<String, String>();
        pathVariables.put("type", type);
        PokemonType pokemonType = clienteRest.getForObject("http://servicio-api-pokemon/tipo/{type}", PokemonType.class, pathVariables);
        return new ConsultaPokemonType(pokemonType);
    }
}

