package com.apccb.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.apccb.Connections.*;


@SuppressWarnings("unused")
public class UserDao {
	

    public boolean validateUser(String username, String password) {
    	
    	
        try (Connection con = DBConnectionManager.getInstance().getConnection("cscdb")) {
            String query = "SELECT USER_ID,USER_PASSWORD,USER_TYPE FROM cscappusers where   USER_TYPE='AE' AND USER_ID=? and USER_PASSWORD=?";
            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                	
                    return resultSet.next(); // true if user exists, false otherwise
                }
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exception appropriately
            return false;
        } 
        finally {  
        	
        }
        
    }
    @SuppressWarnings("unused")
	public boolean validateUser2(String username, String password) {
    	
    	Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        con = DBConnectionManager.getInstance().getConnection("cscdb");
    	try{
    		if(con !=null){
    			
    			String query = "SELECT USER_ID,USER_PASSWORD,USER_TYPE FROM cscappusers where   USER_TYPE='AE' AND USER_ID=? and USER_PASSWORD=?";
    			ps = con.prepareStatement(query);
    			ps.setString(1, username);
    			ps.setString(2, password);
    			 rs=ps.executeQuery();
    			 //System.out.println("loginqry :" + query);
    			
    				 return rs.next();
					
    		}else {
				
				try {
					throw new Exception(
							"Database Server Problem.Sorry for Inconvenience.Please try after some time.");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
    		
    	}catch (SQLException e) {
            e.printStackTrace();
            // Handle exception appropriately
            return false;
        } 
finally {  
	if (ps != null) {
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	try {
        if (con != null && !con.isClosed()) {
        	con.close();
        }
    } catch (Exception e) {
    	try {
			throw new Exception("Error closing database connection", e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
		
        }
		return false;
    	
    	
    		
    }
    
    

}

