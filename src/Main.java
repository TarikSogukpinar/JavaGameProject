

import Concrete.*;
import Constants.Messages;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        menuNav.Menu();

        Game game1 = new Game(1, 200, "Witcher 3");
        Game game2 = new Game(2, 100, "Age of Empires");

        Game[] games = {game1, game2};

        Campaign campaign1 = new Campaign(1, "Yaz sonu kampanyası");
        Campaign campaign2 = new Campaign(2, "Kış sonu kampanyası");

        Campaign[] campaigns = {campaign1, campaign2};


        giveMessage(Messages.userName);
        String firstName = scanner.next();
        giveMessage(Messages.userLastName);
        String lastName = scanner.next();
        giveMessage(Messages.userNationalId);
        String nationalId = scanner.next();
        giveMessage(Messages.userBirthYear);
        String birthYear = scanner.next();

        GameManager gamerManager = new GameManager();
        CampaignManager campaignManager = new CampaignManager();

        GamerManager gameManager = new GamerManager(new UserValidationManager()); //Check Gamers
        Gamer gamerInput = new Gamer(firstName, lastName, birthYear, nationalId);
        boolean IsAuto = gameManager.Login(gamerInput);
        if (IsAuto) {
            giveMessage(Messages.welcomeGameMenu);
            giveMessage(Messages.listGames);
            giveMessage(Messages.showCampaign);
            giveMessage(Messages.showCampaignMenu);
            int inputUserAnswer = scanner.nextInt();

            switch (inputUserAnswer) {
                case 1:
                    for (Game gamer : games) {
                        giveMessage(gamer.getGameName() + " " + gamer.getGamePrice());
                    }
                    gamerManager.Add(games[0]);
                    gamerManager.Delete(games[0]);
                    gamerManager.Update(games[0]);
                    break;
                case 2:
                    for (Campaign campaign : campaigns) {
                        giveMessage(campaign.getCampaignName());
                    }
                    break;
                case 3:
                    giveMessage(Messages.addCampaign);
                    giveMessage(Messages.deleteCampaign);
                    giveMessage(Messages.updateCampaign);
                    int inputUserAnswer1 = scanner.nextInt();
                    switch (inputUserAnswer1) {
                        case 1 -> {
                            campaignManager.Add(campaigns[0], games[0]);
                            campaignManager.Add(campaigns[1], games[1]);
                        }
                        case 2 -> {
                            campaignManager.Delete(campaigns[0], games[0]);
                            campaignManager.Delete(campaigns[1], games[1]);
                        }
                        case 3 -> {
                            campaignManager.Update(campaigns[0], games[0]);
                            campaignManager.Update(campaigns[1], games[1]);
                        }
                        default -> giveMessage(Messages.youDontHaveChoose);
                    }

                    break;
                default:
                    giveMessage(Messages.youDontHaveChoose);
                    break;
            }
        } else {
            giveMessage(Messages.accessDenied);
        }


    }

    public static void giveMessage(String msg) {
        System.out.println(msg);
    }
}



