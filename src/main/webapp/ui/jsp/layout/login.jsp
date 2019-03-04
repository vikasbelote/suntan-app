<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
	<meta charset="utf-8" />
	<title>Suntan finserv</title>
	<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />
	
	<!-- ================== BEGIN BASE CSS STYLE ================== -->
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" />
	<link href="../ui/assets/plugins/jquery-ui/jquery-ui.min.css" rel="stylesheet" />
	<link href="../ui/assets/plugins/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
	<link href="../ui/assets/plugins/font-awesome/5.0/css/fontawesome-all.min.css" rel="stylesheet" />
	<link href="../ui/assets/plugins/animate/animate.min.css" rel="stylesheet" />
	<link href="../ui/assets/css/default/style.min.css" rel="stylesheet" />
	<link href="../ui/assets/css/default/style-responsive.min.css" rel="stylesheet" />
	<link href="../ui/assets/css/default/theme/default.css" rel="stylesheet" id="theme" />
	<!-- ================== END BASE CSS STYLE ================== -->
	
	<!-- ================== BEGIN BASE JS ================== -->
	<script src="../ui/assets/plugins/pace/pace.min.js"></script>
	<!-- ================== END BASE JS ================== -->
</head>
<body class="pace-top bg-white">
	<!-- begin #page-loader -->
	<div id="page-loader" class="fade show"><span class="spinner"></span></div>
	<!-- end #page-loader -->
	
	<!-- begin #page-container -->
	<div id="page-container" class="fade">
	    <!-- begin login -->
        <div class="login login-with-news-feed">
            <!-- begin news-feed -->
            <div class="news-feed">
                <div class="news-image" style="background-image: url(../ui/assets/img/login-bg/login-bg-11.jpg)"></div>
                <div class="news-caption">
                    <h4 class="caption-title"><b>Suntan Financial</b> Application</h4>
                    <p>
                        Download the Color Admin app for iPhone®, iPad®, and Android™. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                    </p>
                </div>
            </div>
            <!-- end news-feed -->
            <!-- begin right-content -->
            <div class="right-content">
                <!-- begin login-header -->
                <div class="login-header">
                    <div class="brand">
                        <span class="logo"></span> <b>Suntan</b> Financial 
                        <small>Suntan Investment And Research</small>
                    </div>
                    <div class="icon">
                        <i class="fa fa-sign-in"></i>
                    </div>
                </div>
                <!-- end login-header -->
                <!-- begin login-content -->
                <div class="login-content">
                    <form:form action="login" modelAttribute="loginDTO" class="margin-bottom-0">
                        <div class="form-group m-b-15">
                            <input type="text" name="userName" class="form-control form-control-lg" placeholder="Email Address" required />
                        </div>
                        <div class="form-group m-b-15">
                            <input type="password" name="userPassword" class="form-control form-control-lg" placeholder="Password" required />
                        </div>
                        <div class="checkbox checkbox-css m-b-30">
							<input type="checkbox" id="remember_me_checkbox" value="" />
							<label for="remember_me_checkbox">
								Remember Me
							</label>
						</div>
                        <div class="login-buttons">
                            <button type="submit" class="btn btn-success btn-block btn-lg">Sign me in</button>
                        </div>
                        <div class="m-t-20 m-b-40 p-b-40 text-inverse">
                            Not a member yet? Click <a href="register" class="text-success">here</a> to register.
                        </div>
                        <hr />
                        <p class="text-center text-grey-darker">
                            &copy; Suntan finserv Right Reserved 2018
                        </p>
                    </form:form>
                </div>
                <!-- end login-content -->
            </div>
            <!-- end right-container -->
        </div>
        <!-- end login -->
        
	</div>
	<!-- end page container -->
	
	<!-- ================== BEGIN BASE JS ================== -->
	<script src="../ui/assets/plugins/jquery/jquery-3.2.1.min.js"></script>
	<script src="../ui/assets/plugins/jquery-ui/jquery-ui.min.js"></script>
	<script src="../ui/assets/plugins/bootstrap/4.0.0/js/bootstrap.bundle.min.js"></script>
	<!--[if lt IE 9]>
		<script src="../ui/assets/crossbrowserjs/html5shiv.js"></script>
		<script src="../ui/assets/crossbrowserjs/respond.min.js"></script>
		<script src="../ui/assets/crossbrowserjs/excanvas.min.js"></script>
	<![endif]-->
	<script src="../ui/assets/plugins/slimscroll/jquery.slimscroll.min.js"></script>
	<script src="../ui/assets/plugins/js-cookie/js.cookie.js"></script>
	<script src="../ui/assets/js/theme/default.min.js"></script>
	<script src="../ui/assets/js/apps.min.js"></script>
	<!-- ================== END BASE JS ================== -->

	<script>
		$(document).ready(function() {
			App.init();
		});
	</script>
</body>
</html>
