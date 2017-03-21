import processing.core.PApplet;
import processing.core.*;

public class Main extends PApplet{

    //Create new Object

    Index Index;


    public void setup()
    {
        background(255);
        Index = new Index(this);
    }

    public void settings()
    {

        fullScreen();
    }

    public void draw()
    {
        Index.Header();
        Index.Footer();
    }

    public static void main(String[] args)
    {
        String[] a = {"MAIN"};
        PApplet.runSketch( a, new Main());
    }

}

