package com.sachin.form;

import org.apache.struts.action.ActionForm;

public class AddUserForm extends ActionForm {
	private String addUserName;
	private String addPassword;
	private String confirmPassword;
	private String dispatch;
	private String updatedUserName;

	public String getUpdatedUserName() {
		return updatedUserName;
	}

	public void setUpdatedUserName(String updatedUserName) {
		this.updatedUserName = updatedUserName;
	}

	public String getAddUserName() {
		return addUserName;
	}

	public void setAddUserName(String addUserName) {
		this.addUserName = addUserName;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getAddPassword() {
		return addPassword;
	}

	public void setAddPassword(String addPassword) {
		this.addPassword = addPassword;
	}

	public String getDispatch() {
		return dispatch;
	}

	public void setDispatch(String dispatch) {
		this.dispatch = dispatch;
	}

	public void reset() {
		addUserName = null;
		addPassword = null;
		confirmPassword = null;
	}

}
