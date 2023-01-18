package FlowLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String [] args) {

        // Layout Manager = Defines the natural layout for components within a container

        // FlowLayout = places components in a row, sized at their preferred size.
        //              if the horizontal space in the container is too small,
        //              the FlowLayout class uses the next available row.

        // failed to free flowlayout in gui

          // syntax library frame 
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));  // CENTER, LEADING, TRAILING  , YOU CAN
        // SET VERTICAL SPACING KEY IN 10,10 (POSITION, HP, HV




         // Frame button  or you can replace al frame to new function
         // add button into a panel eg frame.add(new JButton("1")) to 
         // panel.add(new JButton("1"));
        // thus you have to create syntax library variable
        
        
        // syntax library JPanel object
          JPanel panel = new JPanel();
          panel.setPreferredSize(new Dimension(250,250));
          panel.setBackground(Color.LIGHT_GRAY);
         // panel.setLayout(new FlowLayout());
          
        
          
        
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));

        // Intention place frame here so not glicth on visible under frame . object .parameter
        frame.add(panel);
        frame.setVisible(true);


    }
}
