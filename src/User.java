public class User {
    private int userId;
    private String userFirstName;
    private String userLastName;
    private String userAddress;
    private String userEmailAddress;
    private boolean status;



    public User(int userId, String userFirstName, String userLastName, String userAddress, String userEmailAddress, boolean status) {
        super();
        this.setUserId(userId);
        this.setUserFirstName(userFirstName);
        this.setUserLastName(userLastName);
        this.setUserAddress(userAddress);
        this.setEmailAddress(userEmailAddress);
        this.setStatus(status);


    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getEmailAddress() {
        return userEmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.userEmailAddress = emailAddress;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }
}
