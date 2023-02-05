
import java.sql.Connection;
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
public class MS_SQL_Connect {
    
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
        
    Connection connection;
    PreparedStatement statement;
    ResultSet result = null, 
    stockResult;
    
  try {
   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   //connection Establishment
   connection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BankingService","sa","123456");
   statement=connection.prepareStatement("SELECT* FROM UserInfo");
   result=statement.executeQuery();
  }catch(SQLException e) {
   //e.printStackTrace();
  } catch (ClassNotFoundException e) {
   // TODO Auto-generated catch block
   //e.printStackTrace();
  }
  while(result.next()) {
   System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5)+" "+result.getString(6)+" "+result.getString(7)+" "+result.getString(8)+" "+result.getString(9)+" "+result.getString(10)+" "+result.getString(11)+" "+result.getString(12)+" "+result.getString(13));
   
  }
    }
    
}
    

