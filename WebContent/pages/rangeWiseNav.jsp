<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.jsp.jstl.core.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>
<%@ page import="java.math.*"%>
<%@ page import="java.text.*"%>

<jsp:directive.page import="com.apccb.VO.CscpayVO" />
<%-- <%@include file="plugins.jsp" %> --%>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<%
	CscpayVO baseMainVO = (CscpayVO) request.getAttribute("cscvo");

	Map<String, CscpayVO> cdbmap = baseMainVO.getCscpaymap();
	Map<String, String> monthslist = new HashMap<String, String>();
	monthslist.put("1", "January");
	monthslist.put("2", "February ");
	monthslist.put("3", "March");
	monthslist.put("4", "April");
	monthslist.put("5", "May");
	monthslist.put("6", "June");
	monthslist.put("7", "July");
	monthslist.put("8", "August");
	monthslist.put("9", "September");
	monthslist.put("10", "October");
	monthslist.put("11", "November");
	monthslist.put("12", "December");
	Calendar c = Calendar.getInstance();
	int year = c.get(Calendar.YEAR);
	String month = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
	//Map<String, String> monthslist = new HashMap<String, String>();

	String[] monthName = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
	Calendar cal = Calendar.getInstance();
	int curr_year = cal.get(Calendar.YEAR);
	int curr_month = cal.get(Calendar.MONTH) + 1;
	int pre_month = cal.get(Calendar.MONTH) - 1;
	
	int curr_date = cal.get(Calendar.DATE);

	String startDate = null;
	String endDate = null;

	DateFormat df = new SimpleDateFormat("dd-MM-yy");

	startDate = "01-".concat((monthName[(curr_month - 1)]).concat("-".concat(String.valueOf(curr_year))));
	String endDate1 = String.valueOf(curr_date);
	if (endDate1.length() == 1)
		endDate1 = "0".concat(endDate1);
	endDate = endDate1.concat("-")
			.concat((monthName[(curr_month - 1)]).concat("-".concat(String.valueOf(curr_year))));
%>

    <div class="pagetitle">
      <h1>Dashboard</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item">Home</li>
          <li class="breadcrumb-item ">Dashboard</li>
          <li class="breadcrumb-item active">E-Audit</li>
          <li class="breadcrumb-item active">
	          <% if("urban".equals(baseMainVO.getFlag())){%>
				
				<span style="font-size: 14px; color: #26739f">Range wise URBAN 11 KV Feeder losses   as on <span style="color: #ff6600">(<%=endDate%>)</span></span>
			  <%}else if("rural".equals(baseMainVO.getFlag())){ %>
				<span style="font-size: 14px; color: #26739f">Range wise RURAL 11 KV Feeder losses   as on <span style="color: #ff6600">(<%=endDate%>)</span></span>
			  <%}else { %>
				<span style="font-size: 14px; color: #26739f">Range wise 11 KV Feeder losses   as on <span style="color: #ff6600">(<%=endDate%>)</span></span>	
			  <%} %>
		  </li>
        </ol>
      </nav>
    </div><!-- End Page Title -->
    
    
     <section class="section">
      <div class="row">
        <div class="col-lg-12">

          <div class="card">
            <div class="card-body">
<!-- Table with stripped rows -->
              <table class="table datatable">
                <thead>
                  <tr>
                    <th><b>SNO</b></th>
                    <th><b>SECTION</b></th>
                    <th><b>Total Feeders</b></th>
<!--                     <th data-type="date" data-format="YYYY/DD/MM">Start Date</th> -->
                    <th><b>Feeders with -ve Losses </b></th>
                    <th><b>Feeders with 0-10% Losses</b></th>
                    <th><b>Feeders with 10-20% Losses</b></th>
                    <th><b>Feeders with Losses > 20%</b></th>
                    <th><b>Feeders with no input/sales</b></th>
                  </tr>
                </thead>
                <tbody>
                	 <% int count = 1;
						for (Map.Entry<String, CscpayVO> entry : cdbmap.entrySet()) {
						CscpayVO mapvale = entry.getValue();
						%>
						<tr>
							<td><%=count%></td>
							<!-- 	18052021 -->
							<td><%=entry.getKey()%></td>
							<td><%=mapvale.getCat1Scs()%></td>
							<td><%=mapvale.getCat2Scs()%></td>
							<td><%=mapvale.getCat3Scs()%></td>
							<td><%=mapvale.getCat4Scs()%></td>
							<td><%=mapvale.getCat5Agl()%></td>
							<td><%=mapvale.getCat5Other()%></td>
						</tr>
						<% count++;
						} %>
                </tbody>
              </table>
              <!-- End Table with stripped rows -->

            </div>
          </div>
        </div>
      </div>
    </section>

        
 
	