<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:directive.page import="com.apccb.VO.CscpayVO" />
<%
	if (session.getAttribute("userName") == null)
		response.sendRedirect("/pages/Login.jsp");
%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>APSPDCL</title>
<meta content="" name="description">
<meta content="" name="keywords">

<%@include file="plugins.jsp"%>
<link
	href="${pageContext.servletContext.contextPath}/assets/css/bootstrap-cerulean_Edited.css"
	rel="stylesheet">
<style>
/* body{
        background-image: url("${pageContext.servletContext.contextPath}/ResourcesFin/img/backgrounds/bgImg.jpg");
        backdrop-filter: blur(10px); 
        background-size:cover;
  		z-index: 2;
        filter: blur(8px);
  		-webkit-filter: blur(8px); 
      } */
body{
        background-image: url("${pageContext.servletContext.contextPath}/ResourcesFin/img/backgrounds/bgImg.jpg");
    	background-size:cover;
    }

.sortable {
	margin-top: 8%;
}

@media ( max-width :1000px) {
	.sortable {
		margin-top: 20%;
		height: 82em;
	}
}
</style>
<script>
	function updateDateTime() {
		var now = new Date();

		var day = now.getDate();
		var month = now.getMonth() + 1; // Months are zero-indexed
		var year = now.getFullYear();

		var hours = now.getHours();
		var minutes = now.getMinutes();
		var seconds = now.getSeconds();

		// Add leading zeros if needed
		month = month < 10 ? '0' + month : month;
		day = day < 10 ? '0' + day : day;
		hours = hours < 10 ? '0' + hours : hours;
		minutes = minutes < 10 ? '0' + minutes : minutes;
		seconds = seconds < 10 ? '0' + seconds : seconds;

		//var dateTimeString = year + '-' + month + '-' + day + ' ' + hours + ':' + minutes + ':' + seconds;
		var dateTimeString = day + '-' + month + '-' + year + ' &nbsp;&nbsp;'
				+ hours + ':' + minutes + ':' + seconds;

		// Update the element with id="datetime" with the new date and time
		document.getElementById("datetime").innerHTML = dateTimeString;

		// Update every 1000 milliseconds (1 second)
		setTimeout(updateDateTime, 1000);
	}

	// Call the function when the page is loaded
	window.onload = updateDateTime;
</script>
</head>

<body>
	<%@include file="headerLogOut.jsp"%>

	<section class="section dashboard">

		<div class="container">
			<div class="sortable row-fluid ui-sortable" id="app">

				<div class="span3 responsive" data-tablet="span6  fix-offset"
					data-desktop="span3">
					<div class="dashboard-stat" onclick="">
						<div class="visual">
							<img
								src="${pageContext.servletContext.contextPath}/assets/dashboardimages/loadcapacityimage.jpeg"
								style="width: 60px; height: 60px;">
						</div>
						<div class="details">
							<div class="number"></div>

							<a href="${pageContext.servletContext.contextPath}/">
								<div class="desc">Service Connection</div>
							</a>
						</div>
						<a class="more"
							href="${pageContext.servletContext.contextPath}/">
							View more <i class="m-icon-swapright m-icon-white"></i>
						</a>
					</div>
				</div>
				<div class="span3 responsive" data-tablet="span6  fix-offset"
					data-desktop="span3">
					<div class="dashboard-stat" onclick="">
						<div class="visual">
							<img
								src="${pageContext.servletContext.contextPath}/assets/dashboardimages/EAUDIT.jpg"
								style="width: 60px; height: 60px;">
						</div>
						<div class="details">
							<div class="number"></div>

							<a
								href="${pageContext.servletContext.contextPath}/EAUDITbase.jsp">
								<div class="desc">E AUDIT</div>
							</a>
						</div>
						<a class="more"
							href="${pageContext.servletContext.contextPath}/EAUDITbase.jsp">
							View more <i class="m-icon-swapright m-icon-white"></i>
						</a>
					</div>
				</div>

				<div class="span3 responsive" data-tablet="span6  fix-offset"
					data-desktop="span3">
					<div class="dashboard-stat"
						>
						<div class="visual">
							<img
								src="${pageContext.servletContext.contextPath}/assets/dashboardimages/meter box.jpg"
								style="width: 60px; height: 60px;">
						</div>
						<div class="details">
							<div class="number"></div>
							<div class="desc"
								onclick="loadapp('ServiceCon','1','Service Connection')">Meter
								Management</div>
						</div>
						<a class="more"
							onclick="loadapp('ServiceCon','1','Service Connection')">
							View more <i class="m-icon-swapright m-icon-white"></i>
						</a>
					</div>
				</div>

				<div class="span3 responsive" data-tablet="span6  fix-offset"
					data-desktop="span3">
					<div class="dashboard-stat"
						onclick="loadapp('CustomerCare','1','Customer Support')">
						<div class="visual">
							<img
								src="${pageContext.servletContext.contextPath}/assets/dashboardimages/userimg.jpeg"
								style="width: 60px; height: 60px;">
						</div>
						<div class="details">
							<div class="number"></div>
							<div class="desc"
								onclick="loadapp('CustomerCare','1','Customer Support')">CCC
								Complaints</div>
						</div>
						<a class="more"
							onclick="loadapp('CustomerCare','1','Customer Support')">
							View more <i class="m-icon-swapright m-icon-white"></i>
						</a>
					</div>
				</div>





				<div class="span3 responsive" data-tablet="span6  fix-offset"
					data-desktop="span3">
					<div class="dashboard-stat"
						onclick="loadapp('WORKORDER','1','Work Order')">
						<div class="visual">
							<img
								src="${pageContext.servletContext.contextPath}/assets/dashboardimages/subtations.jpg"
								style="width: 60px; height: 60px;">
						</div>
						<div class="details">
							<div class="number"></div>
							<div class="desc" onclick="loadapp('WORKORDER','1','Work Order')">SS
								Coordinates</div>
						</div>
						<a class="more" onclick="loadapp('WORKORDER','1','Work Order')">
							View more <i class="m-icon-swapright m-icon-white"></i>
						</a>
					</div>
				</div>

				<div class="span3 responsive" data-tablet="span6  fix-offset"
					data-desktop="span3">
					<div class="dashboard-stat"
						onclick="loadapp('MeterManagement','1','Meter <br> Management')">
						<div class="visual">
							<img
								src="${pageContext.servletContext.contextPath}/assets/dashboardimages/oms.gif"
								style="width: 60px; height: 60px;">
						</div>
						<div class="details">
							<div class="number"></div>
							<div class="desc"
								onclick="loadapp('MeterManagement','1','Meter <br> Management')">OMS</div>
						</div>
						<a class="more"
							onclick="loadapp('MeterManagement','1','Meter <br> Management')">
							View more <i class="m-icon-swapright m-icon-white"></i>
						</a>
					</div>
				</div>

				<div class="span3 responsive" data-tablet="span6  fix-offset"
					data-desktop="span3">
					<div class="dashboard-stat"
						onclick="loadapp('METERING','1','Metering')">
						<div class="visual">
							<img
								src="${pageContext.servletContext.contextPath}/assets/dashboardimages/subtations.jpg"
								style="width: 60px; height: 60px;">
						</div>
						<div class="details">
							<div class="number"></div>
							<div class="desc" onclick="loadapp('METERING','1','Metering')">GIS</div>
						</div>
						<a class="more" onclick="loadapp('METERING','1','Metering')">
							View more <i class="m-icon-swapright m-icon-white"></i>
						</a>
					</div>
				</div>

				<div class="span3 responsive" data-tablet="span6  fix-offset"
					data-desktop="span3">
					<div class="dashboard-stat"
						onclick="loadapp('REGISTERS','1','Registers')">
						<div class="visual">
							<img
								src="${pageContext.servletContext.contextPath}/assets/dashboardimages/registers.jpg"
								style="width: 60px; height: 60px;">
						</div>
						<div class="details">
							<div class="number"></div>
							<div class="desc" onclick="loadapp('REGISTERS','1','Registers')">Registers</div>
						</div>
						<a class="more" onclick="loadapp('REGISTERS','1','Registers')">
							View more <i class="m-icon-swapright m-icon-white"></i>
						</a>
					</div>
				</div>

				<div class="span3 responsive" data-tablet="span6  fix-offset"
					data-desktop="span3">
					<div class="dashboard-stat"
						onclick="loadapp('PAYMENTS','1','Payments')">
						<div class="visual">
							<img
								src="${pageContext.servletContext.contextPath}/assets/dashboardimages/sap_registers2.jpg"
								style="width: 60px; height: 60px;">
						</div>
						<div class="details">
							<div class="number"></div>
							<div class="desc" onclick="loadapp('PAYMENTS','1','Payments')">SAP
								Registers</div>
						</div>
						<a class="more" onclick="loadapp('PAYMENTS','1','Payments')">
							View more <i class="m-icon-swapright m-icon-white"></i>
						</a>
					</div>
				</div>

				<div class="span3 responsive" data-tablet="span6  fix-offset"
					data-desktop="span3">
					<div class="dashboard-stat" onclick="loadapp('MATS','1','MATS')">
						<div class="visual">
							<img
								src="${pageContext.servletContext.contextPath}/assets/dashboardimages/mats.jpg"
								style="width: 60px; height: 60px;">
						</div>
						<div class="details">
							<div class="number"></div>
							<div class="desc" onclick="loadapp('MATS','1','MATS')">MATS</div>
						</div>
						<a class="more" onclick="loadapp('MATS','1','MATS')"> View
							more <i class="m-icon-swapright m-icon-white"></i>
						</a>
					</div>
				</div>


			</div>
		</div>
	</section>

	<!-- End #main -->


	<a href="#"
		class="back-to-top d-flex align-items-center justify-content-center"><i
		class="bi bi-arrow-up-short"></i></a>

	<%@include file="footer.jsp"%>

</body>

</html>