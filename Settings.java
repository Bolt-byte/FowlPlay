import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;  
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
public class Settings extends JFrame 
{ 
  JFrame settingsFrame;
     
  public static SettingsOther contentHolder; 
  
  public Settings() {  } 
  
  public static void main(String [] args) 
  { 
    Settings s =  new Settings(); 
    s.run();  
  }
 
 public void run() //where JFrame is created 
 { 
   settingsFrame = new JFrame("Settings"); 
   settingsFrame.setLocation(0,0); 
   settingsFrame.setSize(500,500); 
   settingsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   settingsFrame.setBackground(Color.gray); 
   
   contentHolder = new SettingsOther();  
   
   settingsFrame.getContentPane().add(contentHolder); 
   settingsFrame.setVisible(true); //JFrame is set visible 
 } 
} 
  
  
class SettingsOther extends JPanel 
{ 
 JLabel redLabel, blueLabel, greenLabel, yellowLabel, pinkLabel; 
 JLabel describeLabel, colorLabel; 
 JButton redButton, blueButton, greenButton, yellowButton, pinkButton; 
 String c; 
 Boolean greenUnlock, yellowUnlock, pinkUnlock; 
  
 public SettingsOther() 
 { 
  //panel layout 
  setLayout(new GridLayout(2,6)); 
   
  //init components 
  describeLabel = new JLabel("Click a button below to set your player Color!"); 
  colorLabel = new JLabel("Colors:"); 
  redLabel = new JLabel("Change player color to red"); 
  blueLabel = new JLabel("Change player color to blue"); 
  greenLabel = new JLabel("Change player color to green"); 
  yellowLabel = new JLabel("Change player color to yellow"); 
  pinkLabel = new JLabel("Change player color to pink"); 
   
  redButton = new JButton("Red"); 
  blueButton = new JButton("Blue"); 
  greenButton = new JButton("Green"); 
  yellowButton = new JButton("Yellow"); 
  pinkButton = new JButton("Pink"); 
   
  //add components to panels 
  add(describeLabel); 
  add(colorLabel); 
  add(redButton); 
  add(redLabel); 
  add(blueButton); 
  add(blueLabel); 
  add(greenButton); 
  add(greenLabel); 
  add(yellowButton); 
  add(yellowLabel); 
  add(pinkButton); 
  add(pinkLabel); 
   
  //add button to buttonhandler 
  redButtonHandler click1 = new redButtonHandler();  
  redButton.addActionListener(click1); 
   
  blueButtonHandler click2 = new blueButtonHandler(); 
  blueButton.addActionListener(click2); 
   
  greenButtonHandler click3 = new greenButtonHandler(); 
  greenButton.addActionListener((ActionListener) click3); 
   
  yellowButtonHandler click4 = new yellowButtonHandler(); 
  yellowButton.addActionListener(click4); 
   
  pinkButtonHandler click5 = new pinkButtonHandler(); 
  pinkButton.addActionListener(click5); 
 } 
  
 class redButtonHandler implements ActionListener 
 { 
  public void actionPerformed(ActionEvent e) 
  { 
   String pressButton = e.getActionCommand(); 
    
   if(pressButton.contentEquals("Red")) 
   { 
    redButton.setText("Are You sure?"); 
   } 
   else 
   { 
    c = "RED"; 
    redButton.setText("Red"); 
   } 
  } 
 } 
  
 class blueButtonHandler implements ActionListener 
 { 
  public void actionPerformed(ActionEvent e) 
  { 
   String pressButton = e.getActionCommand(); 
    
   if(pressButton.contentEquals("Blue")) 
   { 
    blueButton.setText("Are You sure?"); 
   } 
   else 
   { 
    c = "BLUE"; 
    blueButton.setText("Blue"); 
   } 
  } 
 } 
  
 class greenButtonHandler implements ActionListener 
 { 
  public void actionPerformed(ActionEvent e) 
  { 
   String pressButton = e.getActionCommand(); 
    
   if(pressButton.contentEquals("Green")) 
   { 
    if(greenUnlock == false) 
     greenButton.setText("Do you want to buy Green for 200 coins?"); 
    if(greenUnlock == true) 
     greenButton.setText("Are you sure?"); 
 
   } 
   if(pressButton.contentEquals("Do you want to buy Green for 200 coins?")) 
   { 
    greenUnlock = true; 
    greenButton.setText("Green"); 
   } 
   if(pressButton.contentEquals("Are you sure?")) 
   { 
    c = "GREEN"; 
    greenButton.setText("Green"); 
   } 
  } 
 } 
  
 class yellowButtonHandler implements ActionListener 
 { 
  public void actionPerformed(ActionEvent e) 
  { 
   String pressButton = e.getActionCommand(); 
    
   if(pressButton.contentEquals("Yellow")) 
   { 
    if(yellowUnlock == false) 
     yellowButton.setText("Do you want to buy Yellow for 300 coins?"); 
    if(yellowUnlock == true) 
     yellowButton.setText("Are you sure?"); 
 
   } 
   if(pressButton.contentEquals("Do you want to buy Yellow for 300 coins?")) 
   { 
    yellowUnlock = true; 
    yellowButton.setText("Yellow"); 
   } 
   if(pressButton.contentEquals("Are you sure?")) 
   { 
    c = "YELLOW"; 
    yellowButton.setText("Yellow"); 
   } 
  } 
 } 
  
 class pinkButtonHandler implements ActionListener 
 { 
  public void actionPerformed(ActionEvent e) 
  { 
   String pressButton = e.getActionCommand(); 
    
   if(pressButton.contentEquals("Pink")) 
   { 
    if(pinkUnlock == false) 
     pinkButton.setText("Do you want to buy Pink for 500 coins?"); 
    if(pinkUnlock == true) 
     pinkButton.setText("Are you sure?"); 
 
   } 
   if(pressButton.contentEquals("Do you want to buy Yellow for 500 coins?")) 
   { 
    pinkUnlock = true; 
    pinkButton.setText("Pink"); 
   } 
   if(pressButton.contentEquals("Are you sure?")) 
   { 
    c = "YELLOW"; 
    pinkButton.setText("Pink"); 
   } 
  } 
 }  
  
 public static void runIt() 
 { 
  SettingsOther runner = new SettingsOther(); 
 } 
} 
