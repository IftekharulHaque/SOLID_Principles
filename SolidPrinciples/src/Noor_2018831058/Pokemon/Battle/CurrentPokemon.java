package Noor_2018831058.Pokemon.Battle;

//Here is and example of Open-closed principle
//Here is and example of dependency inversion principle
public class CurrentPokemon implements UltimateSkill {
    public static void main(String[] args) {
        HP pokemonHP = new HP();
        Level pokemonLevel = new Level();
        DPS pokemonDPS = new DPS();
        CurrentPokemon cp = new CurrentPokemon();

        System.out.println(cp.useUltimateSKill());

        pokemonHP.hp();
        pokemonLevel.level();
        pokemonDPS.dps();

        Charizard charizard = new Charizard();
        Pickachoo pickachoo = new Pickachoo();
        Alakazam alakazam = new Alakazam();
//Here is an Example of Interface Segregation principle

        System.out.println(charizard.fire());
        System.out.println(charizard.flamethrower());
        System.out.println(charizard.useUltimateSKill());
        System.out.println(charizard.power());



        System.out.println(pickachoo.electric());
        System.out.println(pickachoo.thundershock());
        System.out.println(pickachoo.useUltimateSKill());
        System.out.println(pickachoo.power());


        System.out.println(alakazam.psychic());
        System.out.println(alakazam.hypnosis());
        System.out.println(alakazam.useUltimateSKill());
        System.out.println(alakazam.power());



    }


    @Override
    public String useUltimateSKill() {
        return "Current pokemon used ultimate skill";
    }
}

//Here is an example of Single Responsibility Principle
class HP {
    void hp() {
        System.out.println("Current Pokemon has 700 HP");
    }
}

class Level {
    void level() {
        System.out.println("Current Pokemon is of level 37");
    }
}

class DPS {
    void dps() {
        System.out.println("Current pokemon as 55 dps");
    }
}
