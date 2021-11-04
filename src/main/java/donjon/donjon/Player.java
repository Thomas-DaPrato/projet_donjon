package donjon.donjon;

import java.util.ArrayList;
import java.util.List;

public class Player extends Character{

    private ArrayList<Object> inventory;

    public Player (int strength, int hp){
        super(strength,hp);
        inventory = new ArrayList<>();
    }

    public void pickupObject(Object object){
        inventory.add(object);
    }

    public void useObject(Object object){
        inventory.get(inventory.indexOf(object)).use(this);
    }

    public List<Object> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Object> inventory) {
        this.inventory = inventory;
    }
}
