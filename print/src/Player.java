public class Player {
    public String playerName;
    public int goalsScored;

    public Player(String playerName, int goalsScored) {
        this.playerName = playerName;
        this.goalsScored = goalsScored;
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getName() {
        return playerName;
    }

    public int goals() {
        return goalsScored;
    }

    public String toString() {
        return "Player: " + playerName + ", goals: " + goalsScored;
    }

    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());

        Player brian = new Player("Brian");
        System.out.println("Player: " + brian);

        Player pekka = new Player("Pekka", 39);
        System.out.println("Player: " + pekka);
    }
}
