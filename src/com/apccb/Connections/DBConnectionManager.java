package com.apccb.Connections;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnectionManager {
	static private DBConnectionManager instance;

	static synchronized public DBConnectionManager getInstance() {

		if (instance == null) {
			instance = new DBConnectionManager();
		}
		return instance;
	}

	public void freeConnection(Connection con) throws Exception {
		con.close();
	}

	public Connection getConnection(String name) {
		Connection dbconn = null;
		DataSource ds = null;
		try {
			synchronized (name) {
			String jndiname = "java:/comp/env/jdbc/".concat(name);
			Context initContext = new InitialContext();
			ds = (javax.sql.DataSource) initContext.lookup(jndiname);
			}
			dbconn = ds.getConnection();
		} catch (Exception e) {
		}
		return dbconn;
	}
}
