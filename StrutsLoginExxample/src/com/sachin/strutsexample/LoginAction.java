package com.sachin.strutsexample;

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
		String userName = loginform.getUserName();
		String password = loginform.getPassword();
		
		if((userName != null && password !=null) && (userName.equalsIgnoreCase("Sachin") && password.equalsIgnoreCase("Saxena"))  )
		{
			return mapping.findForward("success");
		}
		else
		    return mapping.findForward("faliure");
		
	}
	

}
