package org.ronaldogonzalez.consumemspokemon.Controller;

import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonGeneration;
import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonMoves;
import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonNumber;
import org.ronaldogonzalez.consumemspokemon.Models.ConsultaPokemonType;
import org.ronaldogonzalez.consumemspokemon.Service.ConsultaPokemonGenerationService;
import org.ronaldogonzalez.consumemspokemon.Service.ConsultaPokemonMovesService;
import org.ronaldogonzalez.consumemspokemon.Service.ConsultaPokemonNumberService;
import org.ronaldogonzalez.consumemspokemon.Service.ConsultaPokemonTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @Autowired
    @Qualifier("serviceFeign")
    private ConsultaPokemonNumberService consultaPokemonNumberService;

    @Autowired
    @Qualifier("serviceFeign1")
    private ConsultaPokemonMovesService consultaPokemonMovesService;

    @Autowired
    @Qualifier("serviceFeign2")
    private ConsultaPokemonTypeService consultaPokemonTypeService;

    @Autowired
    @Qualifier("serviceFeign3")
    private ConsultaPokemonGenerationService consultaPokemonGenerationService;

    @GetMapping("/pokemon/{number}")
    public ConsultaPokemonNumber consulta1(@PathVariable String number) {
        return consultaPokemonNumberService.findByNumber(number);
    }

    @GetMapping("/pokemon/moves/{number}")
    public ConsultaPokemonMoves consulta4(@PathVariable String number) {
        return consultaPokemonMovesService.findByNumber(number);
    }

    @GetMapping("/pokemon/type/{type}")
    public ConsultaPokemonType consulta2(@PathVariable String type) {
        return consultaPokemonTypeService.findByType(type);
    }

    @GetMapping("/generation/{id}")
    public ConsultaPokemonGeneration consulta3(@PathVariable String id) {
        return consultaPokemonGenerationService.findById(id);
    }

}