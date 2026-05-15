package demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    Connection con;

    public Connection getConnection() {

        try {

           //Class.forName("C:\\Users\\PRANAV\\Downloads\\mysql-connector-j-9.7.0\\mysql-connector-j-9.7.0\\mysql-connector-j-9.7.0.jar");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/novdecdemodb",
                "root",
                "pranav@123"
            );

            System.out.println("Database Connected");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(con);
        return con;
    }
}