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
            <table>
            <tr>
            <td>Select file to upload:</td>
            <td> <input type="file" name="uploadFile" /></td>
            <td><input type="submit" name = "action" value="Upload" />
            </td>
            </tr>
            </table>
            </form>
            <form method = "post" action = "UploadServlet">
            <table>
            <tr>
            <td>Date - Month - Year :</td><td><input type = "text"  name = "dateString" placeholder = "day- month - year" ></td>
            <td><input  type="submit" name = "action" value="Submit"/></td>
            </tr>
            </table>
        </form>
    </center>
    <center>
        <h2>${requestScope.message}</h2>
    </center>
</body>
</html>