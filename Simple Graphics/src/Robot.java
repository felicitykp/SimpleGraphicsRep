import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Robot {

	//window size
	private final int width = 800, height = 600;
	
	//rectangle variables
	private  int rectY = height/2;
	private final int rectHeight = 50, rectWidth = 50, speed = 3;
	private int rectX = width/2;
	private int rectSpeed = 0;
	private int rectSpeed2 = 0;
	
	//circle variables
	private int circleX, circleY;
	private final int diam = 30;
	private boolean drawCircle = false;
	
	private JFrame frame;
	
	public Robot() {
		
		//JFrame 
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add JPanel
		frame.add(new JPanel() {
			public void paint(Graphics g) {
	
				g.setColor(Color.RED);
				g.fillRect(rectX, rectY, rectWidth, rectHeight);
				
				if (drawCircle) {
					g.setColor(Color.blue);
					g.fillOval(circleX, circleY, diam, diam);
				}
				
			}
		});
		
		
		//adjust frame
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setFocusable(true);
		
		//key listener
		frame.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == 'd') {
					rectSpeed = speed;
				} else if (e.getKeyChar() == 'a') {
					rectSpeed = -speed;
				} else if (e.getKeyChar() == 'w') {
					rectSpeed2 = -speed;
				} else if (e.getKeyChar() == 's') {
					rectSpeed2 = speed;
				}
			}

			public void keyReleased(KeyEvent e) {
				if (e.getKeyChar() == 'd' || e.getKeyChar() == 'a')
					rectSpeed = 0;
				else if (e.getKeyChar() == 'w' || e.getKeyChar() == 's')
					rectSpeed2 = 0;
			}

			public void keyTyped(KeyEvent e) {}
		});
		
		run();
	}
	
	public void run() {
		
		while (true) {
			
			frame.getContentPane().repaint();
			
			rectX += rectSpeed;
			rectY += rectSpeed2;
			
			try {
				Thread.sleep(60);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Robot runner = new Robot(); 
	}
	
}
