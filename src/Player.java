public abstract class Player {
    protected int hp, level;
    protected String type, weapon;

    public Player(int hp, int level, String type, String weapon) {
        this.hp = hp;
        this.level = level;
        this.type = type;
        this.weapon = weapon;
    }

    abstract String getFullInfo();
    abstract void levelUp();
    abstract boolean doDamage();
}
