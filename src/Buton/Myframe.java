package Buton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe  extends JFrame implements ActionListener {

     // create object/ variable button so implement have access to it
          JButton button;

      // constructor Myframe
     Myframe(){

         // create a button in localize inside constructor , but when do implement, implement doesnt have acces to button but it create inside constructor, sol the solution is
         // create button as a global, for implement to have access to it.
         //JButton button =  new JButton();
          button =  new JButton();
          button.setBounds(200,100,100,50);
          button.addActionListener(this);
          button.setText("button");
          button.setFocusable(false);   // eliminate outbound line
          button.setHorizontalTextPosition(JButton.CENTER);
          button.setVerticalTextPosition(JButton.CENTER);




         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLayout(null);
         this.setSize(500,500);
         this.setVisible(true);
         this.add(button);

     }


    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button){
      System.out.print("click");
    }
    }
}
