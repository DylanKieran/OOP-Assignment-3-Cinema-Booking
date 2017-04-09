import processing.core.PApplet;

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
    SeatSelection(PApplet p, int screenNumber)
    {
        parent = p;
        screen = screenNumber;
    }

    public void screenRender(int screen)
    {

        if (screen == 1)
        {
            createSeat(created, 1);
            drawLayout();
            drawSeats(1);
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
            for(int i = 0; i < 34; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    seat = new Seat(parent, parent.width / 40 * i + 3 * parent.width/40, parent.height/25 * j + parent.height/13, true, i);
                    seats.add(seat);
                }
            }
        }
    }

    public void drawSeats(int screen)
    {
        for(Seat seat : seats)
        {
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
    }
}
