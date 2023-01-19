public class Wizard extends Player {
    private int manaLevel;
    private String element; //stihiya

    public Wizard(int hp, int level, String type, String weapon, int manaLevel, String element) {
        super(hp, level, type, weapon);
        this.manaLevel = manaLevel;
        this.element = element;
    }

    @Override
    String getFullInfo() {
        return hp + " " +
                level + " " +
                type + " " +
                weapon + " " +
                manaLevel + " " +
                element;
    }

    @Override
    void levelUp() {
        level += 1;
    }

    @Override
    boolean doDamage() {
        if (manaLevel >= 10) {
            manaLevel -= 10;
            return true;
        } else return false;
    }
}
