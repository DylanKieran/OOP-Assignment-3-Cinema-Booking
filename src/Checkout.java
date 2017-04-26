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
        finalise = new Button(parent, parent.width - 280,parent.height - 250, 120, 30, SeatSelection, EndScreen);
        finalise.Render();
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
