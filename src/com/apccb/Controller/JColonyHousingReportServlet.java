package com.apccb.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apccb.DAO.*;
import com.apccb.VO.CscpayVO;

@SuppressWarnings("serial")
@WebServlet("/servlet/JColonyHousingReportServlet")
public class JColonyHousingReportServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {

			CscpayVO cscvo = new CscpayVO();
			CSCpayDAO catdao = new CSCpayDAO();
			/*cscvo.setFlag(request.getParameter("flag"));
			cscvo.setMonth(request.getParameter("month"));
			cscvo.setYear(request.getParameter("year"));
			cscvo.setType(request.getParameter("type"));
			
			cscvo.setCtype(request.getParameter("ctype"));
			
			cscvo.setFrom_date(request.getParameter("FROM_DATE"));
			cscvo.setTo_date(request.getParameter("TO_DATE"));*/
			/*if ("SER".equals(cscvo.getCtype())) {
				//System.out.println(cscvo.getCtype());
				cscvo.setCircle(request.getParameter("circleName"));
				cscvo.setDivision(request.getParameter("divisionName"));
				//cscvo.setEro(request.getParameter("divisionName"));
				cscvo.setEro(request.getParameter("eroName"));
				cscvo.setSubDiv(request.getParameter("subdivName"));
				cscvo.setSec(request.getParameter("secName"));
				
				cscvo.setCtype(request.getParameter("SER"));
				cscvo = catdao.getJColonyHousingReportExportDetails(cscvo);
				request.setAttribute("cscvo", cscvo);
				rd = getServletContext().getRequestDispatcher("/pages/JColonyHousingScsReport.jsp");
				rd.forward(request, response);
				return;
			} else

			{*/

			cscvo.setLoginusername((String) request.getSession().getAttribute("userName"));
			cscvo.setLoginpassword((String) request.getSession().getAttribute("password"));
			cscvo = catdao.getJColonyHousingReportAbstractDetails(cscvo);
			rd = getServletContext().getRequestDispatcher("/pages/JColonyHousingAbstractReport.jsp");

			request.setAttribute("cscvo", cscvo);

			rd.forward(request, response);
            return;
			/*}*/
		}

		catch (Exception e) {
			e.printStackTrace();
			rd = getServletContext().getRequestDispatcher("/pages/dbFailure.jsp");
			rd.forward(request, response);
              return;
		} finally {

		}
	}
}