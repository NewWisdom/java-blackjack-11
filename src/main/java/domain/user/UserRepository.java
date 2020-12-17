package domain.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserRepository {
    private static final Dealer dealer = new Dealer();
    private static final List<Player> players = new ArrayList<>();

    public static Dealer dealer() {
        return dealer;
    }

    public static List<Player> players() {
        return Collections.unmodifiableList(players);
    }

    public static void addPlayer(Player player) {
        players.add(player);
    }
}
