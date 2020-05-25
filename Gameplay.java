import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener
{
	boolean crash;
	int characterXrange, characterYrange, objectXrange, objectYrange;
	
	int refresherDelay = 300;
	
	static ActionListener refresher = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			refresh();
		}
	};
	
	Timer refresherTimer = new Timer(refresherDelay, refresher);
	
	public Gameplay()
	{
		
	}
	
	Character characterObject = new Character();
	Obstacle obstacleObject = new Obstacle();
	
	public void keyPressed(KeyEvent e)
	{
		int k = e.getKeyCode();
		if (k == KeyEvent.VK_SPACE && characterObject.playerY >= characterObject.floorHeight) // Must be on the ground to jump.
			{
				characterObject.jump();
				repaint();
			}
	}
	
	public static void refresh()
	{
		
	}
	
	
	
	public void keyTyped(KeyEvent e) {}
	
	public void keyReleased(KeyEvent e) {}
	
	class Collide
	{
		public void deathMessage()
		{
			
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
