import processing.core.PApplet;

import java.util.ArrayList;

/**
 * Created by steve on 12/04/2017.
 */
public class Docket extends Main {
    PApplet parent;
    int xPos;
    int yPos;
    ArrayList<Seat> docketSeats;
    Docket(PApplet p, int x, int y)
    {
        parent = p;
        xPos = x;
        yPos = y;
        docketSeats = new ArrayList<>();
    }

    public void Render()
    {
        parent.strokeWeight(2);
        parent.stroke(100);
        parent.fill(255,250,255);
        parent.rect(xPos, yPos, parent.width / 40 * 8, parent.height/25 * 12);
    }

    public void Update()
    {
        addItem();
        removeItem();
    }

    public void addItem()
    {

    }

    public void removeItem()
    {

    }
}
