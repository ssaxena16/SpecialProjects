package com.sachin.strutsexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		LoginForm loginform = (LoginForm)form;
		String usernameDataBase = "";
		String passwordDatabase = "" ;
		String userName = loginform.getUserName();
		String password = loginform.getPassword();
		
		Connection con = null;
		Statement smt = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdatabase", "root", "Sachin123$");
			
			smt = con.createStatement();
			
			String sql = "Select * from test_table";
			ResultSet rs  = smt.executeQuery(sql);
			if(rs.next())
			{
				usernameDataBase = rs.getString("name");
				passwordDatabase = rs.getString("value");
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			smt.close();
			con.close();
		}
		
		if((userName != null && password !=null) && (userName.equalsIgnoreCase(usernameDataBase) && password.equalsIgnoreCase(passwordDatabase))  )
		{
			return mapping.findForward("success");
		}
		else
		    return mapping.findForward("faliure");
		
	}
	

}
