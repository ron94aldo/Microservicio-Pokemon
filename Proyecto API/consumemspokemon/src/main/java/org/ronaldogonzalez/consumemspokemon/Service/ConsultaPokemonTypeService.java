package org.ronaldogonzalez.consumemspokemon.Service;

import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonType;

public interface ConsultaPokemonTypeService {

    public ConsultaPokemonType findByType(String type);
}