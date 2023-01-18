package logo;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.text.Format;

public class Main {
    public static void main( String[] args) {

        //create image





         // create  a frame
        JFrame frame = new JFrame();      //create a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // exit title of frame
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);    // HIDE
        frame.setSize(500, 500);  //set frame dimension
        frame.setResizable(false);   // prevent frame from being resize
        frame.setVisible(true);      // set frame visible
        frame.setTitle("LOGO");     //


        // create image icon
        ImageIcon image = new ImageIcon("peguin.png");
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(Color.white);



        //create label
        JLabel label = new JLabel(); // create label
        label.setIcon(image);
        label.setText("Logia");
        label.setForeground(Color.black);









    }
}
