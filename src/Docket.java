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
    int[] selectedSeats = new int[10];
    int PrimaryColour = color(255,20,147);

    Docket(PApplet p, int x, int y)
    {
        parent = p;
        xPos = x;
        yPos = y;
        this.ticket = 0;
    }

    public void Render()
    {
        parent.fill(0,0,0, 100);
        parent.rect(xPos, yPos, parent.width/6, parent.height/3 + 200, 6, 6, 6, 6);
        parent.stroke(PrimaryColour);
        parent.strokeWeight(2);
        parent.rect(xPos + 10, yPos + 10, parent.width/6 - 20, parent.height/3 + 180);
        parent.noStroke();

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
        parent.textFont(Title, 24);
        parent.fill(PrimaryColour);
        parent.text("Receipt", xPos + 120, yPos + 45);

        parent.textFont(Title, 18);
        parent.fill(255);
        parent.text("Tickets: ",xPos + 30, yPos + 80);

        parent.textSize(16);
        parent.text("Adult (" + adultTickets + ")\nStudent (" + studentTickets +")\nChild (" + childTickets + ")",xPos + 120, yPos + 80);

        parent.textSize(18);
        parent.text("Drinks: ", xPos + 30, yPos + 180);

        parent.textSize(16);
        parent.text("Large(" + drink[0] + "),\nMedium(" + drink[1] + "),\nSmall(" + drink[2] + ")", xPos + 120, yPos + 180);

        parent.textSize(18);
        parent.text("Popcorn: ", xPos + 30, yPos + 280);

        parent.textSize(16);
        parent.text("Large(" + popcorn[0] + "),\nMedium(" + popcorn[1] + "),\nSmall(" + popcorn[2] + ")", xPos + 120, yPos + 280);

        parent.textSize(18);
        parent.text("Snacks: ", xPos + 30, yPos + 380);

        parent.textSize(16);
        parent.text("Haribos(" + haribo + "),\nMaltesers(" + malteaser + "),\nM & M's(" + MM + ")", xPos + 120, yPos + 380);

        parent.textSize(20);
        parent.text("Total: " + total, xPos + 180, yPos + 485);


        //parent.text("Total : " + total, xPos + 10, yPos + 300);
    }

    public void checkout()
    {

    }
}
