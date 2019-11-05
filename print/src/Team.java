import java.util.ArrayList;

public class Team {
    public String team;
    public ArrayList<Player> players;
    public int maxSize = 16;

    public Team(String team) {
        this.team = team;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return this.team;
    }

    public void addPlayer(Player player) {
        if (size() < maxSize) {
            players.add(player);
        }
    }

    public void printPlayers() {
        for (Player s : players) {
            System.out.println(s);
        }
    }

    public int setMaxSize(int maxSize) {
        this.maxSize = maxSize;
        return maxSize;
    }

    public int size() {
        return this.players.size();
    }

    public int goals() {
        int amount = 0;
        for (Player i : players) {
            amount += i.goalsScored;
        }
        return amount;
    }

    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Total goals: " + barcelona.goals());
    }
}
