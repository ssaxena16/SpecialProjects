<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<script type="text/javascript">
		function postForm(method){
			if(method != 'backPage')
				{
			if(document.getElementById('passwordId').value != document.getElementById('confirmpasswordId').value)
			{
				alert("Password && ConfirmPassword does'nt Match");
			    return;	
			}
				}
		    var form = document.getElementById('formAdd');
			form.elements["dispatch"].value = method;
			form.submit();
		}
	</script>
</head>
<jsp:include page="logout.jsp"></jsp:include>
<body>

<% String updatedUser = (String)request.getAttribute("updateUserName");
   String updatePassword= (String)request.getAttribute("updatePassword");
   String heading = updatedUser != null ? "Update a User Information" : "Add New User";
%>
<h1><%=heading%></h1>
 <html:form action="/adduser" styleId="formAdd">
		<html:hidden property="dispatch" />
		<html:hidden property="updatedUserName" value='<%=updatedUser %>' />
		<table>
			<tr>
				<td>User name</td>
				<td><html:text property="addUserName"  value='<%=updatedUser %>' size="20" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><html:password property="addPassword" styleId="passwordId" value='<%=updatePassword %>' size="20" /></td>
			</tr>
			<tr>
				<td>ConfirmPassword</td>
				<td><html:password property="confirmPassword" styleId="confirmpasswordId" size="20" /></td>
			</tr>
			<tr>
			<% String buttonName= updatedUser !=null ? "Update" : "Add" ;
			   String method = updatedUser !=null ? "postForm('updateUser')" : "postForm('addUser')" ;%>
				<td colspan="2" align="right"><html:button value="<%= buttonName%>" property=""
						onclick="<%=method %>" /></td>
			</tr>
		</table>
	</html:form>
	
	<font color="green" size=2> 
		<logic:present name="success">
			<h3>User added successfully!</h3> 
		</logic:present>
	</font>
	
	<font color="green" size=2> 
		<logic:present name="updatesuccess">
			<h3>User Updated successfully!</h3> 
		</logic:present>
	</font>
	
	<font color="red" size=2> 
		<logic:present name="faliure">
			<h3>Ooops, an error occurred!!</h3> 
		</logic:present>
	</font>	
	
	<font color="red" size=2> 
		<logic:present name="allreadyuserexist">
			<h3>User already exist!</h3> 
		</logic:present>
	</font>	
	<br><br>
	<html:button property="" value="Back" onclick="postForm('backPage')"></html:button>
</body>
</html>