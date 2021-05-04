package Concrete;

import Abstract.CampaignService;
import Abstract.GamerService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;

public class CampaignManager implements CampaignService {


    @Override
    public void Add(Campaign campaign, Game game) {

        System.out.println("Bu Oyun için : " + game.getGameName() +" "+ " Kampanya Eklendi :" + " " + campaign.getCampaignName());
    }

    @Override
    public void Update(Campaign campaign, Game game) {
        System.out.println("Bu Oyun için : " + game.getGameName() +" "+ "Kampanya Güncellendi :" + " " + campaign.getCampaignName());
    }

    @Override
    public void Delete(Campaign campaign, Game game) {
        System.out.println("Bu Oyun için : " + game.getGameName() +" "+ "Kampanya Silindi :" + " " + campaign.getCampaignName());
    }
}
