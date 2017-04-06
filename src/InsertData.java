/**
 * Created by garym on 06/04/2017.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {


    private Connection connect() {
        // SQLite connection string

        String url = "jdbc:sqlite:Movies.sqlite";
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(url);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insert(String title, String category, int id, float rating) {
        String sql = "INSERT INTO MovieIndex(title,category,id,rating) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, title);
            ps.setString(2, category);
            ps.setInt(3, id);
            ps.setFloat(4, rating);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
