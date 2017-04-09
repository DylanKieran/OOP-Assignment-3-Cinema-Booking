import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

<<<<<<< HEAD
import java.util.ArrayList;
=======
import java.io.IOException;
>>>>>>> ef403aea890814d43133edb686aeb8562ed1932a

public class Main extends PApplet{
    //Create new Object

    Index Index;
    Seat seat;
    MovieSelection Movie;
<<<<<<< HEAD
=======
    PImage Avengers, Kong;
    PFont MovieFont;
    Movie Movie1;
>>>>>>> ef403aea890814d43133edb686aeb8562ed1932a

    public void setup()
    {
        background(34,34,34);
        Index = new Index(this);
        //seat = new Seat(this, 100, 100, true, 1);
        Movie = new MovieSelection();
        // Movie1 = new Movie();
        //Movie.loadMovies();
        Movie.getRating();

        MovieFont = createFont("arial.ttf", 32);
        textFont(MovieFont, 18);
        Avengers = loadImage("avengers.jpg");
        Kong = loadImage("Kong.jpg");
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
        Index.MovieImagePlaceholder(Avengers, 120, 220 );
        Index.MovieImagePlaceholder(Kong, 400, 220 );
    }

    public static void main(String[] args)
    {
        String[] a = {"MAIN"};
        PApplet.runSketch( a, new Main());


        InsertData app = new InsertData();
        // insert three new rows
        //app.insert("IT", "Horror", 12, 4);
        //app.insert("Alien", "Horror", 13, 9);
    }

}

