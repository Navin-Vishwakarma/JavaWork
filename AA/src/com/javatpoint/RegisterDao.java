package com.javatpoint;  
import java.sql.*;  
public class RegisterDao {  
  
public static int save(RegisterAction r){  
int status=0;  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/new","root","welcome");  
  
PreparedStatement ps=con.prepareStatement("insert into new_table values(?,?,?,?,?,?)");  
ps.setInt(1,r.getId());
ps.setString(2,r.getName()); 
ps.setString(3,r.getPassword());  
ps.setString(4,r.getEmail());  
ps.setString(5,r.getGender());  
ps.setString(6,r.getCountry());  
          
status=ps.executeUpdate();  
  
}catch(Exception e){e.printStackTrace();}  
    return status;  
   
}  
}  