import java.awt.Color;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class MyJPanel extends JPanel implements MouseMotionListener{
	

	private Square square = new Square(100);
	private int my_x,my_y;
	
	public MyJPanel(){
		addMouseMotionListener(this);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor( square.getRandomColor() );
		g.fillRect(my_x, my_y, square.getShapeWidth(), square.getShapeHeight());
		// TODO Draw square and fill it with random color decided by method getRandomColor()
		// You should use fillRect()
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
			my_x=square.getCenterX(e.getX());
			my_y=square.getCenterY(e.getY());
			paintComponent(this.getGraphics());
		
		// TODO Get mouse dragged position and change suqare's position
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		
	}
}
