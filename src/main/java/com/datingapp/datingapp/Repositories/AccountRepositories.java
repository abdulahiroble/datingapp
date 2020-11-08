package com.datingapp.datingapp.Repositories;

import java.sql.Connection;
import java.sql.DriverManager;

import com.datingapp.datingapp.Model.CreateProfile;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountRepositories {

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

    private Connection establishConnection() throws SQLException {
        // Lav en forbindelse
        // Registering the Driver

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/profile", "root", "password");

        return conn;
    }
}
