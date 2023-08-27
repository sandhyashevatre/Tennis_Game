package com.learning.hello.contoller;

import com.learning.hello.Tennis.Game;
import com.learning.hello.Tennis.Match;
import com.learning.hello.Tennis.Tennis_Players;
import com.learning.hello.Tennis.Set;
import com.learning.hello.Tennis.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 

public class TennisController {
    private Connection cnx = null;

    public TennisController() {
        try {
            cnx= DriverManager.getConnection("jdbc:mysql://localhost:3306/TennisDB","ru1910", "ruch@123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void savePlayer( String player_id, String player_name ) throws SQLException {

 

        String insertQuery1 = "INSERT INTO Players (player_id, player_name) VALUES (?,?)";
        try (PreparedStatement statement = cnx.prepareStatement(insertQuery1)) {

 

            statement.setString(1, player_id);
            statement.setString(2, player_name);            

 

            statement.executeUpdate();

 

        } catch (SQLException e) {

 

            e.printStackTrace();
        }

 

    }

    public void clearBoard() {
        String clearBoards = "DELETE FROM Players";
        try (PreparedStatement statement = cnx.prepareStatement(clearBoards)) {

 

            statement.executeUpdate();

 

        } catch (SQLException e) {

 

            e.printStackTrace();
        }
    }

    public ResultSet getPlayers() {
        PreparedStatement show;
        try {
            show = cnx.prepareStatement("SELECT * FROM Players ORDER BY player_id ");
            ResultSet rs = show.executeQuery();
            return rs;

 

        } catch (SQLException e) {

 

            e.printStackTrace();
            return null;
        }
    }

}