package com.gmail.ryitlearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE contacts(name TEXT, phone INTEGER, email TEXT)");

            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }
    }
}
