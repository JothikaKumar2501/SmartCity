/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcity;
import java.sql.*;

/**
 *
 * @author Harsha
 */
public class MyDatabase {
    public static Connection connect(){
    
        String LOCATION = "jdbc:mysql://localhost:3306/smartcitydb?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String USERNAME = "root";
        String PASSWORD = "root";
        
        Connection con = null;
        try{
        con = DriverManager.getConnection(LOCATION, USERNAME, PASSWORD);
        System.out.println("Connected");
        }
        catch(SQLException e){
            System.err.println(e);
        }
        
        return con;
    }
}
