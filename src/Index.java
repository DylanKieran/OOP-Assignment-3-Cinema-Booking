import processing.core.PApplet;
import processing.core.PImage;

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
        parent.noStroke();
        parent.fill(219,84,97);
        parent.rect(0, 0, parent.width, 40);
    }


    //static footer common throughout all pages
    public void Footer()
    {
        parent.noStroke();
        parent.fill(219,84,97);
        parent.rect(0, parent.height-20, parent.width, parent.height);
    }

    public void Docket()
    {
        parent.stroke(40,40,40);
        parent.strokeWeight(2);
        parent.fill(255,250,255);
        parent.rect(parent.width - parent.width/5, parent.height/6, 300, parent.height - parent.height/3, 18, 18, 18, 18);
    }

    //A background to go behind images eg. Movie Image
    public void MovieImagePlaceholder(PImage MoviePoster, int x, int y)
    {
        int ImageHeight, ImageWidth;
        ImageWidth = 140;
        ImageHeight = 210;

        //Stroke at the back of the movie poster
        parent.stroke(219,84,97);
        parent.strokeWeight(5);
        parent.rect(x, y, ImageWidth, ImageHeight);

        //Display Image
        MoviePoster.resize(ImageWidth, ImageHeight);
        parent.image(MoviePoster, x, y);

        //Transparent Box
        if(parent.mouseX > x && parent.mouseX < x + ImageWidth && parent.mouseY > y && parent.mouseY < y + ImageHeight )
        {
            parent.fill(0, 0, 0, 200);
            parent.rect(x, y, ImageWidth, ImageHeight);
        }
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
