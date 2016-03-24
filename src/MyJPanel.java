
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class MyJPanel extends JPanel implements MouseMotionListener{
	
	12345;
	private Square square = new Square(100);
	
	public MyJPanel(){
		addMouseMotionListener(this);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		// TODO Draw square and fill it with random color decided by method getRandomColor()
		// You should use fillRect()
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Get mouse dragged position and change suqare's position
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
}
