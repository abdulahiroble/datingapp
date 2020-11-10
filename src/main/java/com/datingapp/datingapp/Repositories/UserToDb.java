/*
 * package com.datingapp.datingapp.Repositories;
 * 
 * import org.apache.derby.iapi.sql.PreparedStatement; import
 * org.apache.logging.log4j.core.appender.db.jdbc.DriverManagerConnectionSource;
 * 
 * import clojure.tools.nrepl.Connection;
 * 
 * public class UserToDb { try { // create a mysql database connection String
 * myDriver = "org.gjt.mm.mysql.Driver"; String myUrl =
 * "jdbc:mysql://localhost/profile"; Class.forName(myDriver); Connection conn =
 * DriverManagerConnectionSource.getConnection(myUrl, "root", "");
 * 
 * // create a sql date object so we can use it in our INSERT statement Calendar
 * calendar = Calendar.getInstance(); java.sql.Date startDate = new
 * java.sql.Date(calendar.getTime().getTime());
 * 
 * // the mysql insert statement String query =
 * " insert into users (first_name, last_name, date_created, is_admin, num_points)"
 * + " values (?, ?, ?, ?, ?)";
 * 
 * // create the mysql insert preparedstatement PreparedStatement preparedStmt =
 * conn.prepareStatement(query); preparedStmt.setString (1, "Barney");
 * preparedStmt.setString (2, "Rubble"); preparedStmt.setDate (3, startDate);
 * preparedStmt.setBoolean(4, false); preparedStmt.setInt (5, 5000);
 * 
 * // execute the preparedstatement preparedStmt.execute();
 * 
 * conn.close(); } catch (Exception e) {
 * System.err.println("Got an exception!"); System.err.println(e.getMessage());
 * }
 * 
 * 
 * 
 * }
 */