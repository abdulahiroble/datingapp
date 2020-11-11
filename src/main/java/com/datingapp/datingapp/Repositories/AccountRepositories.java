package com.datingapp.datingapp.Repositories;

import java.sql.Connection;
import java.sql.DriverManager;

import com.datingapp.datingapp.Model.CreateProfile;

import org.springframework.ui.Model;
import org.springframework.web.context.request.WebRequest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountRepositories {

    Connection conn;

    /*
     * public List<CreateProfile> showAllAccounts() { List<CreateProfile> acclist =
     * new ArrayList<CreateProfile>();
     * 
     * try { // lavet et statement PreparedStatement ps =
     * establishConnection().prepareStatement("SELECT * FROM user");
     * 
     * // eksekvere en query ResultSet rs = ps.executeQuery();
     * 
     * // Bruge resultatet til noget while (rs.next()) { CreateProfile tmp = new
     * CreateProfile(rs.getString(1), rs.getString(2), rs.getString(3),
     * rs.getString(4), rs.getString(5)); acclist.add(tmp);
     * 
     * }
     * 
     * } catch (SQLException e) { System.out.println("No connection to database " +
     * e); } return acclist;
     * 
     * }
     */

    public CreateProfile saveUserToDatabase(CreateProfile profileToSave) {
        // CreateProfile newUser;
        // lavet et statement
        CreateProfile acclist2 = null;

        try {

            String st = ("INSERT INTO user (username, firstname, lastname, telefonnr, email)"
                    + "VALUES (?, ?, ?, ?, ?)");

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(st);

            preparedStmt.setString(1, "");
            preparedStmt.setString(2, "");
            preparedStmt.setString(3, "");
            preparedStmt.setString(4, "");
            preparedStmt.setString(5, "");

            preparedStmt.execute();

            preparedStmt.close();

        } catch (SQLException e) {
            System.out.println("Error could not save to database " + e);
        }
        return acclist2;

    }

    private Connection establishConnection() throws SQLException {
        // Lav en forbindelse
        // Registering the Driver

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/profile", "root", "password");

        return conn;
    }

}
