package com.snow.util;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class EmailSent {

	public static void main(String arg[]) throws EmailException {

		String path = "D:\\ITR/Manish_Resume.doc";
	sendEmail(path,"0","0");
	}

	public static void sendEmail(String text, String strFailCount, String strPassCount) throws EmailException {
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath(text);
		attachment.setDisposition(EmailAttachment.ATTACHMENT);

		// Create the email message
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(587);
		email.setSSL(true);
	email.setAuthenticator(new DefaultAuthenticator("manishchaurasia531@gmail.com",""));
		email.addTo("chaurasia.mani007@gmail.com", "Manish Chaurasia");
		email.setFrom("manishchaurasia531@gmail.com", "Shanu");
		email.setSubject("Execution of MF-IBM Change");
		email.setMsg("Please finde the execution status \nPassed test case count : "
		+strPassCount+"\n"+"Failed test case count : "+strFailCount+"\n"+"\n"+"Please do let me know if any concern"+"\n"+"\n"+
				"Thanks and Regards"+"\n"+"Manish Chaurasia"+"\n"+"MChaurais@jhancock.com | johnhancock.com");
		// add the attachment
		email.attach(attachment);
		email.send();

	}
}
