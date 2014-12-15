import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Layout extends JFrame {
	
	private JButton[][] buttons;
	private JButton newGame;
	private Container button;
	
	public Layout(){
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
				this.buttons[i][j] = new JButton(""+ i + " " + j); //erstellung der Buttons
				this.buttons[i][j].addActionListener(
				
					new ActionListener(){
						public void actionPerformed(ActionEvent e){
							Layout l = new Layout();
							JButton buttonT = new JButton();
							buttonT =(JButton) e.getSource();
							//System.out.println(buttonT.getText());
							int [] zahlen = new int[2];
							zahlen[0] = Integer.parseInt(buttonT.getText().substring(0, 1));
							zahlen[1] = Integer.parseInt(buttonT.getText().substring(1));
							l.setButton( zahlen[0], zahlen[1]);							
							
						}
					}
				);
							//this.controller);
				this.button.add(this.buttons[i][j]); // hier wird es hinzugefuegt in den Container Button
				this.button.add(this.buttons[i][j]).setFocusable(false); // der Focus wird abgestellt damit es nicht blau umrandet ist
				//this.buttons[i][j].setBackground(Color.GREEN);
				//this.buttons[(int) (Math.random()*5)][(int) (Math.random()*5)].setEnabled(false);
				//this.buttons[i].addActionListener(this.controller);
				}
		}
		
		
		
		/**
		 * Eine zufällige anzahl an Aktiven gruen leuchtenden buttons
		 */
		for(int i = 0; i < (int)(Math.random()*10+6);i++){
			this.buttons[(int) (Math.random()*5)][(int) (Math.random()*5)].setEnabled(false);
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
		
		this.setVisible(true);
	}
	
	/**
	 * Kontrilliert was gedrueckt wurde
	 * @param i
	 * @param j
	 */
	public void setButton(int i,int j){
		for(int o = 0; o < 5; o++){
			if(o == i){
				for(int k = 0; k < 5; k++){
					if(k == j){
						this.buttons[i][j].setBackground(Color.GREEN);
						this.buttons[i][j].setEnabled(false);
					}
				}
			}
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[]args){
		 Layout teeest = new Layout();
	}
	
	
}
