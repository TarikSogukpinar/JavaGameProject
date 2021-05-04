package Abstract;

import Entities.Concrete.Game;

public interface GameService {
    void Add(Game game);

    void Update(Game game);

    void Delete(Game game);

}
