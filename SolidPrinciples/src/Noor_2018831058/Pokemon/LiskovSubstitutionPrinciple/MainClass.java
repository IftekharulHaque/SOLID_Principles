package Noor_2018831058.Pokemon.LiskovSubstitutionPrinciple;

public class MainClass {

    public static void main(String[] args) {
        Pokemon poke = new Pokemon();
        pokedex(poke);
        Pokemon squirtle = new Squirtle();
        pokedex(squirtle);
        Pokemon bulbasaur = new Bulbasaur();
        pokedex(bulbasaur);

    }


    public static void pokedex(Pokemon p) {
        p.hp();
        p.level();

    }


}
