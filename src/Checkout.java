import processing.core.PApplet;

/**
 * Created by Steve on 25/04/2017.
 */
public class Checkout extends Main{
    PApplet parent;
    Button finalise;

    Checkout(PApplet p)
    {
        this.parent = p;
        finalise = new Button(parent,parent.width - parent.width/5, height/4 + 30, 100, 50, SeatSelection, EndScreen);
    }

    public void Render()
    {
        finalise.Render();
    }

    public int Update()
    {
        if (checkedOut == true)
        {
            return EndScreen;
        }
        else if(finalise.onHoverMovie(EndScreen) == EndScreen && ticketCounter == ticketCount)
        {
            checkedOut = true;
            return SeatSelection;
        }
        else
        {
            return SeatSelection;
        }

    }
}
