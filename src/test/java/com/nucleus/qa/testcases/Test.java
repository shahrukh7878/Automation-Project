package com.nucleus.qa.testcases;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Test {

	public static void main(String[] args) throws EmailException {
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("shahrukhaatar786@gmail.com", "Hasanw@123456"));
		email.setSSLOnConnect(true);
		email.setFrom("shahrukhaatar58@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("shahrukhaatar58@gmail.com");
		email.send();
		
		System.out.println("1111111111111111");
		

	}

}
