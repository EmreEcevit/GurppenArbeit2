import java.awt.*;

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
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5;j++){
				this.buttons[i][j] = new JButton();
				this.buttons[i][j].setBackground(Color.GREEN);
				//this.buttons[i].addActionListener(this.controller);
				}
		}
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5;j++){
				this.button.add(this.buttons[i][j]);
			}
		}
		
		this.setVisible(true);
	}
	
	public static void main(String[]args){
		 Layout teeest = new Layout();
	}
	
	
}
