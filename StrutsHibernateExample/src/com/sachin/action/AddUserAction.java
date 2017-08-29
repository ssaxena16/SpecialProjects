package com.sachin.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sachin.dao.UserDao;
import com.sachin.form.AddUserForm;
import com.sachin.form.UserSearchForm;
import com.sachin.persistence.User;

public class AddUserAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		AddUserForm addUserForm = (AddUserForm) form;
		String addUserName = addUserForm.getAddUserName() != null ? addUserForm.getAddUserName() : "";
		String addPassword = addUserForm.getAddPassword() != null ? addUserForm.getAddPassword() : "";
		String confirmPassword = addUserForm.getConfirmPassword() != null ? addUserForm.getConfirmPassword() : "";
		String action = addUserForm.getDispatch();
		if ("addUser".equals(action)) {
			String result = "";
			if (!addUserName.equals("") && !addPassword.equals("") && addPassword.equals(confirmPassword)) {
				User user = new UserDao().getUser(addUserName);
				if (user != null && addUserName.equals(user.getUsername())) {
					result = "allreadyuserexist";
				} else {
					result = new UserDao().addNewUser(addUserName, addPassword);
				}
			}
			if ("success".equals(result)) {
				request.setAttribute("success", true);
				addUserForm.reset();
			} else if ("allreadyuserexist".equals(result)) {
				request.setAttribute("allreadyuserexist", false);
				addUserForm.reset();
			} else {
				request.setAttribute("faliure", true);
				addUserForm.reset();
			}
		}
		if ("updateUser".equals(action)) {
			String updatedUsername = addUserForm.getUpdatedUserName();
			System.out.println("Update UserName ====" + updatedUsername);
			String result = "";
			if (!addUserName.equals("") && !addPassword.equals("") && addPassword.equals(confirmPassword)) {
				result = new UserDao().updateUser(updatedUsername, addUserName, addPassword);
			}
			if ("success".equals(result)) {
				request.setAttribute("updatesuccess", true);
				addUserForm.reset();
			} else {
				request.setAttribute("failure", false);
				addUserForm.reset();
			}
		}
		if ("backPage".equals(action)) {
			List<User> users = new UserDao().getUsers("");
			request.setAttribute("users", users);
			addUserForm.reset();
			return mapping.findForward("usersearch");
		}

		return mapping.findForward("adduser");
	}

}
