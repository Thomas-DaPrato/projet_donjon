package donjon;

public class Character {
    private int strength;
    private int hp;
    private int maxHp;

    public Character(int strength, int hp){
        this.strength = strength;
        this.hp = hp;
        this.maxHp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }
}
