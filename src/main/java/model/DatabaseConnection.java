package model;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection{
    public static Connection connection() throws SQLException, ClassNotFoundException {

        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xphone", "dev", "password123");
        return connection;
    }
}