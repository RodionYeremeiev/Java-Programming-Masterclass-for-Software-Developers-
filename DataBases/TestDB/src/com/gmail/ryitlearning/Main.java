package com.gmail.ryitlearning;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:F:\\IDE\\Projects\\Udemy\\Java Programming Masterclass for Software Developers\\java-programming-masterclass-for-software-developers\\DataBases\\TestDB\\testjava.db");
//             Statement statement = connection.createStatement();) {
//            statement.execute("CREATE TABLE contacts(name TEXT, phone INTEGER, email TEXT)");

        try {
//            Connection connection = DriverManager.getConnection("jdbc:sqlite:F:\\IDE\\Projects\\Udemy\\Java Programming Masterclass for Software Developers\\java-programming-masterclass-for-software-developers\\DataBases\\TestDB\\testjava.db");
//            Class.forName("org.sqlite.JDBC");

            Connection connection = DriverManager.getConnection("jdbc:sqlite:F:\\IDE\\Projects\\Udemy\\Java Programming Masterclass for Software Developers\\java-programming-masterclass-for-software-developers\\DataBases\\TestDB\\testjava.db");
//            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
//            statement.execute("CREATE TABLE IF NOT EXISTS contacts(name TEXT, phone INTEGER, email TEXT)");
//
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Rod', 123456, 'Rod@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Joe', 123789, 'Joe@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Bob', 654321, 'Bob@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Jim', 123789, 'Jim@email.com')");
//            statement.execute("UPDATE contacts SET phone = '753159' WHERE name='Jim'");
//            statement.execute("DELETE FROM contacts WHERE name='Rod'");
            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()){
                System.out.println(results.getString("name") + " " +
                                   results.getInt("phone") + " " +
                                   results.getString("email"));
            }
            results.close();

            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }
    }
}
