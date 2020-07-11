package in.pnbc.springandreact;

public class ClientDetails {
    String name;
    String mailId;
    String mobileNumber;
    String message;

    public ClientDetails(){}

    public ClientDetails(String name, String mailId, String mobileNumber, String message) {
        this.name = name;
        this.mailId = mailId;
        this.mobileNumber = mobileNumber;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
