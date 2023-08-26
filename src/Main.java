package Tennis_game1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tennis_Players Sandhya = new Tennis_Players();
		Tennis_Players Rucha = new Tennis_Players();
		Game s = new Game();
		Match m = new Match();
		Set t = new Set();
		Sandhya.setScore(40);
		Rucha.setScore(60);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
	
		
		//System.out.println("GetScore1:"+Sandhya.getScore());
		
		t.updateSet(m, m.getP1(), m.getP2());
		Sandhya.setScore(40);
		Rucha.setScore(60);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		
		
		//System.out.println("GetScore1:"+Sandhya.getScore());
		
		t.updateSet(m, m.getP1(), m.getP2());
		Sandhya.setScore(40);
		Rucha.setScore(60);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
		Sandhya.setScore(60);
		Rucha.setScore(40);
		m.updateMatch(Sandhya, Rucha);
//		System.out.println(m.getP1()+"m.getP1();");
//		System.out.println(m.getP2()+"m.getP2();");
		
		//System.out.println("GetScore1:"+Sandhya.getScore());
		
		t.updateSet(m, m.getP1(), m.getP2());
		if(t.setResult(t.p1Sets, t.p2Sets)==1)
		{
			System.out.println("Sandhya won the game!!");
		}
		else {
			System.out.println("Rucha won the game!!");
		}
	}

}