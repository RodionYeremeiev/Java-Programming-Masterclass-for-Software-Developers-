package com.gmail.ryitlearning;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:F:\\IDE\\Projects\\Udemy\\Java Programming Masterclass for Software Developers\\java-programming-masterclass-for-software-developers\\DataBases\\TestDB\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = connection.createStatement();
//            connection.setAutoCommit(false);

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text" +
                    ")");

            insertContact(statement,"Rod", 123456, "Rod@email.com" );
            insertContact(statement,"Joe",123789, "Joe@email.com" );
            insertContact(statement,"Bob",654321, "Bob@email.com" );
            insertContact(statement,"Jim",123789, "Jim@email.com" );

//            statement.execute("INSERT  INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL + " ) " +
//                    "VALUES('Rod', 123456, 'Rod@email.com')");

//            statement.execute("INSERT  INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL +
//                    " ) " +
//                    "VALUES('Joe', 123789, 'Joe@email.com')");

//            statement.execute("INSERT  INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL + " ) " +
//                    "VALUES('Bob', 654321, 'Bob@email.com')");

//            statement.execute("INSERT  INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL + " ) " +
//                    "VALUES('Jim', 123789, 'Jim@email.com')");


            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "= '753159'" +
                    " WHERE " + COLUMN_NAME + " ='Jim'");

            statement.execute("DELETE " + " FROM " + TABLE_CONTACTS +
                    " WHERE " + COLUMN_NAME + " ='Bob'");

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);

            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }


//
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Rod', 123456, 'Rod@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Joe', 123789, 'Joe@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Bob', 654321, 'Bob@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Jim', 123789, 'Jim@email.com')");
//            statement.execute("UPDATE contacts SET phone = '753159' WHERE name='Jim'");
//            statement.execute("DELETE FROM contacts WHERE name='Rod'");
//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();

//            ResultSet results = statement.executeQuery("SELECT * FROM contacts");

//            while (results.next()) {
//                System.out.println(results.getString("name") + " " +
//                        results.getInt("phone") + " " +
//                        results.getString("email"));
//            }
            results.close();

            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email)throws SQLException{
        statement.execute("INSERT  INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL + " ) " +
                "VALUES('" + name + "', " + phone +", '" + email + "')");
    }
}
