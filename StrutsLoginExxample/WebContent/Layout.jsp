<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1"  style="width:100%" cellpadding="2" cellspacing="2" align="center">
<tr>
<td height="30%" colspan="2"><tiles:insert attribute="header" />
</td>
</tr>
<tr>

<td  height="40%"><tiles:insert attribute="body" /></td>
</tr>
<tr>
<td height="30%" colspan="2"><tiles:insert attribute="footer" />
</td>
</tr>
</table>
</body>
</html>