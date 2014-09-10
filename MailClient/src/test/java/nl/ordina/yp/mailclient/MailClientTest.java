package nl.ordina.yp.mailclient;

import java.util.Arrays;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;

import org.junit.Test;

public class MailClientTest {

	@Test
	public void testSendingMail() throws MessagingException {
		MailClient mailClient = new MailClient();
		List<InternetAddress> listTo = Arrays.asList(new InternetAddress("a.m.cakir@gmail.com"));
		InternetAddress from = new InternetAddress("nielsmaneschijn@ziggo.nl");
		
		mailClient.sendMail(listTo, from, "Hallo", "Hello Fucking Awesome World!");
	}
}
