<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.jsp.jstl.core.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<%@ page import="java.math.*"%>
<%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid"%>
<jsp:directive.page import="com.apccb.VO.CscpayVO" /> 

<%
    HttpSession Session = request.getSession(false);

    // Check if the user is logged in
    if (Session != null) {
        // Perform logout actions (if any)
        session.invalidate();
    }

    // Redirect to the login page
    response.sendRedirect("Login.jsp");
%>
