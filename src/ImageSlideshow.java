/**
 * Created by Dylan on 14/04/2017.

import processing.core.PApplet;
import processing.core.PImage;

public class ImageSlideshow extends Main
{
    PApplet parent;

    PImage img;
    int imgIndex = 0;
    int time = millis();

    String img_list[] =
            {
                    "SpidermanBackground.jpg",
                    "GuardiansBackground.jpg",
                    "KongBackground.jpg",
                    "MovieSelectBackground.jpg",
                    "StepBrothersBackground.jpg",
                    "ITBackground.jpg",
                    "ShooterBackground.jpg",
                    "LegoBatmanBackground.jpg",
                    "GetOutBackground.jpg"
            };

    ImageSlideshow(PApplet p)
    {
        parent = p;
    }

    void DisplayImages()
    {
        image(img, 0, 0);
    }

    void LoadImages()
    {
        img = loadImage(img_list[imgIndex]);
        img.resize(parent.width,parent.height);
    }

    void Timer()
    {
        //10 seconds per Image
        if(time % 11000 == 0)
        {
            imgIndex++;
        }

        img = loadImage(img_list[imgIndex]);
        img.resize(parent.width,parent.height);

        if(imgIndex == 8)
        {
            imgIndex = 0;
        }
    }
}
*/