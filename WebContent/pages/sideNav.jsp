
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">
  <!-- ======= Sidebar ======= -->
  <aside id="sidebar" class="sidebar">

    <ul class="sidebar-nav" id="sidebar-nav">

      <li class="nav-item">
<!--           <span class="nav-link"> <i class="bi bi-grid"></i> Dashboard</span> -->
		<a class="nav-link " href="${pageContext.servletContext.contextPath}/EAUDITbase.jsp">
          <i class="bi bi-grid"></i><span class="nav-link">Dashboard</span>
        </a> 
      </li><!-- End Dashboard Nav -->
<!--       Service Connection -->
      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#service" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span><b>Service Connection</b></span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <%-- <ul id="service" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <!-- <a href="components-alerts.html">
              <i class="bi bi-circle"></i><span>Alerts</span>
            </a> -->
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet"> 
            	<i class="fa fa-fw fa-book"></i> <span>Range wise   11KV Feeder Losses Report</span>
            </a>
          </li>
          <li>
	          <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=urban"> 
	         	 <i class="fa fa-fw fa-book"></i><span> Range wise Urban 11KV Feeder Losses Report</span>
	          </a>
          </li>
          <li>
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=rural">
            	 <i class="fa fa-fw fa-book"></i><span> Range wise RURAL 11KV RURAL Feeder Losses Report</span>
            </a>
          </li> 
         </ul> --%>
      </li><!-- End Components Nav -->
    
<!--       E AUDIT -->
      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#Eaudit" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span><b>E-AUDIT</b></span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="Eaudit" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <!-- <a href="components-alerts.html">
              <i class="bi bi-circle"></i><span>Alerts</span>
            </a> -->
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet"> 
            	<i class="fa fa-fw fa-book"></i> <span>Range wise   11KV Feeder Losses Report</span>
            </a>
          </li>
          <li>
	          <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=urban"> 
	         	 <i class="fa fa-fw fa-book"></i><span> Range wise Urban 11KV Feeder Losses Report</span>
	          </a>
          </li>
          <li>
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=rural">
            	 <i class="fa fa-fw fa-book"></i><span> Range wise RURAL 11KV RURAL Feeder Losses Report</span>
            </a>
          </li>
         </ul>
      </li><!-- End Components Nav -->
    
<!--       Meter Management -->

 <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#meter" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span><b>Meter Management</b></span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <%-- <ul id="meter" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <!-- <a href="components-alerts.html">
              <i class="bi bi-circle"></i><span>Alerts</span>
            </a> -->
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet"> 
            	<i class="fa fa-fw fa-book"></i> <span>Range wise   11KV Feeder Losses Report</span>
            </a>
          </li>
          <li>
	          <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=urban"> 
	         	 <i class="fa fa-fw fa-book"></i><span> Range wise Urban 11KV Feeder Losses Report</span>
	          </a>
          </li>
          <li>
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=rural">
            	 <i class="fa fa-fw fa-book"></i><span> Range wise RURAL 11KV RURAL Feeder Losses Report</span>
            </a>
          </li> 
         </ul> --%>
      </li><!-- End Components Nav -->
      
<!--       CCC Complaints -->

 <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#CCC" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span><b>CCC Complaints</b></span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <%-- <ul id="CCC" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <!-- <a href="components-alerts.html">
              <i class="bi bi-circle"></i><span>Alerts</span>
            </a> -->
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet"> 
            	<i class="fa fa-fw fa-book"></i> <span>Range wise   11KV Feeder Losses Report</span>
            </a>
          </li>
          <li>
	          <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=urban"> 
	         	 <i class="fa fa-fw fa-book"></i><span> Range wise Urban 11KV Feeder Losses Report</span>
	          </a>
          </li>
          <li>
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=rural">
            	 <i class="fa fa-fw fa-book"></i><span> Range wise RURAL 11KV RURAL Feeder Losses Report</span>
            </a>
          </li> 
         </ul> --%>
      </li><!-- End Components Nav -->
      
<!--       SS Coordinates -->

<li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#SSC" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span><b>SS Coordinates</b></span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <%-- <ul id="SSC" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <!-- <a href="components-alerts.html">
              <i class="bi bi-circle"></i><span>Alerts</span>
            </a> -->
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet"> 
            	<i class="fa fa-fw fa-book"></i> <span>Range wise   11KV Feeder Losses Report</span>
            </a>
          </li>
          <li>
	          <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=urban"> 
	         	 <i class="fa fa-fw fa-book"></i><span> Range wise Urban 11KV Feeder Losses Report</span>
	          </a>
          </li>
          <li>
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=rural">
            	 <i class="fa fa-fw fa-book"></i><span> Range wise RURAL 11KV RURAL Feeder Losses Report</span>
            </a>
          </li> 
         </ul> --%>
      </li><!-- End Components Nav -->
<!--       OMS -->

<li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#OMS" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span><b>OMS</b></span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <%-- <ul id="OMS" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <!-- <a href="components-alerts.html">
              <i class="bi bi-circle"></i><span>Alerts</span>
            </a> -->
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet"> 
            	<i class="fa fa-fw fa-book"></i> <span>Range wise   11KV Feeder Losses Report</span>
            </a>
          </li>
          <li>
	          <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=urban"> 
	         	 <i class="fa fa-fw fa-book"></i><span> Range wise Urban 11KV Feeder Losses Report</span>
	          </a>
          </li>
          <li>
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=rural">
            	 <i class="fa fa-fw fa-book"></i><span> Range wise RURAL 11KV RURAL Feeder Losses Report</span>
            </a>
          </li> 
         </ul> --%>
      </li><!-- End Components Nav -->
<!--       GIS -->

<li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#gis" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span><b>GIS</b></span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <%-- <ul id="gis" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <!-- <a href="components-alerts.html">
              <i class="bi bi-circle"></i><span>Alerts</span>
            </a> -->
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet"> 
            	<i class="fa fa-fw fa-book"></i> <span>Range wise   11KV Feeder Losses Report</span>
            </a>
          </li>
          <li>
	          <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=urban"> 
	         	 <i class="fa fa-fw fa-book"></i><span> Range wise Urban 11KV Feeder Losses Report</span>
	          </a>
          </li>
          <li>
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=rural">
            	 <i class="fa fa-fw fa-book"></i><span> Range wise RURAL 11KV RURAL Feeder Losses Report</span>
            </a>
          </li> 
         </ul> --%>
      </li><!-- End Components Nav -->
<!--       Registers -->

<li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#registers" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span><b>Registers</b></span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <%-- <ul id="registers" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <!-- <a href="components-alerts.html">
              <i class="bi bi-circle"></i><span>Alerts</span>
            </a> -->
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet"> 
            	<i class="fa fa-fw fa-book"></i> <span>Range wise   11KV Feeder Losses Report</span>
            </a>
          </li>
          <li>
	          <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=urban"> 
	         	 <i class="fa fa-fw fa-book"></i><span> Range wise Urban 11KV Feeder Losses Report</span>
	          </a>
          </li>
          <li>
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=rural">
            	 <i class="fa fa-fw fa-book"></i><span> Range wise RURAL 11KV RURAL Feeder Losses Report</span>
            </a>
          </li> 
         </ul> --%>
      </li><!-- End Components Nav -->
<!--       SAP Registers -->

<li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#SAPregisters" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span><b>SAP Registers</b></span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <%-- <ul id="SAPregisters" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <!-- <a href="components-alerts.html">
              <i class="bi bi-circle"></i><span>Alerts</span>
            </a> -->
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet"> 
            	<i class="fa fa-fw fa-book"></i> <span>Range wise   11KV Feeder Losses Report</span>
            </a>
          </li>
          <li>
	          <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=urban"> 
	         	 <i class="fa fa-fw fa-book"></i><span> Range wise Urban 11KV Feeder Losses Report</span>
	          </a>
          </li>
          <li>
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=rural">
            	 <i class="fa fa-fw fa-book"></i><span> Range wise RURAL 11KV RURAL Feeder Losses Report</span>
            </a>
          </li> 
         </ul> --%>
      </li><!-- End Components Nav -->
<!--       MATS -->

<li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#mats" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span><b>MATS</b></span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <%-- <ul id="mats" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <!-- <a href="components-alerts.html">
              <i class="bi bi-circle"></i><span>Alerts</span>
            </a> -->
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet"> 
            	<i class="fa fa-fw fa-book"></i> <span>Range wise   11KV Feeder Losses Report</span>
            </a>
          </li>
          <li>
	          <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=urban"> 
	         	 <i class="fa fa-fw fa-book"></i><span> Range wise Urban 11KV Feeder Losses Report</span>
	          </a>
          </li>
          <li>
            <a href="${pageContext.servletContext.contextPath}/servlet/Rangewise11KVFeederLossesServlet?flag=rural">
            	 <i class="fa fa-fw fa-book"></i><span> Range wise RURAL 11KV RURAL Feeder Losses Report</span>
            </a>
          </li> 
         </ul> --%>
      </li><!-- End Components Nav -->      

    </ul>

  </aside><!-- End Sidebar-->