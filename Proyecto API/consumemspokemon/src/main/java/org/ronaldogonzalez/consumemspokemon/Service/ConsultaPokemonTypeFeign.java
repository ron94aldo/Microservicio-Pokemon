package org.ronaldogonzalez.consumemspokemon.Service;

import org.ronaldogonzalez.consumemspokemon.ClientRest.PokemonClientRest;
import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceFeign2")
public class ConsultaPokemonTypeFeign implements ConsultaPokemonTypeService {

    @Autowired
    private PokemonClientRest clienteFeign;


    @Override
    public ConsultaPokemonType findByType(String type) {
        return new ConsultaPokemonType(clienteFeign.consulta2(type));
    }
}
