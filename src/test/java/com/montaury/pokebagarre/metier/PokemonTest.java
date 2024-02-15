package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
public void pokemon1_GanantSiMeilleurAttaque(){
    //GIVEN
    Pokemon pokemon1 = new Pokemon("poke1","",new Stats(20,20));
    Pokemon pokemon2 = new Pokemon("poke2","",new Stats(10,10));
    //WHEN
    var result = pokemon1.estVainqueurContre(pokemon2)    ;
    //THEN
    assertEquals(true,result);

}
    @Test
    public void pokemon2_GanantSiMeilleurAttaque(){
        //GIVEN
        Pokemon pokemon1 = new Pokemon("poke1","",new Stats(10,20));
        Pokemon pokemon2 = new Pokemon("poke2","",new Stats(20,10));
        //WHEN
        var result = pokemon2.estVainqueurContre(pokemon1)    ;
        //THEN
        assertEquals(true,result);

    }

    @Test
    public void pokemon1_GanantSiMeilleurDefense(){
        //GIVEN
        Pokemon pokemon1 = new Pokemon("poke1","",new Stats(10,20));
        Pokemon pokemon2 = new Pokemon("poke2","",new Stats(10,10));
        //WHEN
        var result = pokemon1.estVainqueurContre(pokemon2)    ;
        //THEN
        assertEquals(true,result);

    }

    @Test
    public void pokemon2_GanantSiMeilleurDefense(){
        //GIVEN
        Pokemon pokemon1 = new Pokemon("poke1","",new Stats(10,10));
        Pokemon pokemon2 = new Pokemon("poke2","",new Stats(10,20));
        //WHEN
        var result = pokemon2.estVainqueurContre(pokemon1)    ;
        //THEN
        assertEquals(true,result);

    }
    @Test
    public void pokemonGanantSiSaisiePremier(){
        //GIVEN
        Pokemon pokemon1 = new Pokemon("poke1","",new Stats(10,10));
        Pokemon pokemon2 = new Pokemon("poke2","",new Stats(10,10));
        //WHEN
        var result = pokemon1.estVainqueurContre(pokemon2)    ;
        //THEN
        assertEquals(true,result);

    }
}