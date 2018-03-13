<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File Upload</title>
</head>
<body>
    <center>
        <form method="post" action="UploadServlet" enctype="multipart/form-data" >
            File Location:
            <% String path= request.getAttribute("path")!= null ? (String)request.getAttribute("path") : ""; %>
            <input type = "text" name ="filePath" value = <%= path %>>
            <br>
            <input type="file" name="uploadFile" />
            <input type="submit" name = "action" value="Upload" />
            <br>
            </form>
            <br>
            <form method = "post" action = "UploadServlet">
            
            DD-MM-YY :<input type = "text"  name = "dateString" placeholder = "day- month - year" >
            <br>
            <input  type="submit" name = "action" value="Submit"/>
            
        </form>
    </center>
    <center>
        <h2>${requestScope.message}</h2>
    </center>
</body>
</html>