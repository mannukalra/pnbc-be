package in.pnbc.springandreact;

public class ClientDetails {
    String firstName;
    String lastName;
    String mailId;
    Long mobileNumber;
    String message;

    public ClientDetails(){}

    public ClientDetails(String firstName, String lastName, String mailId, Long mobileNumber, String message) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailId = mailId;
        this.mobileNumber = mobileNumber;
        this.message = message;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
