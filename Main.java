package Tennis_game1;

public class Main {
    public static void main(String[] args) {
        Player federer = new Player("Federer");
        Player nadal = new Player("Nadal");

        Match match = new Match(federer, nadal);

      
        Point point1 = new Point(federer);
        match.update(point1);

        Point point2 = new Point(nadal);
        match.update(point2);

        Point point3 = new Point(federer);
        match.update(point3);

        Point point4 = new Point(federer);
        match.update(point4);

        Point point5 = new Point(federer);
        match.update(point5);

        // Print match results
        System.out.println("Match complete: " + match.isMatchComplete());
    }
}

