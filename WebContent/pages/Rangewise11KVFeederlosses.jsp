<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.jsp.jstl.core.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<%@ page import="java.math.*"%>
<%@ page import="java.text.*"%>

<jsp:directive.page import="com.apccb.VO.CscpayVO" />

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>APSPDCL</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

	<%@include file="plugins.jsp" %>
</head>
 <body>

  	<%@include file="headerLogOut.jsp" %>

	<%@include file="sideNav.jsp" %>

  <main id="main" class="main">

	<%@include file="rangeWiseNav.jsp" %>




<!--     <section class="section dashboard">
      <div class="row">

       </div>
    </section> -->

  </main><!-- End #main -->
	<!-- REQUIRED JS SCRIPTS -->

  <%@include file="footer.jsp" %>
  
</body>

</html>