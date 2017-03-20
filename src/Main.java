import processing.core.PApplet;

public class Main extends PApplet{

    //Create new Object
    Index Index = new Index();

    public void setup()
    {
        background(255);
    }

    public void settings()
    {
        fullScreen();
    }

    public void draw()
    {
        Index.Header();
    }

    public static void main(String[] args)
    {
        String[] a = {"MAIN"};
        PApplet.runSketch( a, new Main());
    }

}

