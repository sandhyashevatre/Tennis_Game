package Tennis_game1;

public class Tennis_Players {
	
	public int score=0;
	public int game=0;
	public int set=0;
	
	public void reset() {
		this.score=0;
	}
	
	
	public int getScore()
	{
		return this.score;
	}
	
	
	public void setScore(int score)
	{
		this.score=score;
	}
	

	
	public void updateScore() {
		if(score == 0 || score==15) 
		{
			this.score+=15;
		}
		
		else if((score)>=30) 
		{
			this.score+=10;
		}
	}

}