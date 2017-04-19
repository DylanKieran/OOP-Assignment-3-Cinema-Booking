import processing.core.PApplet;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by steve on 22/03/2017.
 * Class for the seats, This will control the rendering of the seats
 * and the updating of the seats
 * This will check the database for the screen size and check the seat availability
 * which will be passed into the available boolean
 * The screen size will be used in the creation of the seat layout which
 * will be controlled  in the seatLayout class.
lmao
 */
public class Seat extends Main
{
    PApplet parent;


    float xPos;
    float yPos;
    int num;
    boolean available;
    int taken = color(155, 0, 0);
    int notTaken = color(0, 155, 0);
    int hover = color(255,255,100);
    boolean selected;

    Seat(PApplet p,float x, float y, boolean available, int number)
    {
        parent = p;
        this.xPos = x;
        this.yPos = y;
        this.num = number;
        this.available = available;

    }


    public void Render()
    {
        if (available)
        {
            if(onHover())
            {
                parent.fill(hover);
            }
            else if (selected)
            {
                parent.fill(hover);
            }
            else {
                parent.fill(notTaken);
            }
        }
        else
        {
            parent.fill(taken);
        }
        parent.rect(xPos,yPos, 20, 20);
    }

    public void Update()
    {
        //System.out.println(parent.mouseX + " + " + parent.mouseY);
        noLoop();
        //onHover();
    }

    public ArrayList<Movie> Movies = new ArrayList<>();

    public void printSeats(ArrayList<Movie> movies)
    {
        for(Movie t:movies)
        {
            System.out.println(t);
        }
    }




    public boolean onHover()
    {
        if(parent.mouseX > xPos && parent.mouseX < xPos + 20 && parent.mouseY > yPos && parent.mouseY < yPos + 20 && available)
        {
            if(parent.mousePressed == true)
            {
                selected = true;
            }
            return true;
        }
        else {
            return false;
        }
    }

}
