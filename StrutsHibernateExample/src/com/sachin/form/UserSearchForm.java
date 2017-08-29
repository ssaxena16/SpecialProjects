package com.sachin.form;

import org.apache.struts.action.ActionForm;

public class UserSearchForm extends ActionForm {
	private String name;
	private String dispatch;
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDispatch() {
		return dispatch;
	}

	public void setDispatch(String dispatch) {
		this.dispatch = dispatch;
	}
	public void reset()
	{
		name = null;
	}

}
