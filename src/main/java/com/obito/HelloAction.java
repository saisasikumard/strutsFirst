package com.obito;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
@Action("/hello")
@Result(name="success",location="/results.jsp")
public class HelloAction {
	private String firstname;

	public String execute() {
		System.out.println("your first name is:"+firstname);
		return "success";
	}
	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
}
