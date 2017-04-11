import processing.core.PApplet;
import processing.data.StringList;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by Dylan on 15/03/2017.
 */

public class MovieSelection extends Main
{
    PApplet parent;
    static String driver = "org.sqlite.JDBC";
    String url = "jdbc:sqlite:Movies.sqlite";
    StringList info;

    MovieSelection(PApplet p)
    {
        parent = p;
        info = new StringList();
    }

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

    public ArrayList<Movie> Movies = new ArrayList<>();

    public void printTunes(ArrayList<Movie> movies)
    {
        for(Movie t:movies)
        {
            System.out.println(t);
        }
    }

    void loadMovies(String ReturnMovie)
    {

        //Scanner reader = new Scanner(System.in);  // Reading from System.in
        //System.out.println("Enter a Movie or Catagory: ");
        //String user = reader.nextLine(); // Scans the next token of the input as an int.

        ResultSet rs;
        Movies.clear();
        try(Connection c = DriverManager.getConnection(url);
            PreparedStatement ps = c.prepareStatement("select * from MovieIndex where title like ?"))
        {
            ps.setString(1, ReturnMovie);

            rs = ps.executeQuery();


            int gap =0;
            String[] arr = new String[5];
            parent.textSize(26);
            parent.fill(255);
            parent.textAlign(LEFT);
            parent.text("Rating :", parent.width/2 + 680, parent.height / 5 );
            while (rs.next())
            {
                for(int i = 1; i< 5 ; i++) {
                    arr[i] = rs.getString(i);
                    parent.text(arr[i] , parent.width/2 + gap, parent.height / 5 );
                    gap +=260;
                }

                Movie movie = new Movie(rs);
                Movies.add(movie);
            }
            printTunes(Movies);
        }
        catch(SQLException e)
        {
            System.out.println("SQL Exception");
            e.printStackTrace();
        }
    }

    void getRating() {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a movie to see its rating: ");
        String user = reader.nextLine(); // Scans the next token of the input as an int.

        ResultSet rs;
        Movies.clear();
        try(Connection c = DriverManager.getConnection(url);
            PreparedStatement ps = c.prepareStatement("select * from MovieIndex where title like ?"))
        {
            ps.setString(1, user);

            rs = ps.executeQuery();
            while(rs.next())
            {
                Movie movie = new Movie(rs);
                Movies.add(movie);
            }
            printTunes(Movies);
        }
        catch(SQLException e)
        {
            System.out.println("SQL Exception");
            e.printStackTrace();
        }
        //return rating;
    }
}
