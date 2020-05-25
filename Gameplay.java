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
 
 public Gameplay()
 {
   crash = false;
   shutdownRequested = false;
 }
 
 Character characterObject = new Character();
 Obstacle obstacleObject = new Obstacle();
 
 public void refresh(){
   while(!shutdownRequested) //update screen per frame
   {
     //is there anything else i need here? 
     repaint();
     
     if( (characterObject.characterX 
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
   public void deathMessage()
   {
   
   }
  
  
 }
 

}
