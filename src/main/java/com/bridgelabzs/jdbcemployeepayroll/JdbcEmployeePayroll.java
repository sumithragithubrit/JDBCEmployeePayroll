package com.bridgelabzs.jdbcemployeepayroll;
import java.sql.*;

public class JdbcEmployeePayroll {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection to the database
            Connection conn = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/employee_Payroll_Service","root","Sumi@1234");

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");

            // Process the result set
            while (rs.next()) {
                System.out.println(rs.getString("salary"));
            }

            // Close the connection
            conn.close();

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}



