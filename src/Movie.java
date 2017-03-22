import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by garym on 22/03/2017.
 */
public class Movie {
    private String title;
    private int rating;
    private int id;
    private String category;


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

    public int getRating() {
        return rating;
    }

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
                + ", " + rating;
    }
}


