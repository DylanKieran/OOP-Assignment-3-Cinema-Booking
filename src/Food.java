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
    }

    void drawCircle(int Xpos, int Ypos)
    {
        parent.fill(PrimaryColour, 100);
        parent.ellipse(Xpos, Ypos, 180, 180);
    }

    void drawLabel(int Xpos, int Ypos)
    {

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