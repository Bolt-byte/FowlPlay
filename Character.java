import java.awt.*; import java.awt.event.*; 
import javax.swing.*; 

 class Character extends JPanel
{
	int floorHeight;
	boolean decline, jumpRequested;
	int playerIncrement;
	int playerY, playerX;
	
	public Character()
	{
		floorHeight = 650;
		playerX = 25;
		playerY = 600;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//floor
		g.setColor(Color.BLACK);
		g.drawRect(0,  650, 800, 150);
		
		//character
		g.setColor(Color.RED);
		g.drawRect(playerX, playerY, 50, 50);
		
		Image background = new ImageIcon("background.png").getImage();
		g.drawImage(background, 0, 0, 800, 800, null);
	}
	
	public void jump()
	{
		while (playerY <= 235) 
		{
			playerY += playerIncrement;
			
			repaint();
			
			if(playerY == 235)
			{
				decline = true;
				
			}
		}// Will result in the player moving upwards.
		
		while (decline == true)
		{
			playerY -= playerIncrement; // Move the player on the y-axis based on the strength of the jump.
			repaint();
			
			if(playerY == 150)
				decline = false;	
		}
		
		
		
	}
}


		
		