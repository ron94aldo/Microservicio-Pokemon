package org.ronaldogonzalez.consumemspokemon.Service;

import org.ronaldogonzalez.consumemspokemon.ClientRest.PokemonClientRest;
import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonGeneration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceFeign3")
public class ConsultaPokemonGenerationFeign implements ConsultaPokemonGenerationService {

    @Autowired
    private PokemonClientRest clienteFeign;

    @Override
    public ConsultaPokemonGeneration findById(String id){
        return new ConsultaPokemonGeneration(clienteFeign.consulta3(id));
    }
}