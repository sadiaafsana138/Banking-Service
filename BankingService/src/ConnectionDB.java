
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mumu
 */
import java.sql.*;

public class ConnectionDB {

    public void connectDB() {
        Connection connection;
        PreparedStatement statement;
        ResultSet result = null,
                stockResult;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //connection Establishment
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BankingService", "sa", "123456");
             java.util.Date date = new java.util.Date();
                    System.out.println(date.toString());
        } catch (SQLException e) {
            //e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
