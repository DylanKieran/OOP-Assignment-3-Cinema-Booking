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
    static String driver = "org.sqlite.JDBC";
    String url = "jdbc:sqlite:Movies.sqlite";

    PApplet parent;
    PImage Item, Background;
    int PrimaryColour = color(255,20,147);
    float Xpos, Ypos;
    int ImageWidth, ImageHeight;
    float Coke, Fanta, Sprite = 2;
    float Maltesers, Twizzlers, MandMs , BoostBites, Popcorn = 2;

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
    }

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

    double size(String size, double price)
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

    void ImageBackground()
    {
        parent.stroke(PrimaryColour);
        parent.strokeWeight(2);
        parent.fill(PrimaryColour, 80);
        parent.rect(Xpos - 20,Ypos - 20,200, 200, 5, 5, 5, 5);
        parent.noStroke();
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
