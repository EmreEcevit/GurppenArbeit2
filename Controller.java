package Otahal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class Controller implements ActionListener
{
	private Layout v;
	private LightsoffModel m;
	private JButton test;
	
	public Controller()
	{	
		this.m = new LightsoffModel();
		this.v = new Layout (this);
		
		this.test = new JButton();
	}
	public void actionPerformed(ActionEvent e)
	{
		if (this.v.isNew(e)){
			m.newGame();
			v.setButton(m.getArray());
		}else{
			test = (JButton) e.getSource();
			int x = Integer.parseInt(test.getText().substring(0,1));
			int y = Integer.parseInt(test.getText().substring(1));
			m.changeGame(x,y);
			v.setButton(m.getArray());
		}
		
	}
	public static void main(String args[])
	{
		new Controller();
	}
}
