package Tennis_game1;


public class Match {
    private Player[] players = new Player[2];
    private Set[] sets = new Set[5];
    private int[] setsWon = new int[2];

    public Match(Player player1, Player player2) {
        players[0] = player1;
        players[1] = player2;
        sets[0] = new Set(player1, player2);
    }

    public void update(Point point) {
        int setIndex = setsWon[0] + setsWon[1];
        sets[setIndex].update(point);

        if (sets[setIndex].isSetComplete()) {
            setsWon[setIndex]++;
            if (isMatchComplete()) {
                                int winnerIndex = setsWon[0] > setsWon[1] ? 0 : 1;
                System.out.println(players[winnerIndex].getName() + " wins the match!");
            }
        }
    }

    public boolean isMatchComplete() {
        return setsWon[0] + setsWon[1] >= 2;  
    }
}
