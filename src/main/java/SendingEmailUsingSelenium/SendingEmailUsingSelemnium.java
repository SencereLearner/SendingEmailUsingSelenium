package SendingEmailUsingSelenium;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class SendingEmailUsingSelemnium {
  Email email = new SimpleEmail();


}


//  Email email = new SimpleEmail();
//email.setHostName("smtp.gmail.com");//have to check for specific HostName, like what is smtp # and port for Hotmail or gmail.
//        email.setSmtpPort(465);//have to check port for specific HostName
//        email.setAuthenticator(new DefaultAuthenticator("username", "password"));
//        email.setSSLOnConnect(true);
//        email.setFrom("user@gmail.com");
//        email.setSubject("TestMail");
//        email.setMsg("This is a test mail ... :-)");
//        email.addTo("foo@bar.com");
//        email.send();
//
