package Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;

public interface CampaignService {
    void Add(Campaign campaign, Game game);

    void Update(Campaign campaign, Game game);

    void Delete(Campaign campaign, Game game);
}
