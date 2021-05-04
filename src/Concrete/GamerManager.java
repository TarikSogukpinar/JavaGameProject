package Concrete;

import Abstract.GamerService;
import Abstract.UserValidationsService;
import Constants.Messages;
import Entities.Concrete.Gamer;


public class GamerManager implements GamerService {

    UserValidationsService _userValidation;


    public GamerManager(UserValidationsService userValidation) {
        this._userValidation = userValidation;
    }

    public boolean Login(Gamer gamer) {

        if (_userValidation.Validate(gamer)) {
            System.out.println(Messages.accessSuccessFull);
            return true;
        } else {
            return false;
        }

    }


}
