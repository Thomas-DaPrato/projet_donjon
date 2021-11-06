package donjon;

import javafx.scene.canvas.GraphicsContext;

public class Rectangle implements Shape{
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //TO DO
    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.fillRect(x,y,width,height);
    }
}
