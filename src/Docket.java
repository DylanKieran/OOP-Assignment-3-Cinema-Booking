import processing.core.PApplet;

import java.util.ArrayList;

/**
 * Created by steve on 12/04/2017.
 */
public class Docket extends Main {
    PApplet parent;
    int xPos;
    int yPos;
    int ticket;
    int tickets;
    int[] selectedSeats = new int[10];
    Docket(PApplet p, int x, int y)
    {
        parent = p;
        xPos = x;
        yPos = y;
        this.ticket = 0;
    }

    public void Render()
    {
        parent.strokeWeight(2);
        parent.stroke(100);
        parent.fill(255,250,255, 100);
        parent.rect(xPos, yPos, parent.width / 40 * 8, parent.height/25 * 12);
        parent.noStroke();
        System.out.println(haribo);
        display();
        total = ticketTotal + foodTotal;

    }

    public void Update()
    {
        //kek
    }

    public void addSeat(int seat, int ticket)
    {
        selectedSeats[ticket] = seat;
        System.out.println("ticket" + ticket + "   " + selectedSeats[ticket]);
    }

    public void display()
    {
        parent.fill(0);
        parent.textSize(18);
        parent.text("Tickets: " + ticketCount + "\n  Adult(" + adultTickets +") \n  Student(" + studentTickets + ")\n  Child(" + childTickets + ")",xPos + 10, yPos + 40);
        parent.text("Drinks: \n   Large(" + drink[0] + "),\n   Medium(" + drink[1] + "),\n    Small(" + drink[2] + ")", xPos + 10, yPos + 160 );
        parent.text("Total : " + total, xPos + 10, yPos + 300);
    }

    public void checkout()
    {

    }
}
