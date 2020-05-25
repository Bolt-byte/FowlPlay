import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener
{
  boolean crash, shutdownRequested;
  int characterXrange, characterYrange, objectXrange, objectYrange;
  
  JFrame gameplayFrame, deadFrame;
  JPanel contentHolder, playHolder, allPanelHolder, buttonPanel;
  JLabel pointsLabel;
  JButton leaveButton, mainMenuButton, playAgainButton;
  
  Character characterObject = new Character();
  Obstacle obstacleObject = new Obstacle();
  Timers timerObject = new Timers();
  
  public Gameplay()
  {
    //gameplay frame + panel
    gameplayFrame = new JFrame("Fowl Play");
    contentHolder = new JPanel();
    playHolder = new JPanel();
    allPanelHolder = new JPanel();
    pointsLabel = new JLabel("" + Timers.points);
    leaveButton = new JButton("X"); //exit button
    
    //add components to JPanels
    
    //frame layout, if i want the gameplay at the bottom and the labels on top, is this right? 
    allPanelHolder.setLayout(new BorderLayout());
    
    allPanelHolder.add(playHolder, BorderLayout.CENTER);
    allPanelHolder.add(contentHolder, BorderLayout.NORTH);
    
    gameplayFrame.add(allPanelHolder);
    gameplayFrame.setVisible(true);
    
    //death frame
    deadFrame = new JFrame("You died!");
    buttonPanel = new JPanel();
    
    crash = false;
    shutdownRequested = false;
  }
  
  public void refresh(){
    while(!shutdownRequested) //update screen per frame
    {
      //is there anything else i need here? 
      //if( (characterObject.characterX == ) {} INCOMPLETE, will detect if the character is "touching" the obstacle
      
      repaint();
    }
  }
  
  public void keyPressed(KeyEvent e)
  {
    int k = e.getKeyCode();
    if (k == KeyEvent.VK_SPACE && characterObject.playerY >= characterObject.floorHeight) // Must be on the ground to jump.
    {
      characterObject.jump();
      repaint();
    }
  }
  
  public void keyTyped(KeyEvent e) {}
  
  public void keyReleased(KeyEvent e) {}
  
  class Collide
  {
    public void deathMessage() //i want to create a pop up window that will give the options to either return to the main menu or replay the game. 
    {
      
    }
    
    
  }
  
  
}
