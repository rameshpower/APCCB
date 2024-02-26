package com.apccb.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.apccb.DAO.EauditDAO;
import com.apccb.VO.CscpayVO;

@SuppressWarnings("serial")
@WebServlet("/servlet/Rangewise11KVFeederLossesServlet")
public class Rangewise11KVFeederLossesServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = null;
		try {

			CscpayVO cscvo = new CscpayVO();
			EauditDAO Eauditdao = new EauditDAO();
			cscvo.setFlag(request.getParameter("flag"));
			/*cscvo.setMonth(request.getParameter("month"));
			cscvo.setYear(request.getParameter("year"));
			
			cscvo.setFrom_date(request.getParameter("FROM_DATE"));
			cscvo.setTo_date(request.getParameter("TO_DATE"));*/
			cscvo.setLoginusername((String) request.getSession().getAttribute("userName"));
			cscvo.setLoginpassword((String) request.getSession().getAttribute("password"));
			if("urban".equals(cscvo.getFlag())){
				cscvo = Eauditdao.getRangewise11KVFeederLosses_urban(cscvo);
				System.out.println(cscvo.getFlag());
				rd = getServletContext().getRequestDispatcher("/pages/Rangewise11KVFeederlosses.jsp");

				request.setAttribute("cscvo", cscvo);

				rd.forward(request, response);
	            return;
			}
			else if("rural".equals(cscvo.getFlag())){
				cscvo = Eauditdao.getRangewise11KVFeederLosses_rural(cscvo);
				System.out.println(cscvo.getFlag());
				rd = getServletContext().getRequestDispatcher("/pages/Rangewise11KVFeederlosses.jsp");

				request.setAttribute("cscvo", cscvo);

				rd.forward(request, response);
	            return;
			}else {
				cscvo = Eauditdao.getRangewise11KVFeederLosses(cscvo);
				rd = getServletContext().getRequestDispatcher("/pages/Rangewise11KVFeederlosses.jsp");

				request.setAttribute("cscvo", cscvo);

				rd.forward(request, response);
	            return;
			}
			
			
			
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