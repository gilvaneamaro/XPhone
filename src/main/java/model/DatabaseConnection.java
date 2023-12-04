package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection{
    public static Connection DatabseConnection() throws SQLException, ClassNotFoundException {

        Connection connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xphone", "devs", "password123");

        return connection;
    }
}