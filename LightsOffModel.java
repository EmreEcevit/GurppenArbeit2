package frassl;

public class LightsOffModel {
	private int[][] MArray = new int[5][5];
	
	public LightsOffModel(){
		newGame();
		
	}
	
	public void newGame(){
		for(int i = 0; i<5; i++){
			
			for(int j=0;j<5;j++){
				MArray[i][j]= (int) (Math.random()+1);
			
		}
	}
}
	public void changeGame(){
		
	}





}
