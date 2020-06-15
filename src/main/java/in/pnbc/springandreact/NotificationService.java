package in.pnbc.springandreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    JavaMailSender javaMailSender;

    @Value( "${spring.mail.username}" )
    private String fromMailAddress;

    public void sendNotification(ClientDetails client) throws MailException {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(client.getMailId());
        mail.setFrom(fromMailAddress);
        mail.setSubject(client.firstName+" "+client.lastName+" wants to connect!");
        mail.setText(client.getMessage()+client.getMobileNumber());

        javaMailSender.send(mail);
    }

}
