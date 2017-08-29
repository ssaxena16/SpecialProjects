package com.sachin.action;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sachin.comparator.PasswordComparator;
import com.sachin.comparator.UserNameComparator;
import com.sachin.dao.UserDao;
import com.sachin.form.UserSearchForm;
import com.sachin.persistence.User;

public class UserSearchAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		UserSearchForm userSearchForm = (UserSearchForm) form;
		String userName = userSearchForm.getName();
		String action = userSearchForm.getDispatch();
		if ("searchUsers".equals(action)) {
			List<User> users = new UserDao().getUsers(userName);
			request.setAttribute("users", users);

		}
		if ("sortUserName".equals(action))
		{
			List<User> users = new UserDao().getUsers(userName);
			Collections.sort(users, new UserNameComparator());
			request.setAttribute("users", users);
		}
		if ("sortPassword".equals(action))
		{
			List<User> users = new UserDao().getUsers(userName);
			Collections.sort(users, new PasswordComparator());
			request.setAttribute("users", users);
		}
		if("deleteUser".equals(action))
		{
			String deletedUserName = userSearchForm.getUserName() !=null ? userSearchForm.getUserName() : "";
		    new UserDao().deleteUser(deletedUserName);
		    
		}
		if("updateUser".equals(action))
		{
			String updatedUserName = userSearchForm.getUserName() !=null ? userSearchForm.getUserName() : "";
			User user = new UserDao().getUser(updatedUserName);
			request.setAttribute("updateUserName", user.getUsername());
			request.setAttribute("updatePassword", user.getPassword());
			return mapping.findForward("updateuser");
		}
		return mapping.findForward("searchsuccess");
	}

}
