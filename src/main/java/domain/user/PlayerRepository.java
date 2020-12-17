package domain.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerRepository {
    private static final List<Player> players = new ArrayList<>();

    public static List<Player> players() {
        return Collections.unmodifiableList(players);
    }

    public static void addPlayer(Player player){
        players.add(player);
    }
}
