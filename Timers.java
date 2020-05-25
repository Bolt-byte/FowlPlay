import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

class Timers implements ActionListener
{
	static long points;
	static int obstacleTimerDelay;
	static int pointCountDelay;
	int obstacleX; //move to obstacle class
	
	public Timers()
	{
		obstacleTimerDelay = 4000;
		pointCountDelay = 500;
		obstacleX = 800;
	}
	
	
	//set up timers
	static ActionListener obstacleMaker = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			Obstacle.moveObstacle();
		}
	};
	
	public static Timer obstacleTimer = new Timer(obstacleTimerDelay, obstacleMaker);
	
	static ActionListener pointIncrement = new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			points++;
		}
	};
	public static Timer pointTimer = new Timer(pointCountDelay, pointIncrement);
	
	public static void start() //start timers
	{
		obstacleTimer.start();
		pointTimer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
