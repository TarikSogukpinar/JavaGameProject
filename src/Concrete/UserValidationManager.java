package Concrete;

import Abstract.UserValidationsService;
import Entities.Concrete.Gamer;


public class UserValidationManager implements UserValidationsService {

    @Override
    public boolean Validate(Gamer gamer) {

        if (gamer.getGamerFirstName().equals("TARIK") && gamer.getGamerLastName().equals("PINAR") && gamer.getIdentityNumber().equals("2216") && gamer.getGamerBirthYear().equals("1997")) {
            return true;
        } else {
            return false;
        }

    }
}
