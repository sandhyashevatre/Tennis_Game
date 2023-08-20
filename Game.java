package Tennis_game1;

public class Game {
    private int[] points = new int[2];
    private Player[] players = new Player[2];
    private Player gameWinner = null; 

    public Game(Player player1, Player player2) {
        players[0] = player1;
        players[1] = player2;
    }

    public void update(Point point) {
        int playerIndex = getPlayerIndex(point.getWinner());
        points[playerIndex]++;

        if (points[0] >= 4 || points[1] >= 4) {
            if (Math.abs(points[0] - points[1]) >= 2) {
            
                gameWinner = players[playerIndex];  
                points[0] = points[1] = 0;  
            } else if (points[0] == points[1] && points[0] == 3) {
               //here
            }
        }
    }

    public boolean isGameComplete() {
        return gameWinner != null;  // Check if there's a winner
    }

    public Player getGameWinner() {
        return gameWinner;
    }

    
  

    private int getPlayerIndex(Player player) {
        return players[0] == player ? 0 : 1;
    }
}
