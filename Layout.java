import java.awt.*;
import javax.swing.*;


public class Layout extends JFrame {

	public Layout(){
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(5,5));
		this.setVisible(true);
	}
	
	
}
