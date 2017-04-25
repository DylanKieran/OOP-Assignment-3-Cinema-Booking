import processing.core.PApplet;

/**
 * Created by garym on 24/04/2017.
 */
public class Ticket extends Main{

    PApplet parent;

    Ticket(PApplet p)
    {
        parent = p;
    }

    public void HoverTicket(int xPos, int yPos, int rectWidth, int rectHeight, int type)
    {
        parent.fill(211);
        parent.rect(xPos,yPos, rectWidth, rectHeight);
        parent.fill(0);
        parent.text(type, xPos+ 25, yPos + 30);

        if(parent.mouseX >= xPos && parent.mouseX <= xPos + rectWidth && parent.mouseY >= yPos && parent.mouseY <= yPos + rectHeight) {

            if(mousePressed == true)
            {
                if(type == 1) {
                        adultTickets++;
                        System.out.print(adultTickets);
                }
                else if(type == 2) {
                    studentTickets ++;
                }
                else{
                    childTickets ++;
                }
                ticketCount ++;
            }
        }
    }
}
