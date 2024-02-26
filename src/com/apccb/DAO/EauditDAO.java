package com.apccb.DAO;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.apccb.Connections.DBConnectionManager;
import com.apccb.Exception.DatabaseFailureException;
import com.apccb.VO.CscpayVO;

@SuppressWarnings("unused")
public class EauditDAO {
	public CscpayVO getRangewise11KVFeederLosses(CscpayVO cscvo) throws SQLException, DatabaseFailureException,
	InstantiationException, IllegalAccessException, ClassNotFoundException {

	PreparedStatement reportPStmt = null;
	ResultSet reportRst = null;

	Calendar c = Calendar.getInstance();
	int curr_year = c.get(Calendar.YEAR);
	int curr_month = c.get(Calendar.MONTH) + 1;

	List<CscpayVO> dashList = new ArrayList<CscpayVO>();

	Connection con = DBConnectionManager.getInstance().getConnection("Migration");
	Map<String, CscpayVO> cscmap = new LinkedHashMap<String, CscpayVO>();
	
	try {
		if (con != null) {

			
				String query = "select nvl(S.SECNAME,'TOTAL')\r\n" + 
						",count(distinct fmsapfcode) totfdrs\r\n" + 
						",count(case when nvl(units,0)>0 and losspct < 0 then 1 end) negfdrs\r\n" + 
						",count(case when nvl(totsales,0)>0 and losspct >= 0 and losspct <= 10 then 1 end) fdrs010\r\n" + 
						",count(case when nvl(totsales,0)>0 and losspct > 10 and losspct <= 20 then 1 end) fdrs1020\r\n" + 
						",count(case when nvl(totsales,0)>0 and losspct > 20 then 1 end) fdrs20gt\r\n" + 
						",count(case when (nvl(units,0)=0 or nvl(totsales,0)=0) then  1 end) nafdrs\r\n" + 
						"from EAUDIT.sqlrep4dtab  e ,master.spdclmaster s,MASTER.ALLUSERS a\r\n" + 
						"where S.SECCD=a.UNITCODE AND e.SECNAME=s.SECNAME \r\n" + 
						"AND a.APPUSER='"+cscvo.getLoginusername()+"' \r\n" + 
						"--AND TODATE BETWEEN TO_DATE('01-11-23') AND TO_DATE('30-11-23')\r\n" + 
						"GROUP BY  ROLLUP (S.SECNAME) ";
				
				reportPStmt = con.prepareStatement(query);
				System.out.println(cscvo.getLoginusername());
				System.out.println(query);
				reportRst = reportPStmt.executeQuery();
				//System.out.println("CATWISE:"+query);
			
			if (reportRst != null) {
				while (reportRst.next()) {

					if (cscmap.containsKey(reportRst.getString(1))) {

						CscpayVO dmapobj = cscmap.get(reportRst.getString(1));

						dmapobj.setCat1Scs(reportRst.getInt(2));
						dmapobj.setCat2Scs(reportRst.getInt(3));
						dmapobj.setCat3Scs(reportRst.getInt(4));
						dmapobj.setCat4Scs(reportRst.getInt(5));

						dmapobj.setCat5Agl(reportRst.getInt(6));
						
						dmapobj.setCat5Other(reportRst.getInt(7));
						
						

					} else {
						CscpayVO dmapobj = new CscpayVO();

						dmapobj.setCat1Scs(reportRst.getInt(2));
						dmapobj.setCat2Scs(reportRst.getInt(3));
						dmapobj.setCat3Scs(reportRst.getInt(4));
						dmapobj.setCat4Scs(reportRst.getInt(5));

						dmapobj.setCat5Agl(reportRst.getInt(6));
						
						dmapobj.setCat5Other(reportRst.getInt(7));
						

						cscmap.put(reportRst.getString(1), dmapobj);
					}
				}
				cscvo.setCscpaymap(cscmap);

			}

		} else {
			throw new DatabaseFailureException(
					"Database Server Problem.Sorry for Inconvenience.Please try after some time.");
		}
	} finally {
		try {
			if (con != null) {

				DBConnectionManager.getInstance().freeConnection(con);
				con.close();
			}
			if (reportPStmt != null)
				reportPStmt.close();
			if (reportRst != null)
				reportRst.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	return cscvo;
}
	public CscpayVO getRangewise11KVFeederLosses_urban(CscpayVO cscvo) throws SQLException, DatabaseFailureException,
	InstantiationException, IllegalAccessException, ClassNotFoundException {


		PreparedStatement reportPStmt = null;
		ResultSet reportRst = null;

		Calendar c = Calendar.getInstance();
		int curr_year = c.get(Calendar.YEAR);
		int curr_month = c.get(Calendar.MONTH) + 1;

		List<CscpayVO> dashList = new ArrayList<CscpayVO>();

		Connection con = DBConnectionManager.getInstance().getConnection("Migration");
		Map<String, CscpayVO> cscmap = new LinkedHashMap<String, CscpayVO>();
		
		try {
			if (con != null) {

				
					String query = "select nvl(S.SECNAME,'TOTAL')\r\n" + 
							",count(distinct fmsapfcode) totfdrs\r\n" + 
							",count(case when nvl(units,0)>0 and losspct < 0 then 1 end) negfdrs\r\n" + 
							",count(case when nvl(totsales,0)>0 and losspct >= 0 and losspct <= 10 then 1 end) fdrs010\r\n" + 
							",count(case when nvl(totsales,0)>0 and losspct > 10 and losspct <= 20 then 1 end) fdrs1020\r\n" + 
							",count(case when nvl(totsales,0)>0 and losspct > 20 then 1 end) fdrs20gt\r\n" + 
							",count(case when (nvl(units,0)=0 or nvl(totsales,0)=0) then  1 end) nafdrs\r\n" + 
							"from EAUDIT.sqlrep4dtab  e ,master.spdclmaster s,MASTER.ALLUSERS a\r\n" + 
							"where S.SECCD=a.UNITCODE AND e.SECNAME=s.SECNAME \r\n" + 
							"AND a.APPUSER='"+cscvo.getLoginusername()+"' \r\n"+
							"AND  upper(nvl(fmtype,'NA')) NOT  LIKE '%RURAL%'"+ 
							"--AND TODATE BETWEEN TO_DATE('01-11-23') AND TO_DATE('30-11-23')\r\n" + 
							"GROUP BY  ROLLUP (S.SECNAME) ";
					
					reportPStmt = con.prepareStatement(query);
					System.out.println(cscvo.getLoginusername());
					System.out.println(query);
					reportRst = reportPStmt.executeQuery();
					//System.out.println("CATWISE:"+query);
				
				if (reportRst != null) {
					while (reportRst.next()) {

						if (cscmap.containsKey(reportRst.getString(1))) {

							CscpayVO dmapobj = cscmap.get(reportRst.getString(1));

							dmapobj.setCat1Scs(reportRst.getInt(2));
							dmapobj.setCat2Scs(reportRst.getInt(3));
							dmapobj.setCat3Scs(reportRst.getInt(4));
							dmapobj.setCat4Scs(reportRst.getInt(5));

							dmapobj.setCat5Agl(reportRst.getInt(6));
							
							dmapobj.setCat5Other(reportRst.getInt(7));
							
							

						} else {
							CscpayVO dmapobj = new CscpayVO();

							dmapobj.setCat1Scs(reportRst.getInt(2));
							dmapobj.setCat2Scs(reportRst.getInt(3));
							dmapobj.setCat3Scs(reportRst.getInt(4));
							dmapobj.setCat4Scs(reportRst.getInt(5));

							dmapobj.setCat5Agl(reportRst.getInt(6));
							
							dmapobj.setCat5Other(reportRst.getInt(7));
							

							cscmap.put(reportRst.getString(1), dmapobj);
						}
					}
					cscvo.setCscpaymap(cscmap);

				}

			} else {
				throw new DatabaseFailureException(
						"Database Server Problem.Sorry for Inconvenience.Please try after some time.");
			}
		} finally {
			try {
				if (con != null) {

					DBConnectionManager.getInstance().freeConnection(con);
					con.close();
				}
				if (reportPStmt != null)
					reportPStmt.close();
				if (reportRst != null)
					reportRst.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return cscvo;

		
	}
	public CscpayVO getRangewise11KVFeederLosses_rural(CscpayVO cscvo) throws SQLException, DatabaseFailureException,
	InstantiationException, IllegalAccessException, ClassNotFoundException {



		PreparedStatement reportPStmt = null;
		ResultSet reportRst = null;

		Calendar c = Calendar.getInstance();
		int curr_year = c.get(Calendar.YEAR);
		int curr_month = c.get(Calendar.MONTH) + 1;

		List<CscpayVO> dashList = new ArrayList<CscpayVO>();

		Connection con = DBConnectionManager.getInstance().getConnection("Migration");
		Map<String, CscpayVO> cscmap = new LinkedHashMap<String, CscpayVO>();
		
		try {
			if (con != null) {

				
					String query = "select nvl(S.SECNAME,'TOTAL')\r\n" + 
							",count(distinct fmsapfcode) totfdrs\r\n" + 
							",count(case when nvl(units,0)>0 and losspct < 0 then 1 end) negfdrs\r\n" + 
							",count(case when nvl(totsales,0)>0 and losspct >= 0 and losspct <= 10 then 1 end) fdrs010\r\n" + 
							",count(case when nvl(totsales,0)>0 and losspct > 10 and losspct <= 20 then 1 end) fdrs1020\r\n" + 
							",count(case when nvl(totsales,0)>0 and losspct > 20 then 1 end) fdrs20gt\r\n" + 
							",count(case when (nvl(units,0)=0 or nvl(totsales,0)=0) then  1 end) nafdrs\r\n" + 
							"from EAUDIT.sqlrep4dtab  e ,master.spdclmaster s,MASTER.ALLUSERS a\r\n" + 
							"where S.SECCD=a.UNITCODE AND e.SECNAME=s.SECNAME \r\n" + 
							"AND a.APPUSER='"+cscvo.getLoginusername()+"' \r\n"+
							"AND  upper(nvl(fmtype,'NA'))  LIKE '%RURAL%'"+ 
							"--AND TODATE BETWEEN TO_DATE('01-11-23') AND TO_DATE('30-11-23')\r\n" + 
							"GROUP BY  ROLLUP (S.SECNAME) ";
					
					reportPStmt = con.prepareStatement(query);
					System.out.println(cscvo.getLoginusername());
					System.out.println(query);
					reportRst = reportPStmt.executeQuery();
					//System.out.println("CATWISE:"+query);
				
				if (reportRst != null) {
					while (reportRst.next()) {

						if (cscmap.containsKey(reportRst.getString(1))) {

							CscpayVO dmapobj = cscmap.get(reportRst.getString(1));

							dmapobj.setCat1Scs(reportRst.getInt(2));
							dmapobj.setCat2Scs(reportRst.getInt(3));
							dmapobj.setCat3Scs(reportRst.getInt(4));
							dmapobj.setCat4Scs(reportRst.getInt(5));

							dmapobj.setCat5Agl(reportRst.getInt(6));
							
							dmapobj.setCat5Other(reportRst.getInt(7));
							
							

						} else {
							CscpayVO dmapobj = new CscpayVO();

							dmapobj.setCat1Scs(reportRst.getInt(2));
							dmapobj.setCat2Scs(reportRst.getInt(3));
							dmapobj.setCat3Scs(reportRst.getInt(4));
							dmapobj.setCat4Scs(reportRst.getInt(5));

							dmapobj.setCat5Agl(reportRst.getInt(6));
							
							dmapobj.setCat5Other(reportRst.getInt(7));
							

							cscmap.put(reportRst.getString(1), dmapobj);
						}
					}
					cscvo.setCscpaymap(cscmap);

				}

			} else {
				throw new DatabaseFailureException(
						"Database Server Problem.Sorry for Inconvenience.Please try after some time.");
			}
		} finally {
			try {
				if (con != null) {

					DBConnectionManager.getInstance().freeConnection(con);
					con.close();
				}
				if (reportPStmt != null)
					reportPStmt.close();
				if (reportRst != null)
					reportRst.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return cscvo;

		
	
		
		
	}
	

}
