import com.sun.org.apache.bcel.internal.generic.VariableLengthInstruction;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import processing.core.PShape;

public class Index extends Main
{
    //Constructor
    PApplet parent;
    Index(PApplet p) {
        parent = p;
    }

    int SecondaryColour = color(255,20,147);


    //A background to go behind images eg. Movie Image
    public void MovieImagePlaceholder(PImage MoviePoster, int x, int y, int ImageHeight,int ImageWidth/*,int CurrentScreen,int NextScreen*/)
    {
        //Change the colour of tha MoviePoster template if hovered on
        if(parent.mouseX > x && parent.mouseX < x + ImageWidth && parent.mouseY > y && parent.mouseY < y + ImageHeight ) {
            parent.fill(SecondaryColour);
        }
        else {
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

            parent.beginShape();
            parent.pushMatrix();
            parent.translate(x + ImageWidth/2, y + ImageHeight/4);
            parent.scale((float) 0.5);
            parent.fill(SecondaryColour);
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

    public void BackgroundCircles()
    {
        parent.noLoop();
        parent.noStroke();
        parent.fill(30,144,255, 200);
        for(float x = 4; x < parent.width; x += 50)
        {
            for(float y = 4; y < parent.height; y += 50)
            {
                parent.ellipse(x, y, 1 , 1);
            }
        }
        parent.loop();
    }

    public void TitleText(PFont MovieFont, PFont Title)
    {
        parent.noStroke();
        parent.textAlign(CENTER);
        parent.textFont(MovieFont);
        parent.textSize(90);
        parent.fill(169,169,169);
        parent.text("Welcome to", parent.width/2, parent.height/3 + 30);
        parent.textFont(Title);
        parent.textSize(140);
        parent.fill(255,20,147);
        parent.text("Empire",parent.width/2, parent.height/2);
        parent.textFont(MovieFont);
        parent.textSize(60);
        parent.fill(255);
        parent.text("Cinemas",parent.width/2, parent.height/2 + 80);
    }

    public void Star(int StarWidth, int StarHeight, int Scale)
    {
        parent.noStroke();
        parent.beginShape();
        parent.pushMatrix();
        parent.translate(StarWidth, StarHeight);
        parent.scale((float) Scale);
        parent.fill(0, 0, 0, 150);
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

}//end Class Index
