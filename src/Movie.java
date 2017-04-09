import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by garym on 22/03/2017.
 */
public class Movie {

    private String title;
    private int rating;
    private int id;
    private String category;


    public ArrayList<Movie> Movies = new ArrayList<Movie>();

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

    public void printTunes(ArrayList<Movie> movies)
    {
        for(Movie t:movies)
        {
            System.out.println(t);
        }
    }

    public Movie(ResultSet rs) throws SQLException
    {
        setTitle(rs.getString("title"));
        setRating(rs.getInt("rating"));
        setCategory(rs.getString("category"));
        setId(rs.getInt("id"));
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    /*public int getRating() {

            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter a movie to see its rating: ");
            String user = reader.nextLine(); // Scans the next token of the input as an int.

            ResultSet rs;
            Movies.clear();
            try(Connection c = DriverManager.getConnection(url);
                PreparedStatement ps = c.prepareStatement("select rating from MovieIndex where title like ?"))
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
        return rating;
    }
*/

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String toString()
    {
        return "" + title
                + ", " + id
                + ", " + category
                + ", " + rating + "/10 Rating";
    }
}


