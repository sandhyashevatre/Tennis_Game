package Tennis_game1;

public class Game {
	
	
	public int getGame(Tennis_Players neeraj, Tennis_Players karthik)
	{
		
		if((neeraj.getScore()>=40 && karthik.getScore()>=40)) 
		{
			if(neeraj.getScore()-karthik.getScore()==20) {
				
				return 1;
					
			}
			
			else if(karthik.getScore()-neeraj.getScore()==20) {
				
				return 2;
			}
			
		}
		
		else if(neeraj.getScore()>40 && karthik.getScore()<=30)
		{
			
			return 1;
		}
		
		else if(karthik.getScore()>40 && neeraj.getScore()<=30) {
			
		return 2;
			
		}
	
		
		return 0;
		
}
}