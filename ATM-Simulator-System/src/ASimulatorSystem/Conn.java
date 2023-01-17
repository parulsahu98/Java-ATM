package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            System.out.println("me connection ke liye aaya hu");
                    String url="jdbc:mysql://localhost:3306/bankmanagementsystem";
			String user="root";
			String password="parul@123";
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","parul@123");
//           c=DriverManager.getConnection(url, user, password);
            s =c.createStatement(); 
           
          
            
           }catch(Exception e){ 
            System.out.println(e);
        }
         if(c!=null)
                   System.out.println("connection establish");
                   else
                   System.out.println("no");
    }  
}  