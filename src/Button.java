import processing.core.PApplet;
import processing.core.PFont;

public class Button extends Main
{
    PApplet parent;

    float xPos;
    float yPos;
    float rectWidth, rectHeight;
    boolean Hover = false;
    int PrimaryColour = color(255,20,147);
    int SecondaryColour = color(255, 35, 180);
    int CurrentScreen, NextScreen;

    Button(PApplet p, float x, float y, float rectWidth, float rectHeight, int CurrentScreen, int NextScreen)
    {
        parent = p;
        this.xPos = x;
        this.yPos = y;
        this.rectWidth = rectWidth;
        this.rectHeight = rectHeight;
        this.CurrentScreen = CurrentScreen;
        this.NextScreen = NextScreen;
        this.Hover = false;
    }

    public void Render()
    {
        if(Hover == true)
        {
            parent.fill(SecondaryColour);
        }
        else
        {
            parent.fill(PrimaryColour);
        }
        parent.rect(xPos, yPos, rectWidth, rectHeight);
    }

    public int onHover()
    {
        if(parent.mouseX >= xPos && parent.mouseX <= xPos + rectWidth && parent.mouseY >= yPos && parent.mouseY <= yPos + rectHeight)
        {
            Hover = true;

            if(parent.mousePressed == true)
            {
                return NextScreen;
            }
            else
            {
                return CurrentScreen;
            }
        }
        else
        {
            return CurrentScreen;
        }
    }

    public int onHoverMovie(int MoviePick)
    {
        if(parent.mouseX >= xPos && parent.mouseX <= xPos + rectWidth && parent.mouseY >= yPos && parent.mouseY <= yPos + rectHeight)
        {
            Hover = true;

            if(parent.mousePressed == true)
            {
                return NextScreen = MoviePick;
            }
            else
            {
                return CurrentScreen;
            }
        }
        else
        {
            return CurrentScreen;
        }
    }

    public void renderText(PFont TextFont, int TextSize, String Text, float TextX, float TextY)
    {
        parent.fill(255);
        parent.textFont(TextFont);
        parent.textSize(TextSize);
        parent.text(Text, TextX, TextY);
    }
}
