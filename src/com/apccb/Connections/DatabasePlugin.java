package com.apccb.Connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.List;
import java.util.Map;




public class DatabasePlugin  {



public static List  executeQuery(String sql,String dbUserName) {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    List result = null;    
  // System.out.println("dbUserName"+dbUserName);
    try {
    	
      con = DBConnectionManager.getInstance().getConnection(dbUserName);     
     
      ps = con.prepareStatement(sql);
      rs = ps.executeQuery();    
      ResultSetMetaData rm = rs.getMetaData();
      int cols = rm.getColumnCount();
      
	    if (rs.next()) {
	      result = new ArrayList();
	      do {
	           Map row = new HashMap(cols);
	           for (int i = 1; i <= cols; i++) {
	          String columnName = rm.getColumnName(i);
	          Object columnValue = rs.getObject(i);
	          row.put(columnName, columnValue);
	        }
	
	        result.add(row);
	      }
	      while (
	        rs.next());
	    }  

    }
    catch (SQLException se)
    {
      se.printStackTrace();
    } finally {
      close(con, ps, rs);
    }
    return result;
  }


public static String getStringfromQuery(String sql, String dbUserName)
{
  String first = "";
  Connection con = null;
  Statement st = null;
  ResultSet rs = null; 
  try
  {
	  con = DBConnectionManager.getInstance().getConnection(dbUserName);     
    st = con.createStatement();
    rs = st.executeQuery(sql);
    if (rs.next())
    {
      first = rs.getString(1);
    }
  } catch (SQLException se) {
    first = "0";
    se.printStackTrace();
  } finally {
    close(con, st, rs);
  }
  return first;
}



public static void close(Connection conn, Statement stm, ResultSet rs)
{
  if (rs != null) {
    try {
      rs.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    rs = null;
  }
  if (stm != null) {
    try {
      stm.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    stm = null;
  }
  if (conn != null) {
    try {
      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    conn = null;
  }
}

}

