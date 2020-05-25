import java.awt.*; import javax.swing.*;



public class Obstacle extends JPanel
{
	int obstacleX, obstacleY;
	int obstacleHeight, obstacleWidth;
	
	public Obstacle()
	{
		obstacleY = 200;
		obstacleX = 800;
		obstacleHeight = 50;
		obstacleWidth = 75;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.green);
		g.drawRect(obstacleX, obstacleY, obstacleWidth, obstacleHeight);
	}
	
	public static void moveObstacle()
	{
		
	}

}
