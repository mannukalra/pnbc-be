package in.pnbc.springandreact;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.*;


@RestController
public class EnquiryController {

    @Autowired
    NotificationService notificationService;

    @CrossOrigin(
            allowCredentials = "true",
            origins = "*",
            allowedHeaders = "*",
            methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT}
    )
    @RequestMapping(value = "/api/enquire", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.TEXT_PLAIN_VALUE)
    public String enquire(@RequestBody ClientDetails clientDetails){

        String responseMsg ="Thanks for your enquiry, we'll shortly reach-out to you!";
        try {
            notificationService.sendNotification(clientDetails);
        }catch (MailException ex){
            responseMsg ="Failed to receive your message, error details :"+ex.getMessage();
            ex.printStackTrace();
        }
        System.out.println(responseMsg);
        return responseMsg;
    }

    @GetMapping("/enquire")
    public String enquireDemo(){
        ClientDetails clientDetails = new ClientDetails("Test Name", "mannu.kalra29@gmail.com", "7795593093", "test message for KK.");

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
