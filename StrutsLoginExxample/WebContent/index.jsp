<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" %>


 <tiles:insert page= "/Layout.jsp" flush="true">
 
  <tiles:put name="header" value="/header.jsp" />
  <tiles:put name="body" value="/login.jsp" />
   <tiles:put name="footer" value="/footer.jsp" />
</tiles:insert>

