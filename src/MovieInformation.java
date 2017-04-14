import processing.core.PApplet;
import processing.core.PImage;

/**
 * Created by garym on 13/04/2017.
 */
public class MovieInformation extends Main{

    PApplet parent;

    MovieInformation(PApplet p) {
        parent = p;
    }

    /*
    void MovieInfo() {

        switch(MoviePick)
        {
            case AvengersMovie:
                parent.stroke(219,84,97);
                parent.strokeWeight(3);
                Index.MovieImagePlaceholder(Avengers, width / 8, height /5, 520, 600 );
                parent.noLoop();
                Movie.loadMovies("Avengers");
                parent.noFill();
                parent.rect(width/ 2 - 10, height / 7, 820, 110, 20);
                parent.fill(178);
                parent.rect( width / 2 - 10, height / 4 + 10 , 820, 500, 20);
                parent.fill(0);
                parent.text("Description :" , width/2, height / 4 + 50);
                parent.textSize(18);
                parent.text("Loki, the stepbrother of Thor, teams-up with the Chitauri " + "\n" +
                        "Army and uses the Tesseract power to travel from Asgard to " + "\n" +
                        "Earth to plot the invasion of Earth by the Chitauri and become the king of " + "\n" +
                        "Earth. The director of the agency S.H.I.E.L.D., Nick Fury, sets in motion the project" + "\n" +
                        "The Avengers, joining Tony Stark a.k.a. the Iron Man; " + "\n" +
                        "Steve Rogers, a.k.a. Captain America; Bruce Banner, a.k.a. The Hulk; Thor; Natasha " + "\n" +
                        "Romanoff, a.k.a. Black Widow; and Clint Barton, a.k.a. Hawkeye, to save the world " + "\n" +
                        "from the powerful Loki and the alien invasion", width/2 , height /3);
                break;

            case KongMovie:

                parent.stroke(219,84,97);
                parent.strokeWeight(3);
                Index.MovieImagePlaceholder(Kong, width / 8, height /5, 520, 600 );
                parent.noLoop();
                Movie.loadMovies("Kong");
                parent.noFill();
                parent.rect(width/ 2 - 10, height / 7, 820, 110, 20);
                parent.fill(178);
                parent.rect( width / 2 - 10, height / 4 + 10 , 820, 500, 20);
                parent.fill(0);
                parent.text("Description :" , width/2, height / 4 + 50);
                parent.textSize(18);
                parent.text("It's 1971, a team of explorers with a company of soldiers are following myth" +  "\n" +
                        "and legend in the Pacific amidst rumors of an island where creatures both " + "\n" +
                        "prehistoric and monstrous are supposed to live. Soon they come across Skull Island," + "\n" +
                        "the very island of lore and legend. The creatures they soon come across make the " + "\n" +
                        "soldiers and explorers running for their very lives. Soon Kong shows up to let all " + "\n" +
                        "know that he is the King of Skull Island and top of the food chain. Will they survive " + "\n" +
                        "to tell their story? Will beauty win the heart of the beast? ", width/2 , height /3);

                break;
        }

    }
    */
}
