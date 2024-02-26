package com.apccb.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apccb.DAO.UserDao;
import com.apccb.VO.BaseVO;

import cn.org.rapid_framework.web.session.wrapper.HttpServletRequestSessionWrapper;

import java.io.IOException;

@SuppressWarnings("unused")
@WebServlet("/validateLogin")
public class LoginValidationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        System.out.println("U:"+username);
        System.out.println("P:"+password);
       
        String usertype = "AE";
        if (username == null || password == null) {
        	username = "";
            password = "";
        }
        UserDao userDAO = new UserDao();
        boolean isValidUser = userDAO.validateUser2(username, password);
        String captchaField = request.getParameter("captcha");
        String 	WEBPAGE = "";

        if (isValidUser) {
            String oldCaptcha = (String) request.getSession().getAttribute("captcha");
            if (!(captchaField.equals(oldCaptcha))) {
                request.setAttribute("status", "Invalid Captcha..");
                WEBPAGE = "/pages/Login";
            } else {
                HttpSession session = request.getSession(true);
             /*// Set the session timeout to 30 minutes (adjust the value as needed)
                int sessionTimeoutMinutes = 30;
                session.setMaxInactiveInterval(sessionTimeoutMinutes * 60);*/
                session.setAttribute("userName", username);
                session.setAttribute("password", password);
                session.setAttribute("usertype", usertype);
                WEBPAGE = "/pages/DashBoard";
            }
        } else {
            request.setAttribute("status", "Please Enter Valid User Name And Password");
            WEBPAGE = "/pages/Login";
        }

        // Forward the request to the appropriate view (e.g., JSP page)
        try {
			request.getRequestDispatcher(WEBPAGE + ".jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
