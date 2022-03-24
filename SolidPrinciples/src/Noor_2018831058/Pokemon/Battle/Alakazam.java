package Noor_2018831058.Pokemon.Battle;

public class Alakazam extends Powers implements PsychicTypeSkill, UltimateSkill {

    @Override
    public String hypnosis() {
        return "Alakazam used Hypnosis";
    }

    @Override
    public String useUltimateSKill() {
        return "Alakazam used Ultimate skill Future Sight";
    }

    @Override
    public String power() {
        return "Alakazam has power 135";
    }

    @Override
    public String electric() {
        return null;
    }

    @Override
    public String fire() {
        return null;
    }

    @Override
    public String psychic() {
        return "Alakazam is a psychic type pokemon";
    }
}
