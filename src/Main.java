import processing.core.PApplet;
import processing.core.*;

public class Main extends PApplet{

    //Create new Object

    Index Index;
    Seat seat;


    public void setup()
    {
        background(255);
        Index = new Index(this);
        seat = new Seat(this, 100, 100, true, 1);
    }

    public void settings()
    {

        fullScreen();
    }

    public void draw()
    {
        Index.Header();
        Index.Footer();
        seat.Render(); //Just testing the seat rendering code
    }

    public static void main(String[] args)
    {
        String[] a = {"MAIN"};
        PApplet.runSketch( a, new Main());
    }

}

