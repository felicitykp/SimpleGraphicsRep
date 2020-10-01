import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Penguin extends JPanel {

	//VARIABLES
	public final int width = 400, height = 500;
	public final int headX = 125, headY = 50;
	public final int headHeight = 150;
	public final int bodyWidth = 200, bodyHeight = 250;
	public final int noseWidth = 50, noseHeight = 20;
	
	//CONSTRUCTOR
	public Penguin() {
		
		//setup JFrame
		JFrame frame = new JFrame();
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		this.setFocusable(true);
		
	}
	
	public void paint(Graphics g) {
		//head
		g.setColor(Color.BLACK);
		g.fillOval(headX, headY, headHeight, headHeight);
		
		//eyes
		g.setColor(Color.WHITE);
		g.fillOval((int)(headX+(headHeight*0.15)), (int)(headY+(headHeight*0.25)), (int)(headHeight*0.3), (int)(headHeight*0.3));
		g.fillOval((int)(headX+(headHeight*0.55)), (int)(headY+(headHeight*0.25)), (int)(headHeight*0.3), (int)(headHeight*0.3));
		g.setColor(Color.BLACK);
		g.fillOval((int)(headX+(headHeight*0.22)), (int)(headY+(headHeight*0.32)), (int)(headHeight*0.2), (int)(headHeight*0.2));
		g.fillOval((int)(headX+(headHeight*0.58)), (int)(headY+(headHeight*0.32)), (int)(headHeight*0.2), (int)(headHeight*0.2));
		g.setColor(Color.WHITE);
		g.fillOval((int)(headX+(headHeight*0.34)), (int)(headY+(headHeight*0.35)), (int)(headHeight*0.05), (int)(headHeight*0.07));
		g.fillOval((int)(headX+(headHeight*0.70)), (int)(headY+(headHeight*0.35)), (int)(headHeight*0.05), (int)(headHeight*0.07));
				
		//feet
		g.setColor(Color.ORANGE);
		g.fillOval(headX-10, (int)(headY+(bodyHeight*1.22)), noseWidth*2, noseHeight*2);
		g.fillOval(headX+70, (int)(headY+(bodyHeight*1.22)), noseWidth*2, noseHeight*2);
		
		//body
		g.setColor(Color.BLACK);
		g.fillOval(headX-25, (int)(headY+(headHeight*0.6)), bodyWidth, bodyHeight);
		
		//nose
		g.setColor(Color.ORANGE);
		g.fillOval(headX+50, (int)(headY+(headHeight*0.55)), noseWidth, noseHeight);
		
		
		
		//body cont
		g.setColor(Color.WHITE);
		g.fillOval(headX+7, (int)(headY+(headHeight*0.9)), (int)(bodyWidth*0.7), (int)(bodyHeight*0.8));
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Penguin(); 
	}
	
}
