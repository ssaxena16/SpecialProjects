<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title> Login Form </title>

      
  <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
 
       <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
     
   <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
		
<link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
<script src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
<script >
$( document ).ready(function()
{
$(function() {
    $("#form-username").attr("placeholder", "UserName...");
    $("#form-password").attr("placeholder", "PassWord...");
});
});
</script>


    
</head>

    <body>

        <!-- Top content -->
        <div class="top-content">
        	
         
   <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1>Login Form</h1>
                           
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>Login to our site</h3>
                            		<p>Enter your username and password to log on:</p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-key"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <html:form action="/login" >
			                    	<div class="form-group">
			                    	 <label class="sr-only" for="userName">Username</label>
			                    	    <html:text  styleClass="form-username form-control"  styleId="form-username" property="userName" />
			                        	
			                        </div>
			                        <div class="form-group">
			                        <label class="sr-only" for="form-password">Password</label>
			                        <html:password styleClass="form-password form-control" styleId="form-password" property="passWord" />
			                        	
			                        </div>
			                        <button type="submit" class="btn">Sign in!</button>
			                    </html:form>

		                    </div>
                        </div>
             
       </div>
                   
                </div>
            </div>
            
        </div>


        <!-- Javascript -->
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/scripts.js"></script>
        
        <!--[if lt IE 10]>
        
    <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>
</html>