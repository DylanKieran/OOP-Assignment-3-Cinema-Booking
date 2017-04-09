import com.sun.org.apache.bcel.internal.generic.VariableLengthInstruction;
import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;

public class Index extends Main
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
        ImageWidth = 210;
        ImageHeight = 310;

        //Change the colour of tha MoviePoster template if hovered on
        if(parent.mouseX > x && parent.mouseX < x + ImageWidth && parent.mouseY > y && parent.mouseY < y + ImageHeight )
        {
            parent.fill(219,84,97);
        }
        else
        {
            parent.fill(255);
        }

        parent.rect(x - 4, y - 4, ImageWidth + 8, ImageHeight + 8, 6, 6, 6, 6);

        //Display Image
        MoviePoster.resize(ImageWidth, ImageHeight);
        parent.image(MoviePoster, x, y);

        //Transparent Box
        if(parent.mouseX > x && parent.mouseX < x + ImageWidth && parent.mouseY > y && parent.mouseY < y + ImageHeight )
        {
            //Transparent Grey box
            parent.fill(0, 0, 0, 200);
            parent.rect(x, y, ImageWidth, ImageHeight);

            //View Details Box
            parent.fill(219,84,97);
            parent.rect(x + ImageWidth/4 - 20, y + ImageHeight - 60 ,ImageWidth/2 + 40, 35 , 4 , 4 ,4 ,4);

            //View Details Text
            parent.fill(255);
            parent.text("View Details", x + ImageWidth/4 + 5, y + ImageHeight - 38);

            parent.beginShape();
            parent.pushMatrix();
            parent.translate(x + ImageWidth/2, y + ImageHeight/4);
            parent.scale((float) 0.5);
            parent.fill(219,84,97);
            parent.vertex(0, -50);
            parent.vertex(14, -20);
            parent.vertex(47, -15);
            parent.vertex(23, 7);
            parent.vertex(29, 40);
            parent.vertex(0, 25);
            parent.vertex(-29, 40);
            parent.vertex(-23, 7);
            parent.vertex(-47, -15);
            parent.vertex(-14, -20);
            parent.endShape(CLOSE);
            parent.popMatrix();
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
