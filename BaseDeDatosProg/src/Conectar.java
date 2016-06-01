package src;

import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrián
 */
public class Conectar {
    Connection conectar=null;
    public Connection conexion(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           conectar=DriverManager.getConnection("jdbc:mysql://10.0.0.254/aabalalonso", 
                    "aabalalonso", "aabalalonso");
     }
       catch(Exception ex){
           System.out.println("No estas conectado");
       }
    return conectar;
    
    
    
    
    
}
}
