/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdb;
import java.sql.*;
/**
 *
 * @author Coco
 */
public class ConnectionProvider {
    public static Connection getcon(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","abk2023");
        return con;
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e);
            return null;
        }
    }
    
    
}
