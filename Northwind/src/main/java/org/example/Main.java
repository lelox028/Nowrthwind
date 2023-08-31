package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/northwind"; // JDBC URL for your database
        String username = "root"; // Replace with your database username
        String password = "Shihonage50."; // Replace with your database password

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to the database.");

            // Create a statement for executing queries
            Statement statement = connection.createStatement();

            // SQL query
            String query = "SELECT * FROM categories";

            // Execute the query
            ResultSet resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                /*String customerId = resultSet.getString("CategoryID");
                String companyName = resultSet.getString("name");
                String contactName = resultSet.getString("Description");

                System.out.println("CustomerID: " + customerId + ", CompanyName: " + companyName + ", ContactName: " + contactName);
                */
                System.out.println("coso: "+resultSet);
            }

            // Close the resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}