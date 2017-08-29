package com.sachin.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sachin.dao.UserDao;
import com.sachin.form.LoginForm;
import com.sachin.persistence.User;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		LoginForm loginForm = (LoginForm) form;
		String userName = loginForm.getUserName();
		String passWord = loginForm.getPassWord();
		UserDao userdao = new UserDao();
		boolean result = userdao.getLoginResult(userName, passWord);
		List<User> users = new UserDao().getUsers("");
		request.setAttribute("users", users);
		if (result) {
			return mapping.findForward("success");
		} else {
			return mapping.findForward("faliure");
		}

	}

}
