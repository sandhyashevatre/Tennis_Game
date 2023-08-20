package Tennis_game1;

public class Set {
    private Game[] games = new Game[2];
    private int[] gamesWon = new int[2];

    public Set(Player player1, Player player2) {
        games[0] = new Game(player1, player2);
        games[1] = new Game(player2, player1);
    }

    public void update(Point point) {
        int gameIndex = gamesWon[0] + gamesWon[1];
        games[gameIndex].update(point);

        if (games[gameIndex].isGameComplete()) {
            gamesWon[gameIndex]++;
           
        }
    }

    public boolean isSetComplete() {
        return gamesWon[0] >= 6 || gamesWon[1] >= 6;
    }
}

