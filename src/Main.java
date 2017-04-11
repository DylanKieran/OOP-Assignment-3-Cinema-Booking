import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;


import java.awt.*;
import java.util.ArrayList;

import java.io.IOException;


public class Main extends PApplet{
    //Create new Object

    Index Index;
    Seat seat;
    MovieSelection Movie;

    PImage Avengers, Kong, SpiderMan;
    PFont MovieFont, Title;
    Movie Movie1;
    SeatSelection screenage;

    //Screen State Variables
    final int WelcomeScreen = 0;
    final int MovieSelectScreen = 1;
    final int MovieInfoScreen = 2;
    final int SeatSelection = 3;
    final int FoodDrinkSelection = 4;
    final int EndScreen = 5; //Maybe Payment Screen
    int ScreenState = SeatSelection;


    public void setup()
    {
        screenage = new SeatSelection(this, 1);
        background(34,34,34);
        Index = new Index(this);
        //seat = new Seat(this, 100, 100, true, 1);
        Movie = new MovieSelection();
        // Movie1 = new Movie();
        //Movie.loadMovies();
        //Movie.getRating();

        Title = createFont("Title.ttf", 42);
        MovieFont = createFont("arial.ttf", 32);
        //textFont(MovieFont, 18);
        Avengers = loadImage("avengers.jpg");
        Kong = loadImage("Kong.jpg");
        SpiderMan = loadImage("Background.jpg");
    }

    public void settings()
    {
        fullScreen();
    }

    public void draw()
    {
        switch(ScreenState)
        {
            case WelcomeScreen:
                WelcomeScreen();
                break;

            case MovieSelectScreen:
                MovieSelect();
                break;

            case MovieInfoScreen:
                MovieInfo();
                break;

            case SeatSelection:
                SeatSelection();
                break;
        }
    }

    public void WelcomeScreen()
    {
        //Index.BackgroundCircles();
        noLoop();
        SpiderMan.resize(width , height);
        image(SpiderMan,0,0);
        fill(0,0,0, 220);
        rect(0,0, width , height);

        noStroke();
        beginShape();
        pushMatrix();
        translate(width/2, height/2 - 60);
        scale((float) 6);
        fill(0, 0, 0, 150);
        vertex(0, -50);
        vertex(14, -20);
        vertex(47, -15);
        vertex(23, 7);
        vertex(29, 40);
        vertex(0, 25);
        vertex(-29, 40);
        vertex(-23, 7);
        vertex(-47, -15);
        vertex(-14, -20);
        endShape(CLOSE);
        popMatrix();

        Index.TitleText(MovieFont, Title);
        Index.Header();
    }

    public void MovieSelect()
    {
        Index.Header();
        Index.Footer();
        Index.MovieImagePlaceholder(Avengers, 120, 220 );
        Index.MovieImagePlaceholder(Kong, 400, 220 );
        //Index.Docket();
    }

    public void MovieInfo()
    {

    }

    public void SeatSelection()
    {
        screenage.screenRender(1);
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

