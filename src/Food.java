/**
 * Created by Dylan on 14/04/2017.
 */

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Food extends Main
{
    /*static String driver = "org.sqlite.JDBC";
    String url = "jdbc:sqlite:Movies.sqlite";
    PImage Item, Background;
    float Coke, Fanta, Sprite = 2;
    float Maltesers, Twizzlers, MandMs , BoostBites, Popcorn = 2;*/

    PApplet parent;
    Food(PApplet p)
    {
        parent = p;
    }

    int PrimaryColour = color(255,20,147);
    int SecondaryColour = color(0,191,255);
    boolean circleOver = false;
    int size;

    /*
    static
    {
        try
        {
            Class.forName(driver);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }*/


    void render(PImage Item, int ImageWidth, int ImageHeight, int Xpos, int Ypos)
    {
        parent.noStroke();

        Item.resize(ImageWidth,ImageHeight);

        parent.image(Item, Xpos, Ypos);
    }

    void drawCircle(int Xpos, int Ypos)
    {
        if(circleOver)
        {
            parent.fill(PrimaryColour, 220);
        }
        else
        {
            parent.fill(PrimaryColour, 120);
        }
        parent.ellipse(Xpos, Ypos, 180, 180);
    }

    void drawLabel(String text, int Xpos, int Ypos, PFont Title)
    {
        parent.noStroke();

        parent.fill(PrimaryColour);
        parent.rect(Xpos, Ypos, 120, 35, 5, 5, 5, 5);

        parent.fill(255);
        parent.textFont(Title, 24);
        parent.text(text, Xpos + 15, Ypos + 25);
    }

    boolean overCircle(int x, int y, int diameter) {
        float disX = x - parent.mouseX;
        float disY = y - parent.mouseY;
        if(sqrt(sq(disX) + sq(disY)) < diameter/2 ) {
            return true;
        } else {
            return false;
        }
    }

    void update(int Xpos, int Ypos, int index)
    {
        if(overCircle(Xpos, Ypos, 180))
        {
            circleOver = true;
            if (parent.mousePressed == true)
            {
                parent.mousePressed = false;
                if (index == 1)
                {
                    popcorn[0]++;
                    total += 5.50;
                }
                else if (index == 2)
                {
                    popcorn[1]++;
                    total += 4.20;
                }
                else if (index == 3)
                {
                    popcorn[2]++;
                    total += 3.79;
                }
                else if (index == 4)
                {
                    drink[0]++;
                    total += 4;
                }
                else if (index == 5)
                {
                    drink[1]++;
                    total += 3;
                }
                else if (index == 6)
                {
                    drink[2]++;
                    total += 2.50;
                }
                else if (index == 7)
                {
                    haribo++;
                    total += 3.50;
                }
                else if (index == 8)
                {
                    MM++;
                    total += 3.50;
                }
                else if (index == 9)
                {
                    malteaser++;
                    total += 3.50;
                }
            }
        }
        else
        {
            circleOver = false;
        }
    }
}