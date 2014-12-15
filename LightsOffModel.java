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
	public void changeGame(int x,int y){
		if(MArray[x][y]== 0){
			MArray[x][y]=1;
			
		}else{ MArray[x][y]=0;}
		
		
		int Xmin= x-1; 
		int Xplus= x+1;
		if(x > 0 && x <5){
			if(MArray[Xmin][y]== 0){
				MArray[Xmin][y]=1;
				
			}else{ MArray[Xmin][y]=0;}
			
			if(MArray[Xplus][y]== 0){
				MArray[Xplus][y]=1;
				
			}else{ MArray[Xplus][y]=0;}
		}
		if(x ==0){
			if(MArray[Xplus][y]== 0){
				MArray[Xplus][y]=1;
				
			}else{ MArray[Xplus][y]=0;}
			
		}
		if(x == 5){
			if(MArray[Xmin][y]== 0){
				MArray[Xmin][y]=1;
				
			}else{ MArray[Xmin][y]=0;}
			
			
		}
		
		// yyyyyyyyyyyy
		int Ymin= x-1; 
		int Yplus= x+1;
		if(x > 0 && x <5){
			if(MArray[x][Ymin]== 0){
				MArray[x][Ymin]=1;
				
			}else{ MArray[x][Ymin]=0;}
			
			if(MArray[x][Yplus]== 0){
				MArray[x][Yplus]=1;
				
			}else{ MArray[x][Yplus]=0;}
		}
		if(x ==0){
			if(MArray[x][Yplus]== 0){
				MArray[x][Yplus]=1;
				
			}else{ MArray[x][Yplus]=0;}
			
		}
		if(x == 5){
			if(MArray[x][Ymin]== 0){
				MArray[x][Ymin]=1;
				
			}else{ MArray[x][Ymin]=0;}
			
			
		}
		
	}

public int[][] getArray(){
	return this.MArray;
}



}
