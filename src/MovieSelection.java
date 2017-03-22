import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Dylan on 15/03/2017.
 */

public class MovieSelection
{

    static String driver = "org.sqlite.JDBC";
    String url = "jdbc:sqlite:Movies.sqlite";

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

    public ArrayList<Movie> Movies = new ArrayList<Movie>();

    public void printTunes(ArrayList<Movie> movies)
    {
        for(Movie t:movies)
        {
            System.out.println(t);
        }
    }

    void loadMovies()
    {
        ResultSet rs;
        Movies.clear();
        try(Connection c = DriverManager.getConnection(url);
            PreparedStatement ps = c.prepareStatement("select * from MovieIndex where category like 'Super Hero'"))
        {

            //.setString(1, "%Kong%");

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




    }

}
