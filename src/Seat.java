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

    static String driver = "org.sqlite.JDBC";
    String DBurl = "jdbc:sqlite:Movies.sqlite";

    float xPos;
    float yPos;
    int num;
    boolean available;
    int taken = color(155, 0, 0);
    int notTaken = color(0, 155, 0);
    int hover = color(255,255,100);
    boolean selected;
    boolean yolo = false;
    int tickets = 0;
    int[] selectedSeats = new int[100];
    Docket docket;
    Statement stmt;

    Seat(PApplet p,float x, float y, boolean available, int number, Docket docket)
    {
        parent = p;
        this.xPos = x;
        this.yPos = y;
        this.num = number;
        this.available = available;
        this.docket = docket;
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
                yolo = true;
            }
            else {
                parent.fill(notTaken);
            }
        }
        else
        {
            parent.fill(taken);
        }
        parent.stroke(255);
        parent.strokeWeight(1);
        parent.rect(xPos,yPos, 20, 20);
        parent.noStroke();
        Update();
    }

    public void Update()
    {
        if(yolo == true && checkedOut == true)
            updateDB(num);
    }

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
    }

    public void updateDB(int seatIndex)
    {
        //System.out.println("SWAG" + seatIndex);
        try(Connection conn = DriverManager.getConnection(DBurl);
            PreparedStatement ps = conn.prepareStatement("UPDATE Screen " + " SET Booked = 1 WHERE Seat = ?;"))
        {
            ps.setInt(1, seatIndex);
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("SQL Exception");
            e.printStackTrace();
        }
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
            if(parent.mousePressed == true && selected == false && ticketCounter < ticketCount)
            {
                parent.mousePressed = false;
                selected = true;
                //selectedSeats[ticketCount] = num;
                //System.out.println("ticket" + ticketCount + "   " + selectedSeats[ticketCount]);
                //docket.addSeat(num, ticketCount);
                screenage.ticketCounter++;
                selectedSeats[ticketCounter] = num;
                return true;
            }
            else if(parent.mousePressed == true && selected == true)
            {
                parent.mousePressed = false;
                selected = false;
                ticketCounter--;
                //selectedSeats[ticketCount] = 0;
            }
            return true;
        }
        else {
            return false;
        }
    }

}
