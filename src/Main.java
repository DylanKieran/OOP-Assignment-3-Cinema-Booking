import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{
    //Create new Object

    Index Index;
    Seat seat;
    MovieSelection Movie;
    PImage img;

    public void setup()
    {
        background(34,34,34);
        Index = new Index(this);
        //seat = new Seat(this, 100, 100, true, 1);
        Movie = new MovieSelection();
        Movie.loadMovies();

        img = loadImage("avengers.jpg");
    }

    public void settings()
    {
        fullScreen();
    }

    public void draw()
    {
        Index.Header();
        Index.Footer();
        //Index.Docket();
        //seat.Render(); //Just testing the seat rendering code
        //seat.Update();
        Index.MovieImagePlaceholder(img, 0, 0 );
    }

    public static void main(String[] args)
    {
        String[] a = {"MAIN"};
        PApplet.runSketch( a, new Main());
    }

}

