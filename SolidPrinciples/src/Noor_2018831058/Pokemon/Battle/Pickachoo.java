package Noor_2018831058.Pokemon.Battle;

public class Pickachoo extends Powers implements ElectricTypeSkill, UltimateSkill {
    @Override
    public String thundershock() {
        return "Pickachoo used Thundershock";
    }

    @Override
    public String useUltimateSKill() {
        return "Pickachoo used ultimate skill Bolt tackle";
    }

    @Override
    public String power() {
        return "Pickachoo has power 144";
    }

    @Override
    public String electric() {
        return "Pickachoo is an elctric type pokemon";
    }

    @Override
    public String fire() {
        return null;
    }

    @Override
    public String psychic() {
        return null;
    }
}
