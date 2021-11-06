package donjon;

public class Weapon implements Object {
    String name;
    int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public void use(Character character) {
        character.setStrength(damage);
        System.out.println("Vous avez utilisé l'arme : " + name + " !");
        System.out.println("Vous avez maintenant : " + character.getStrength() + " de force.");
    }
}
