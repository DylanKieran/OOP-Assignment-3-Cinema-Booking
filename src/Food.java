/**
 * Created by Dylan on 14/04/2017.
 */

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Food extends Main
{
    PApplet parent;
    PImage Item, Background;
    int PrimaryColour = color(255,20,147);
    float Xpos, Ypos;
    int ImageWidth, ImageHeight;


    Food(PApplet p, PImage Item, PImage Background, float Xpos, float Ypos, int ImageWidth, int ImageHeight)
    {
        parent = p;
        this.Item = Item;
        this.Background = Background;
        this.Xpos = Xpos;
        this.Ypos = Ypos;
        this.ImageWidth = ImageWidth;
        this.ImageHeight = ImageHeight;
    }

    void renderBackground()
    {
        Background.resize(parent.width , parent.height);
        parent.image(Background,0,0);
        parent.fill(0,0,0, 220);
        parent.rect(0,0, parent.width , parent.height);
    }

    void renderImages()
    {
        Item.resize(ImageWidth, ImageHeight);
        parent.image(Item, Xpos, Ypos);
    }

    void ImageBackground()
    {
        parent.stroke(PrimaryColour);
        parent.strokeWeight(2);
        parent.fill(PrimaryColour, 80);
        parent.rect(Xpos - 20,Ypos - 20,200, 200, 5, 5, 5, 5);
        parent.noStroke();
    }
}
