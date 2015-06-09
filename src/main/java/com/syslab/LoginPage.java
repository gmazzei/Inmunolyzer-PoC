package com.syslab;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

public class LoginPage extends WebPage {
	private static final long serialVersionUID = 1L;

	public LoginPage() {
		Form form = new Form("form");
		
		TextField<String> user = new TextField<String>("user", Model.of(new String()));
		user.setRequired(true);
		form.add(user);
		
		PasswordTextField password = new PasswordTextField("password", Model.of(new String()));
		password.setRequired(true);
		form.add(password);
		
		AjaxButton submitButton = new AjaxButton("submitButton") {
			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
				//TODO: Call LoginService
				this.setResponsePage(HomePage.class);
			}	
		};
		
		form.add(submitButton);
		
		this.add(form);
	}
}
