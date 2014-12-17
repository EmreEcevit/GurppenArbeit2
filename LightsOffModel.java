package frassl;
/**
 * die Logik klasse für das Spiel Lightsoff
 * version 17.12.2014
 * @author Gabriel
 * attribut MArray: das logikarray welches später in 
 * der View gezeichnet werden wird
 *
 */
public class LightsOffModel {
	private int[][] MArray = new int[5][5];
	
	/**
	 * Construktor des Models der die Methode newGame() ausführt
 	 * @author Gabriel Frassl
	 */
	public LightsOffModel(){
		newGame();
		
	}
	/**
	 * die Methode die ein neues LogikArray generiert
	 * Sie wird beim start des Spieles aufgerufen
	 * @author Gabriel
	 */
	public void newGame(){
		for(int i = 0; i<5; i++){
			
			for(int j=0;j<5;j++){
				MArray[i][j]= (int) (Math.random()+1);
			
		}
	}
}
	/**
	 * Wenn ein Button gedrückt wird wird in dieser Methode 
	 * das Logikarray geändert,welches in der View wieder gezeichnet wird
	 * @author Gabriel Frassl
	 * @param x Die x koordinate des gedrückten Buttons
	 * @param y Die y koordinate des gedrückten Buttons
	 */
	public void changeGame(int x,int y){
		//Ändern des Wertes des gedrückten buttons
		if(MArray[x][y]== 0){
			MArray[x][y]=1;
			
		}else{ MArray[x][y]=0;}
		
		// Ändern der Werte der Buttons Links und rechts des 
		// gedrückten buttons...
		
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
		
		// Ändern der Werte der Buttons Oberhalb und unterhalb des 
			// gedrückten buttons...
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

	/**
	 * die getmethode für das Logikarray
	 * Wird im Controller der View übergeben, welche
	 * das Array benötigt um die Graphik zu erstellen
	 * @author Gabriel Frassl
	 * @return Das Logikarray MArray
	 */
public int[][] getArray(){
	return this.MArray;
}



}
