/**
 * Created by Dylan on 14/04/2017.
 */

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;


public class Food extends Main
{

    PApplet parent;
    Food(PApplet p)
    {
        parent = p;
    }

    int PrimaryColour = color(255,20,147);
    int SecondaryColour = color(0,191,255);
    boolean circleOver = false;
    int size;


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

    void Pricing(String text, int Xpos, int Ypos)
    {
        parent.fill(255);
        parent.textFont(Title, 16);
        parent.text(text, Xpos, Ypos);
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
                    foodTotal += 5.50;
                }
                else if (index == 2)
                {
                    popcorn[1]++;
                    foodTotal += 4.00;
                }
                else if (index == 3)
                {
                    popcorn[2]++;
                    foodTotal += 3.50;
                }
                else if (index == 4)
                {
                    drink[0]++;
                    foodTotal += 4;
                }
                else if (index == 5)
                {
                    drink[1]++;
                    foodTotal += 3;
                }
                else if (index == 6)
                {
                    drink[2]++;
                    foodTotal += 2.50;
                }
                else if (index == 7)
                {
                    haribo++;
                    foodTotal += 3.50;
                }
                else if (index == 8)
                {
                    malteaser++;
                    foodTotal += 3.50;
                }
                else if (index == 9)
                {
                    MM++;
                    foodTotal += 3.50;
                }
            }
        }
        else
        {
            circleOver = false;
        }
    }
}