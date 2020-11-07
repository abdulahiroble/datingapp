package com.datingapp.datingapp.Repositories;

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
                CreateProfile tmp = new CreateProfile(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getInt(7));
                acclist.add(tmp);
            }

        } catch (SQLException e) {
            return null;
        }
        System.out.println(acclist);
        return acclist;
    }

    private Connection establishConnection() throws SQLException {
        // Lav en forbindelse
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/datingdb", "root", "password");

        return conn;
    }
}
