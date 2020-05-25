import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Startup
{
 MainMenu start = new MainMenu();
}

class MainMenu //main menu frame
{
 private JFrame mainMenuFrame = new JFrame("Main Menu");
 private JButton playButton, introductionButton, settingsButton, quitButton; //add a shop? or put it under settings?
 private JLabel title;
 private JPanel buttonPanel, finishedPanel, introPanel;
 
 public MainMenu()  //Main Menu Panel
 {
  //initialize frame
  mainMenuFrame.setLocation(0,0);
  mainMenuFrame.setSize(800,800); //change this!!
  mainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  mainMenuFrame.setBackground(Color.gray); //change this!!
       
  //create panels
  buttonPanel = new JPanel();
  finishedPanel = new JPanel();
  introPanel = new JPanel();
       
  //create buttons
  playButton = new JButton("Play!");
     introductionButton = new JButton("Introduction");
     settingsButton = new JButton("Settings");
     quitButton = new JButton("Quit Game");
     title = new JLabel("Fowl Play");
       
     //add components to panels
     buttonPanel.add(title);
     buttonPanel.add(playButton);
     buttonPanel.add(introductionButton);
     buttonPanel.add(settingsButton);
     buttonPanel.add(quitButton);
     
     title.setFont(title.getFont().deriveFont(32f));
     
     //add button to MainMenuButtonHandler
  MainMenuButtonHandler click = new MainMenuButtonHandler();
  playButton.addActionListener(click); introductionButton.addActionListener(click);
  settingsButton.addActionListener(click); quitButton.addActionListener(click);
  
  //add img to intro panel
  //Image introImg = new ImageIcon("filename").getImage();
       
  //manage panel layout
  buttonPanel.setLayout(new GridLayout(0,1,0,15));
  finishedPanel.setLayout(new GridLayout(2,3));
  
  //add panels to other panels/frames
  finishedPanel.add(buttonPanel);
  mainMenuFrame.add(finishedPanel);
  mainMenuFrame.setVisible(true);
 } //close constructor
 
 class MainMenuButtonHandler implements ActionListener //ButtonHandler
 {
  
  
  public void actionPerformed (ActionEvent e)
  {
   String buttonPressed = e.getActionCommand();
   
   if(buttonPressed.contentEquals("Play!"))
   {
    //take user to the play frame + start timers
    /* mainMenuFrame.setVisible(false);
     * mainMenuFrame.dispose(); */
    Timers.start();
   }
   
   if(buttonPressed.contentEquals("Introduction"))
   {
       //create introduction frame + panel
   }
   
   if(buttonPressed.contentEquals("Settings"))
   {
     Settings settingRunner = new Settings();
     settingRunner.settingsFrame.setVisible(false);
    
   }
         
   if(buttonPressed.contentEquals("Quit Game"))
   {
    //exits and shuts the program down
    System.exit(0);
    mainMenuFrame.setVisible(false);
    mainMenuFrame.dispose();
   }
  }
 }//close buttonhandler
}
