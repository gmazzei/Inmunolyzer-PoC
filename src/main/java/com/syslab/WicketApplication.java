package com.syslab;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication {

	@Override
	public Class<? extends WebPage> getHomePage() {
		return LoginPage.class;
	}

	public void init() {
		super.init();
		
		this.mountPage("LoginPage", LoginPage.class);
		this.mountPage("HomePage", HomePage.class);

		//TODO: Hash URL
	}
}
