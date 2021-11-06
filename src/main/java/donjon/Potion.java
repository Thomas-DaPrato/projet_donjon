package donjon;

public class Potion implements Object {
    String name;
    int heal;

    public Potion(String name, int heal){
        this.name = name;
        this.heal = heal;
    }

    @Override
    public void use(Character character) {
        int oldHp = character.getHp();
        character.setHp(Math.min(character.getHp() + heal, character.getMaxHp()));
        int newHp = character.getHp();
        System.out.println("Vous avez utilisé une " + name + " qui vous a redonné " + (newHp-oldHp) + " pv");
        System.out.println("Vous avez maintenant " + character.getHp() + " pv");
    }
}
