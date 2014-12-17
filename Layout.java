import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Layout extends JFrame {
	
	private JButton[][] buttons;
	private JButton newGame;
	private Container button;
	
	public Layout(Controller c){
		
		this.button = new Container();
		this.newGame = new JButton("New Game");
		this.buttons = new JButton[5][5];
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.add(button, BorderLayout.CENTER);
		this.button.setLayout(new GridLayout(5,5));
		
		this.add(this.newGame, BorderLayout.SOUTH);
		
		/**
		 * Buttons werdenen erstellt und in das Layout hinzugefuegt
		 */
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5;j++){
				this.buttons[i][j] = new JButton(""+ i + "" + j); //erstellung der Buttons
				this.buttons[i][j].addActionListener(c);
				this.button.add(this.buttons[i][j]); // hier wird es hinzugefuegt in den Container Button
				this.button.add(this.buttons[i][j]).setFocusable(false); // der Focus wird abgestellt damit es nicht blau umrandet ist
				}
		}
		
		
		
		/**
		 * Eine zufällige anzahl an Aktiven gruen leuchtenden buttons
		 */
		for(int i = 0; i < (int)(Math.random()*10+6);i++){
			this.buttons[(int) (Math.random()*5)][(int) (Math.random()*5)].setBackground(Color.GREEN);
		}
		
		/* 
		Buttons werden in den Container Button einzeln hinzugefuegt aber wird in der oberen for schleife erstellt
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5;j++){
				this.button.add(this.buttons[i][j]);
			}
		}
		*/
		
		this.newGame = new JButton("New Game");
		this.add(this.newGame, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
	/**
	 * bekommt ein zweidimensonales array welches hier neu geschrieben wird
	 * @param stelle ein zweideimensionales array
	 */
	public void setButton(int[][] stelle){
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				if(stelle[i][j] == 1){
					this.buttons[i][j].setBackground(Color.GREEN);
				}else{
					this.buttons[i][j].setBackground(Color.GRAY);
				}
				
			}
		}
	}
	
	/**
	 * kontrolliert ob NewGame gedrueckt wurde
	 * @param e die source
	 * @return liefert true oder false ob es geklickt wurde
	 */
	public boolean isNew(ActionEvent e){
   	 if(this.newGame == e.getSource()){
            return true;
        }else{
            return false;
        }
   }
	
}
