package com.datingapp.datingapp.Repositories;

import java.sql.Connection;
import java.sql.DriverManager;

import com.datingapp.datingapp.Model.CreateProfile;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountRepositories {

    Connection conn;

    public List<CreateProfile> showAllAccounts() {
        List<CreateProfile> acclist = new ArrayList<CreateProfile>();

        try {
            // lavet et statement
            PreparedStatement ps = establishConnection().prepareStatement("SELECT * FROM user");

            // eksekvere en query
            ResultSet rs = ps.executeQuery();

            // Bruge resultatet til noget
            while (rs.next()) {
                CreateProfile tmp = new CreateProfile(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6));
                acclist.add(tmp);
            }

        } catch (SQLException e) {
            System.out.println("No connection to database " + e);
        }
        return acclist;

    }

    public CreateProfile saveUserToDatabase(CreateProfile request) {
        // CreateProfile newUser;
        // lavet et statement
        CreateProfile acclist2 = null;
        try {

            String st = ("INSERT INTO Customers " + "VALUES (?,?, ?, ?, ?, ?, ?)");

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(st);
            preparedStmt.setInt(0, 0);
            preparedStmt.setInt(1, 2);
            preparedStmt.setString(2, "hej");
            preparedStmt.setString(3, "ff");
            preparedStmt.setInt(4, 2);
            preparedStmt.setString(5, "f");
            preparedStmt.setString(6, "hej");

            preparedStmt.execute();

            conn.close();

        } catch (Exception e) {
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
