package Launch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

      JFrame frame = new JFrame();
      JButton myButton = new JButton("New Window");


    // constructor
    LaunchPage(){
             // button
           myButton.setBounds(100,160,200,40);
           myButton.setFocusable(false);
           myButton.addActionListener(this);








           // frame
           frame.add(myButton);

           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(420,420);
           frame.setLayout(null);
           frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          // trigger the affect , new instance new window class
        if(e.getSource()==myButton){
            frame.dispose();  // after click button, dispose old window.
              NewWindow myWindow = new NewWindow();

        }

    }
}
