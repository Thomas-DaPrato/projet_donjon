package donjon.donjon;

public class Potion implements Object{
    String name;
    int heal;

    public Potion(String name, int heal){
        this.name = name;
        this.heal = heal;
    }

    @Override
    public void use(Character character) {
        character.setHp(Math.min(character.getHp() + heal, character.getMaxHp()));
        System.out.println("Vous avez utilisé une " + name + " qui vous a redonné" + heal + " pv");
        System.out.println("Vous avez maintenant " + character.getHp() + " pv");
    }
}
