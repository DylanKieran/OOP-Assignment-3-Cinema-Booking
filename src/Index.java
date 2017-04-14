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
    int MovieChoice = 0;

    //static header common throughout all pages with menu and back button
    public void Header()
    {
        parent.noStroke();
        //parent.fill(219,84,97);
        parent.fill( 20, 20 , 20 , 240);
        parent.rect(0, 0, parent.width, 40);
    }


    //static footer common throughout all pages
    public void Footer()
    {
        parent.noStroke();
        parent.fill(SecondaryColour);
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
    public int MovieImagePlaceholder(PImage MoviePoster, int x, int y, int ImageHeight,int ImageWidth,int CurrentScreen,int NextScreen)
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

            /*
            CHANGE TO A BUTTON

            //View Details Box
            //parent.fill(SecondaryColour);
            //parent.rect(x + ImageWidth/4 - 20, y + ImageHeight - 60 ,ImageWidth/2 + 40, 35 , 4 , 4 ,4 ,4);

            //View Details Text
            //parent.fill(255);
            //parent.textSize(16);
            //parent.text("View Details", x + 60, y + ImageHeight - 38);
            */

            /*Button ViewDetails = new Button(this, MovieFont,"View Details", x + 60, y + ImageHeight - 38, 16, x + ImageWidth/4 - 20, y + ImageHeight - 60 ,ImageWidth/2 + 40, 35 , false, CurrentScreen, NextScreen);
            ViewDetails.update();
            ViewDetails.fillRect();
            ViewDetails.overRect(x + ImageWidth/4 - 20, y + ImageHeight - 60 ,ImageWidth/2 + 40, 35);
            MovieChoice = ViewDetails.rectClick();*/

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

        return MovieChoice;
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

}//end Class Index
