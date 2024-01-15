package org.ronaldogonzalez.consumemspokemon.Service;

import org.ronaldogonzalez.consumemspokemon.ClientRest.PokemonClientRest;
import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceFeign")
public class ConsultaPokemonNumberFeign implements ConsultaPokemonNumberService {

    @Autowired
    private PokemonClientRest clienteFeign;


    @Override
    public ConsultaPokemonNumber findByNumber(String number) {
        return new ConsultaPokemonNumber(clienteFeign.consulta1(number));
    }
}
