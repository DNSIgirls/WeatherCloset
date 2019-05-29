package com.example.weathercloset;
import android.os.Bundle;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLJava {
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://91.237.240.44:3306/DNSI";
    private static final String user = "DNSI";
    private static final String password = "dnsi4";
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private static ResultSetMetaData rsmd;

    public void onCreate() {

    }

    public void execQuery() {
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            System.out.println("Enter query:");
//            Scanner in = new Scanner(System.in);
//            String query = in.nextLine();
            String query = "SELECT * FROM new_table;";
            // executing SELECT query
            rs = stmt.executeQuery(query);
            // obtain metadata
            rsmd = rs.getMetaData();
            System.out.println("MySQL Query Result:");
            while (rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    System.out.print(rs.getString(i) + " | ");
                }
                System.out.println("");
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            // close connection ,stmt and resultset here
            try {
                con.close();
                stmt.close();
                rs.close();
            } catch (SQLException se) {
                System.out.print("ERROR: SQLException " + se.getMessage());
            }
        }
    }

}
