package com.secured_login_and_logoutDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao 
{
	public boolean validate(String userid,String userpass) 
	{
		    String qry="select * from login where username=? and password=?";
		    try {
				Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con;
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/old", "root", "password");
				PreparedStatement ps=con.prepareStatement(qry);
			    ps.setString(1, userid);
			    ps.setString(2, userpass);
			    ResultSet rs=ps.executeQuery();
			    if(rs.next())
			    {
			    	return true;
			    }
			    
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return false;
		    
		
	}

}
