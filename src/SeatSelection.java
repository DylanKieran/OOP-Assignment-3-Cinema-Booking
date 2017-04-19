import processing.core.PApplet;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Dylan on 15/03/2017.
 * Modified by Steve
 */
public class SeatSelection extends Main
{
    int screen;
    PApplet parent;
    ArrayList<Seat> seats = new ArrayList<>();
    boolean created = false;
    int rowCounter;
    int colCounter;
    int seatIndex = 0;
    Docket docket;

    static String driver = "org.sqlite.JDBC";
    String url = "jdbc:sqlite:Movies.sqlite";

    SeatSelection(PApplet p, int screenNumber)
    {
        parent = p;
        screen = screenNumber;
        docket = new Docket(parent, parent.width / 40 * 32, parent.height/13);
    }

    public void screenRender(int screen)
    {

        if (screen == 1)
        {
            createSeat(created, 1);
            drawLayout();
            drawSeats(1);
            docket.Render();
            created = true;
        }
        else if (screen == 2)
        {

        }
        else
        {
            System.out.println("screen render error");
            exit();
        }
    }
    public  void createSeat(boolean check, int screen)
    {
        if (screen == 1 && check == false)
        {
            for(int i = 0; i < 29; i++)
            {
                for (int j = 0; j < 20; j++)
                {
                    if(j != 10 && j != 11 && i != 8 && i != 9 && i != 24 && i != 25) {
                        seatIndex++;
                        rowCounter = j;
                        colCounter = i;
                        seat = new Seat(parent, parent.width / 40 * i + 3 * parent.width / 40, parent.height / 25 * j + parent.height / 13, true, seatIndex);
                        //System.out.println(seatIndex);
                        seat.available = QueryDB(seatIndex);
                        seats.add(seat);
                        parent.text(toChar(rowCounter), 2 * parent.width / 33, parent.height/25 * j +  parent.height / 10);
                        parent.text(colCounter, parent.width / 40 * i + 3 * parent.width / 39, parent.height/15);
                    }
                }
            }
        }
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

    public boolean QueryDB(int seatID)
    {
        ResultSet rs;
        try(Connection c = DriverManager.getConnection(url);
            PreparedStatement ps = c.prepareStatement("select * from Screen where Seat like ?"))
        {
            ps.setInt(1, seatID);

            rs = ps.executeQuery();
            while(rs.next())
            {
                int booked = rs.getInt("Booked");
                System.out.println(booked);
                if(booked == 1)
                {
                    return false;
                }
                else {
                    return true;
                }
            }

        }
        catch(SQLException e)
        {
            System.out.println("SQL Exception");
            e.printStackTrace();
        }
        return true;
    }
    private char toChar(int u)
    {
        return (char)(u + 65);
    }

    public void drawSeats(int screen)
    {
        for(Seat seat : seats)
        {
            seat.Update();
            seat.Render();
        }
    }

    public void drawLayout()
    {
        parent.strokeWeight(1);
        parent.stroke(255);
        parent.line(parent.width/5, parent.height, parent.width/5 * 2, parent.height - parent.height/20);
        parent.line(parent.width/5 * 4, parent.height, parent.width/5 * 3, parent.height - parent.height/20);
        parent.line(parent.width/5 * 2, parent.height - parent.height/20, parent.width/5 * 3, parent.height - parent.height/20);
        parent.textSize(32);
        parent.fill(255);
        parent.text("SCREEN",parent.width/11 * 5, parent.height - height/20 * 2);
    }
}
