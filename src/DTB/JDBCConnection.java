package DTB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCConnection {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/projectjava";
    private static final String USERNAME = "";
    private static final String PASSWORD = "";
//    public static final String HOST_URI = "jdbc:mysql://localhost:3306/quanlicuahangthoitrang";
//    public static final String USER = "root";
//    public static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        Properties properties = new Properties();
        properties.setProperty("user", USERNAME);
        properties.setProperty("password", PASSWORD);

        return DriverManager.getConnection(DATABASE_URL, properties);
    }
}

