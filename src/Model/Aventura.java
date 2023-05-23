package Model;

import java.util.ArrayList;
import java.util.Objects;

public class Aventura {

    private ArrayList<Player> playersList;

    public Aventura() {
        this.playersList = new ArrayList<Player>();
    }



    public ArrayList<Player> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(ArrayList<Player> playersList) {
        this.playersList = playersList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aventura aventura = (Aventura) o;
        return Objects.equals(playersList, aventura.playersList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playersList);
    }

    @Override
    public String toString() {
        return "Aventura{" +
                "playersList=" + playersList +
                '}';
    }

    public Player createPlayer(String name) {
        Player player = new Player();
        player.setName(name);
        player.setPoints(0);
        playersList.add(player);
        return player;
    }

    public void addPoints(int i, Player player) {
        int newPoints = 0;
        int points = player.getPoints();
        newPoints = points + i;
        player.setPoints(newPoints);
    }
}
