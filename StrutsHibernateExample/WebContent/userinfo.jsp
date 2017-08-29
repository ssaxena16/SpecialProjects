<%@page import="com.sachin.persistence.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>userinformation</title>
<script type="text/javascript">
		function postForm(method){
			var form = document.getElementById('formSearch');
			form.elements["dispatch"].value = method;
			form.submit();
		}
		
		function deleteUser(method) {
			var form = document.getElementById('formSearch');
           var confirmform = confirm("Do you want to delete a User");
           if(confirmform == false)
        	   {
        	     return;
        	   }
			form.elements["userName"].value = method;
		   form.elements["dispatch"].value = 'deleteUser';
			form.submit();
		}
		function updateUser(method) {
			var form = document.getElementById('formSearch');
           var confirmform = confirm("Do you want to Update a User");
           if(confirmform == false)
        	   {
        	     return;
        	   }
			form.elements["userName"].value = method;
		   form.elements["dispatch"].value = 'updateUser';
			form.submit();
		}
		
	</script>
</head>
<jsp:include page="logout.jsp"></jsp:include>
<body>
<h1>User Information</h1>
<html:form action="/user" styleId="formSearch">
		<html:hidden property="dispatch" />
		<html:hidden property="userName" />
		<table>
			<tr>
				<td>User name</td>
				<td><html:text property="name" size="20" /></td>
				<td ><html:button value="Search" property="" onclick="postForm('searchUsers')" /></td>
			<td><a href="adduser.jsp">Add a New User</a></td>
			</tr>
		</table>
	</html:form>
	<br>
	<logic:notEmpty name="users" >
	<table width="100%">
		<tr>
			<td bgcolor="#FF9900" onclick="postForm('sortUserName')"  >UserName</td>
			<td bgcolor="#FF9900" onclick="postForm('sortPassword')"  >Password</td>
			<td width="20" bgcolor="#FF9900"></td>
			<td width="20" bgcolor="#FF9900"></td>
			
		</tr>
		<logic:iterate name="users" id="user">
			<tr>
				<td bgcolor="#DBEAF9"><bean:write name="user" property="username" /></td>
				<td bgcolor="#DBEAF9"><bean:write name="user" property="password" /></td>
				<%User user1=(User) user;%>
				<td bgcolor="#DBEAF9">
				<button  id="updatebuttonId" onclick="updateUser('<%=user1.getUsername() %>')" >Update</button></td>
				<td bgcolor="#DBEAF9">
				<button  id="deletebuttonId" onclick="deleteUser('<%=user1.getUsername() %>')" >RemoveUser</button></td>
			</tr>
		</logic:iterate>
	</table>
	</logic:notEmpty>
</body>
</html>