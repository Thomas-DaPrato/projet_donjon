package donjon.donjon;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Game extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        Scene scene = new Scene(new Group(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);



        stage.show();

        Player p1 = new Player(1,10);
        ArrayList<Object> inventory = new ArrayList<Object>();
        Object woodSword = new Weapon("épée en bois",3);
        Object healPotion = new Potion("potion de soin", 5);
        Object ironSword = new Weapon("épée en fer",6);
        p1.pickupObject(woodSword);
        p1.pickupObject(healPotion);
        p1.pickupObject(ironSword);

        p1.useObject(woodSword);
        p1.useObject(healPotion);
        p1.useObject(ironSword);
    }

    public static void main(String[] args) {
        launch();
    }
}