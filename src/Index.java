import processing.core.PApplet;

import static processing.core.PConstants.CENTER;
import static processing.core.PConstants.LEFT;


public class Index
{
    //Constructor
    PApplet parent;

    Index(PApplet p)
    {
        parent = p;
    }


    //static header common throughout all pages with menu and back button
    public void Header()
    {
        parent.fill(255,35,111);
        parent.rect(0,0,parent.width, 50);
        parent.fill(0);
        parent.stroke(0);
        parent.textSize(20);
        parent.textAlign(CENTER);
        parent.text(" Header ", parent.width/2 , 30);

    }


    //static footer common throughout all pages
    public void Footer()
    {
        parent.fill(255,35,111);
        parent.rect(0,parent.height,parent.width, -50);
        parent.fill(0);
        parent.stroke(0);
        parent.textSize(20);
        parent.textAlign(CENTER);
        parent.text(" Footer ", parent.width/2 , parent.height - 20);

    }

    //Like a html page where the body is the main content
    public void Body()
    {

    }

    //A background to go behind images eg. Movie Image
    public void MovieImagePlaceholder(float ImageHeight, float ImageWidth, float x, float y)
    {

    }

    //A background to go behind text
    public void TextPlaceholder(float TextBoxHeight, float TextBoxWidth, float x, float y)
    {

    }

    //Create a shape that looks like a seat
    public void SeatShape(float heigth, float width, float x, float y)
    {

    }

    //To select screening times etc
    public void SelectionBox(float heigth, float width, float x, float y)
    {

    }


}//end Class Index
