
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mumu
 */
public class Variables {
    
   static int UserId = 0;
   static String PhoneNo= null;
   static String Name = null;
   static float Blance =0;

    public Variables(int userid,String PhoneNo,String Name) {
        Variables.UserId=userid;
        Variables.PhoneNo=PhoneNo;
        Variables.Name=Name;
    }
   
   
    
}
