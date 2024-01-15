package org.ronaldogonzalez.consumemspokemon.Service;

import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonGeneration;
import org.ronaldogonzalez.consumemspokemon.Models.PokemonGeneration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service("serviceRestTemplate3")
public class ConsultaPokemonGenerationServiceImpl implements ConsultaPokemonGenerationService {
    @Autowired
    private RestTemplate clienteRest;

    @Override
    public ConsultaPokemonGeneration findById(String id) {
        Map<String, String> pathVariables = new HashMap<String, String>();
        pathVariables.put("id", id);
        PokemonGeneration pokemonGeneration = clienteRest.getForObject("http://servicio-api-pokemon/generacion/{id}", PokemonGeneration.class, pathVariables);
        return new ConsultaPokemonGeneration(pokemonGeneration);
    }
}

