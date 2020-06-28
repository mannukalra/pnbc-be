package in.pnbc.springandreact;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectController {

    @Autowired
    NotificationService notificationService;

    @PostMapping("/connect")
    public String connect(ClientDetails clientDetails){
        String responseMsg ="Thanks for your query, we'll shortly reach-out to you!";
        try {
            notificationService.sendNotification(clientDetails);
        }catch (MailException ex){
            responseMsg ="Failed to recieve your message, error details :"+ex.getMessage();
            ex.printStackTrace();
        }

        return responseMsg;
    }

    @GetMapping("/connect")
    public String connect(){
        ClientDetails clientDetails = new ClientDetails("Fname", "Lname", "mannu.kalra29@gmail.com", 7795593093L, "test message for KK, contact:");

        Gson gson = new Gson();
        System.out.println(gson.toJson(clientDetails));

        String responseMsg ="Thanks for your query, we'll shortly reach-out to you!";
        try {
            notificationService.sendNotification(clientDetails);
        }catch (MailException ex){
            responseMsg ="Failed to recieve your message, error details :"+ex.getMessage();
            ex.printStackTrace();
        }

        return responseMsg;
    }
}
