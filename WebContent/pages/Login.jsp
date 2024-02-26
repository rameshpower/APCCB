<%@ page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

 
  <title>APCCB Login</title>
  <meta content="" name="description">
  <meta content="" name="keywords">
  <%@include file="plugins.jsp" %>
	
<script type="text/javascript">
   /*  window.history.forward();
    function noBack()
    {
        window.history.forward();
    } */

  $(document).ready(function() {
      history.pushState(null, null, location.href);
      window.onpopstate = function() {
          history.go(1);
      };
      refreshcaptcha();
  });
  function refreshcaptcha(){
      $('#preloader').show();
      if($('#capimage').length>0){
          $('#capimage').remove();
      }
  
      $.get( "${pageContext.servletContext.contextPath}/CaptchaSer", function( data ) {
          $('#preloader').hide();
           $('#captchazone').html($('<img/>',{'src':'data:image/png;base64,'+data,'id':'capimage'}));
      });
     
  }
   function loadSTATUS(){
      var status=$("#status").val();
      if(status != ""){
          alert(status);
      }
  } 
 </script>
<style>
    body{
        background-image: url('${pageContext.servletContext.contextPath}/assets/img/16 copy.jpg');
        background-repeat: no-repeat;
        background-attachment: fixed;
        background-size: cover;
    }
    
    .header{
      height: 90px;
   /*    background-color: rgb(239, 240, 241);*/ 
    }
    
    .logo {
      width: auto;
      margin-top: 7px;
    }
     @media(max-width:1000px){
			  .logo {
        margin-top: 7px;
		    display: inline-block;
		    width: 100%;
  			} 
      }
  </style>
</head>
<body ONLOAD="loadSTATUS();">
<input type="text" name="status" id="status" value="${status}">
<!-- body -->
<%@include file="header.jsp" %>
  <main>
    <div class="container">

      <form action="${pageContext.servletContext.contextPath}/validateLogin" method="post"
      class="section register min-vh-100 d-flex flex-column align-items-center justify-content-end py-4 " style="min-height: 93vh!important;">
        <div class="container">
          <div class="row justify-content-end" style="margin: 5em 0;">
            <div class="col-lg-4 col-md-6 d-flex flex-column align-items-center justify-content-end">
              <div class="card mb-3">

                <div class="card-body">

                  <div class="pt-4 pb-2">
                    <h5 class="card-title text-center pb-0 fs-4">APSPDCL PORTAL</h5>
                    <p class="text-center small">Enter your username & password to login</p>
                  </div>

                  <form class="row g-3 needs-validation" novalidate>

                    <div class="col-12">
                      <label for="yourUsername" class="form-label">Username</label>
                      <div class="input-group has-validation">
                        <!-- <span class="input-group-text" id="inputGroupPrepend">@</span> -->
                        <input type="text" name="username" class="form-control" id="yourUsername" placeholder="User Name" aria-label="User Name" required>
                        <div class="invalid-feedback">Please enter your username.</div>
                      </div>
                    </div>

                    <div class="col-12">
                      <label for="yourPassword" class="form-label">Password</label>
                      <input type="password" name="password" class="form-control" id="yourPassword" placeholder="Password" aria-label="Password" required>
                      <div class="invalid-feedback">Please enter your password!</div>
                    </div>

                    <div class="col-12">
                      <div class="form-check">
	                    <div class="captchaimg text-center field" style="margin-top:10px;float:center;">
			                <span id="captchazone"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i class="bi bi-arrow-repeat" onclick="refreshcaptcha();" style="margin-top:15px;" aria-hidden="true"></i>
			                <!-- <span class="fa fa-refresh text-primary" onclick="refreshcaptcha();" style="margin-top:15px;"></span> -->
			                <i class="fa fa-refresh" onclick="refreshcaptcha();" style="margin-top:15px;" aria-hidden="true"></i>
			            </div>
                      </div>
                    </div>
					<div class="col-12">
		                <input type="text" class="form-control " name="captcha" id="captcha" pattern="[A-Za-z0-9]+" maxlength="6" style="margin-top:10px;" placeholder="Enter Captcha" required> 
                    </div>
                    
                    <div class="col-12">
                      <button class="btn btn-primary w-100" type="submit" style="margin-top:10px;">Login</button>
                    </div>
                   <!--  <div class="col-12">
                      <p class="small mb-0">Don't have account? <a href="pages-register.html">Create an account</a></p>
                    </div> -->
                  </form>

                </div>
              </div>
			</div>
          </div>
        </div>

      </form>

    </div>
  </main><!-- End #main -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>



<%-- <div class="container">

    <form action="${pageContext.servletContext.contextPath}/validateLogin" method="post"
     class="px-4 py-3" style="margin-top: 5em;">
    <div class="row">    
    <div class="col-md-7"></div>
    <div class="col-md-5 log">
        <div class="container-fluid log2">
            <h3 style="text-align: center;"> APSPDCL PORTAL</h3>
            <div class="mb-3 mbSpace">
                <div class="row g-8">
                    <div class="col-4">
                        <span class="label">User Name :</span>
                    </div>
                    <div class="col">
                        <input type="text" name="username" class="form-control" placeholder="User Name" aria-label="User Name" required>
                    <!-- <input required="" type="password" name="password" class="input"> -->
                    </div>
                </div>
            </div>
            <div class="mb-3 mbSpace">
               <div class="row g-4">
                    <div class="col-4">
                        <span class="label">Password :</span>
                    </div>
                    <div class="col">
                        <input type="password" name="password" class="form-control" placeholder="Password" aria-label="Password" required>
                    </div>
                </div>
            </div>
            
            <!-- captcha -->
            <div class="captchaimg text-center field" style="margin-top:10px;float:center;">
                <span id="captchazone"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-refresh" onclick="refreshcaptcha();" style="margin-top:15px;" aria-hidden="true"></i>
                <!-- <span class="fa fa-refresh text-primary" onclick="refreshcaptcha();" style="margin-top:15px;"></span> -->
            </div>
            <br>
            <div class="mb-3 mbSpace">
                <input type="text" class="form-control" name="captcha" id="captcha" pattern="[A-Za-z0-9]+" maxlength="6" placeholder="Enter Captcha" required> 
            </div>

            <div class="d-grid gap-2 col-3 mx-auto">
                <button type="submit" class="btn btn-primary" >Sign in</button>
            </div>
        </div>
    </div>
    </div>        
    </form>
</div> --%>

<%@include file="footer.jsp" %>
<script src="${pageContext.servletContext.contextPath}/assets/js/jquery.min.js"></script>
</body>
</html>