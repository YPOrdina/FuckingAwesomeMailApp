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
		List<InternetAddress> listTo = Arrays.asList(
				new InternetAddress("casper.e.koning@gmail.com"),
				new InternetAddress("a.m.cakir@gmail.com"),
				new InternetAddress("niels.maneschijn@ordina.nl"),
				new InternetAddress("uphoffthanja@hotmail.com"),
				new InternetAddress("erwincavas@hotmail.com"),
				new InternetAddress("sinan.ozdil@hotmail.com"),
				new InternetAddress("mail@rikvegt.nl"),
				new InternetAddress("walter.van.iterson@ordina.nl")
				);
				
		InternetAddress from = new InternetAddress("nielsmaneschijn@ziggo.nl");
		
		mailClient.sendMail(listTo, from, "Hello Fucking Awesome World!", "JAVA, DO YOU SPEAK IT? ;) ");
	}
}
