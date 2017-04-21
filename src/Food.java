/**
 * Created by Dylan on 14/04/2017.
 */

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Food extends Main
{
    /*static String driver = "org.sqlite.JDBC";
    String url = "jdbc:sqlite:Movies.sqlite";
    PImage Item, Background;
    float Coke, Fanta, Sprite = 2;
    float Maltesers, Twizzlers, MandMs , BoostBites, Popcorn = 2;*/

    PApplet parent;
    Food(PApplet p) {parent = p;}

    int PrimaryColour = color(255,20,147);
    int SecondaryColour = color(0,191,255);
    boolean circleOver = false;

    /*
    static
    {
        try
        {
            Class.forName(driver);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }*/


    void render(PImage Item, int ImageWidth, int ImageHeight, int Xpos, int Ypos)
    {
        parent.noStroke();

        Item.resize(ImageWidth,ImageHeight);

        parent.image(Item, Xpos, Ypos);
    }

    void drawCircle(int Xpos, int Ypos)
    {
        if(circleOver)
        {
            parent.fill(PrimaryColour, 220);
        }
        else
        {
            parent.fill(PrimaryColour, 120);
        }
        parent.ellipse(Xpos, Ypos, 180, 180);
    }

    void drawLabel(String text, int Xpos, int Ypos, PFont Title)
    {
        parent.noStroke();

        parent.fill(PrimaryColour);
        parent.rect(Xpos, Ypos, 120, 35, 5, 5, 5, 5);

        parent.fill(255);
        parent.textFont(Title, 24);
        parent.text(text, Xpos + 15, Ypos + 25);
    }

    boolean overCircle(int x, int y, int diameter) {
        float disX = x - parent.mouseX;
        float disY = y - parent.mouseY;
        if(sqrt(sq(disX) + sq(disY)) < diameter/2 ) {
            return true;
        } else {
            return false;
        }
    }

    void update(int Xpos, int Ypos)
    {
        if(overCircle(Xpos, Ypos, 180))
        {
            circleOver = true;
        }
        else
        {
            circleOver = false;
        }
    }


    /*double size(String size, double price)
    {

        if ( size == "Large")
        {
            price = price * 2;
        }

        if ( size == "Medium")
        {
            price = price * 1.5;
        }

        return price;
    }

    public void printTunes(ArrayList<Food> food)
    {
        for(Food t:food)
        {
            System.out.println(t);
        }
    }

    public ArrayList<Food> Products = new ArrayList<>();

    /*
    void getProduct() {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a food: ");
        String user = reader.nextLine(); // Scans the next token of the input as an int.

        ResultSet rs;
        Products.clear();
        try(Connection c = DriverManager.getConnection(url);
            PreparedStatement ps = c.prepareStatement("select * from FoodIndex where Foods like ?"))
        {
            ps.setString(1, user);

            rs = ps.executeQuery();
            while(rs.next())
            {
                Food food = new Food(rs);
                Food.add(food);
            }
            printTunes(Food);
        }
        catch(SQLException e)
        {
            System.out.println("SQL Exception");
            e.printStackTrace();
        }
        //return rating;
    }
    */
}