package donjon;

import javafx.scene.canvas.GraphicsContext;

public class Room {
    Room north;
    Room south;
    Room east;
    Room west;

    public Room(){
        this(null, null, null, null);
    }

    public Room (Room north, Room south, Room east, Room west){
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void draw(GraphicsContext graphicsContext){
        Rectangle roomWall1 = new Rectangle(0, 0, 250, 20);
        Rectangle roomWall2 = new Rectangle(350, 0, 250, 20);
        Rectangle roomWall3 = new Rectangle(580, 0, 20, 250);
        Rectangle roomWall4 = new Rectangle(580, 350, 20, 250);
        Rectangle roomWall5 = new Rectangle(350, 580, 250, 20);
        Rectangle roomWall6 = new Rectangle(0, 580, 250, 20);
        Rectangle roomWall7 = new Rectangle(0, 350, 20, 250);
        Rectangle roomWall8 = new Rectangle(0, 0, 20, 250);



        roomWall1.draw(graphicsContext);
        roomWall2.draw(graphicsContext);
        roomWall3.draw(graphicsContext);
        roomWall4.draw(graphicsContext);
        roomWall5.draw(graphicsContext);
        roomWall6.draw(graphicsContext);
        roomWall7.draw(graphicsContext);
        roomWall8.draw(graphicsContext);
    }


}
