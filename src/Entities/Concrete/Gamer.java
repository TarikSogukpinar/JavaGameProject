package Entities.Concrete;

import Entities.Entity;

public class Gamer implements Entity {


    private String gamerFirstName;
    private String gamerLastName;
    private String gamerBirthYear;
    private String identityNumber;

    public Gamer(String gamerFirstName, String gamerLastName, String gamerBirthYear, String identityNumber) {

        this.setGamerFirstName(gamerFirstName);
        this.setGamerLastName(gamerLastName);
        this.setGamerBirthYear(gamerBirthYear);
        this.setIdentityNumber(identityNumber);
    }


    public String getGamerFirstName() {
        return gamerFirstName;
    }

    public void setGamerFirstName(String gamerFirstName) {
        this.gamerFirstName = gamerFirstName;
    }

    public String getGamerLastName() {
        return gamerLastName;
    }

    public void setGamerLastName(String gamerLastName) {
        this.gamerLastName = gamerLastName;
    }

    public String getGamerBirthYear() {
        return gamerBirthYear;
    }

    public void setGamerBirthYear(String gamerBirthYear) {
        this.gamerBirthYear = gamerBirthYear;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
}
