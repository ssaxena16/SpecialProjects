<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
<script type="text/javascript">
function go(method) {
	var form = document.getElementById('logoutform');
	form.submit();
	
}
</script>
</head>
<body>
<html:form action="/logout" styleId="logoutform">
<div align="right" ><html:button property="" onclick="go('logout')">Logout</html:button></div>
</html:form>
</body>
</html>