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
    Button Button;

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
    int ScreenState = MovieInfoScreen;

    //Movie info Variables
    final int AvengersMovie = 0;
    final int KongMovie = 1;
    int MoviePick = AvengersMovie;


    public void setup()
    {
        screenage = new SeatSelection(this, 1);
        background(34,34,34);
        Index = new Index(this);
        //seat = new Seat(this, 100, 100, true, 1);
        Movie = new MovieSelection(this);
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
        SpiderMan.resize(width , height);
        image(SpiderMan,0,0);
        fill(0,0,0, 220);
        rect(0,0, width , height);

        Index.BackgroundCircles();

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

        Button TitleButton = new Button(this, MovieFont,"Book Now", width/2, height - 220, 48, width/3 + 130, height - 280, width/5, height/16, false, WelcomeScreen, MovieSelectScreen);
        TitleButton.update();
        TitleButton.fillRect();
        TitleButton.overRect(width/3 + 130, height - 280, width/5, height/16);
        TitleButton.rectClick();
    }

    public void MovieSelect()
    {
        Index.Header();
        Index.Footer();
        //Change this shit not hard coded values
        Index.MovieImagePlaceholder(Avengers, 120, 220, 310, 210 );
        Index.MovieImagePlaceholder(Kong, 400, 220 , 310 , 210);
        //Index.Docket();
    }

    public void MovieInfo()
    {
        Index.Header();
        Index.Footer();

        switch(MoviePick)
        {
            case AvengersMovie:
                stroke(219,84,97);
                strokeWeight(3);
                Index.MovieImagePlaceholder(Avengers, width / 8, height /5, 520, 600 );
                noLoop();
                Movie.loadMovies("Avengers");
                noFill();
                rect(width/ 2 - 10, height / 7, 820, 110, 20);
                fill(178);
                rect( width / 2 - 10, height / 4 + 10 , 820, 500, 20);
                fill(0);
                text("Description :" , width/2, height / 4 + 50);
                textSize(18);
                text("Loki, the stepbrother of Thor, teams-up with the Chitauri " + "\n" +
                        "Army and uses the Tesseract power to travel from Asgard to " + "\n" +
                        "Earth to plot the invasion of Earth by the Chitauri and become the king of " + "\n" +
                        "Earth. The director of the agency S.H.I.E.L.D., Nick Fury, sets in motion the project" + "\n" +
                        "The Avengers, joining Tony Stark a.k.a. the Iron Man; " + "\n" +
                        "Steve Rogers, a.k.a. Captain America; Bruce Banner, a.k.a. The Hulk; Thor; Natasha " + "\n" +
                        "Romanoff, a.k.a. Black Widow; and Clint Barton, a.k.a. Hawkeye, to save the world " + "\n" +
                        "from the powerful Loki and the alien invasion", width/2 , height /3);
                break;

            case KongMovie:
                Index.MovieImagePlaceholder(Kong, width / 8, height /5, 520, 600 );
                break;
        }

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

