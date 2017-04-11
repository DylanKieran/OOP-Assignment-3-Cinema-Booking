import processing.core.PApplet;
import processing.core.PFont;

public class Button extends Main
{
    //Constructor
    PApplet parent;

    //Fields
    String buttonText;
    float textX;
    float textY;
    float rectX;
    float rectY;
    float rectWidth;
    float rectHeight;
    int rectColour = color(255,20,147);
    boolean rectOver;
    int CurrentScreen;
    int NextScreen;
    int fontSize;

    //Constructor
    Button(PApplet p,PFont MovieFont, String buttonText,float textX, float textY,int fontSize, float rectX, float rectY, float rectWidth, float rectHeight, boolean rectOver, int CurrentScreen ,int NextScreen)
    {
        parent = p;
        this.MovieFont = MovieFont;
        this.buttonText = buttonText;
        this.textX = textX;
        this.textY = textY;
        this.fontSize = fontSize;
        this.rectX = rectX;
        this.rectY = rectY;
        this.rectWidth = rectWidth;
        this.rectHeight = rectHeight;
        this.rectOver = rectOver;
        this.CurrentScreen = CurrentScreen;
        this.NextScreen = NextScreen;
    }

    void fillRect()
    {
        int rectHighlight = color(255,30,160);

        if (rectOver)
        {
            parent.fill(rectHighlight);
        }
        else
        {
            parent.fill(rectColour);
        }

        parent.noStroke();
        parent.rect(rectX, rectY, rectWidth, rectHeight, 5, 5, 5, 5);

        parent.textAlign(CENTER);
        parent.fill(255);
        parent.textFont(MovieFont);
        parent.textSize(fontSize);
        parent.text(buttonText,textX,textY);
    }

    void update()
    {
        if ( overRect(rectX, rectY, rectWidth, rectHeight) )
        {
            rectOver = true;
        }
        else
        {
            rectOver = false;
        }
    }

    void rectClick()
    {
        if (parent.mouseX >= rectX && parent.mouseX <= rectX+rectWidth && parent.mouseY >= rectY &&  parent.mouseY <= rectY+rectHeight)
        {
            System.out.println(ScreenState);
            ScreenState = NextScreen;
        }
        else
        {
            System.out.println(ScreenState);
            ScreenState = CurrentScreen;
        }
    }

    boolean overRect(float x, float y, float rectWidth, float rectHeight)
    {
        if (parent.mouseX >= x && parent.mouseX <= x +rectWidth &&
                parent.mouseY >= y && parent.mouseY <= y +rectHeight)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
