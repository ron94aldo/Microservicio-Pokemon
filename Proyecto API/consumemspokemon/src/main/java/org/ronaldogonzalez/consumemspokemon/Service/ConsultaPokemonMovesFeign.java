package org.ronaldogonzalez.consumemspokemon.Service;

import org.ronaldogonzalez.consumemspokemon.ClientRest.PokemonClientRest;
import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonMoves;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceFeign1")
public class ConsultaPokemonMovesFeign implements ConsultaPokemonMovesService {

    @Autowired
    private PokemonClientRest clienteFeign;


    @Override
    public ConsultaPokemonMoves findByNumber(String number) {
        return new ConsultaPokemonMoves(clienteFeign.consulta4(number));
    }
}
