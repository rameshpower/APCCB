<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

  <!-- ======= Header ======= -->
  <header id="header" class="header  d-flex align-items-center">
<!-- fixed-top -->
    <div class="d-flex align-items-center justify-content-between">
      <!-- <a href="index.html" class="logo d-flex align-items-center">
      </a> -->
      <span class="logo d-flex align-items-center">
        <img src="${pageContext.servletContext.contextPath}/assets/img/logo.png" alt="" >
        <span class="d-none d-lg-block">  ఆంధ్ర ప్రదేశ్ దక్షిణ ప్రాంత విద్యుత్ పంపిణి సంస్థ   <br>
        Southern Power Distribution Company Of AP Limited </span>
      </span>
    <i class="bi bi-list toggle-sidebar-btn"></i>
    </div><!-- End Logo -->

    <nav class="header-nav ms-auto">
      <ul class="d-flex align-items-center">

        <li class="nav-item d-block d-lg-none">
          <a class="nav-link nav-icon search-bar-toggle " href="#">
            <i class="bi bi-search"></i>
          </a>
        </li><!-- End Search Icon-->

        <li class="nav-item dropdown pe-3">

          <a class="nav-link nav-profile d-flex align-items-center pe-0" href="#" data-bs-toggle="dropdown">
<%--             <img src="${pageContext.servletContext.contextPath}/assets/img/profileLog.png" alt="Profile" class="rounded-circle"> --%>
<!--             <i class="bi bi-person-fill"></i> -->
			<svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-person-fill" viewBox="0 0 16 16">
			  <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6"/>
			</svg>
            <span class="d-none d-md-block dropdown-toggle ps-2"><%=session.getAttribute("userName")%></span>
          </a><!-- End Profile Iamge Icon -->

          <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
            <li class="dropdown-header">
              <h6><%=session.getAttribute("userName")%> (<span><%=session.getAttribute("usertype") %></span>)</h6>
<%--               <span><%=session.getAttribute("usertype") %></span> --%>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
<!--               <a class="dropdown-item d-flex align-items-center" href="#">
                <i class="bi bi-box-arrow-right"></i>
                <span>Sign Out</span>
              </a> -->

       		<%-- <button type="button" class="btn btn-primary" style="float: right; margin-right: 20px;" onclick="window.location='${pageContext.servletContext.contextPath}/pages/Logout.jsp';">
				<img src="APCCB_CSS/img/logoff.png" style="color:#222"> LogOut
			</button> --%>
			
			 <a class="dropdown-item d-flex align-items-center" onclick="window.location='${pageContext.servletContext.contextPath}/pages/Logout.jsp';">
                <i class="bi bi-box-arrow-right"></i>
                <span>Sign Out</span>
              </a>
            </li>

          </ul><!-- End Profile Dropdown Items -->
        </li><!-- End Profile Nav -->

      </ul>
    </nav><!-- End Icons Navigation -->

  </header><!-- End Header -->
