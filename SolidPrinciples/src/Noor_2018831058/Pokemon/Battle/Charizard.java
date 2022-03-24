package Noor_2018831058.Pokemon.Battle;

public class Charizard extends Powers implements FireTypeSkill, UltimateSkill {

    @Override
    public String flamethrower() {
        return "Charizard used flamethrower";
    }

    @Override
    public String useUltimateSKill() {
        return "Charrizard used ultimate skill Heastblast";
    }

    @Override
    public String power() {
        return "Charizard has power 150";
    }

    @Override
    public String electric() {
        return null;
    }

    @Override
    public String fire() {
        return "Charizard is a fire type pokemon";
    }

    @Override
    public String psychic() {
        return null;
    }
}
