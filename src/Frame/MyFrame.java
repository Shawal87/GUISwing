package Frame;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class    MyFrame extends JFrame {



        MyFrame() {

            this.setSize(420,420); // set size this
            this.setVisible(true);  // make this visible
            this.setTitle("Jthis title go here"); // set title of this
            this.setResizable(false);  // prevent this from being resized.

              ImageIcon image = new ImageIcon("logo.png"); // create an ImageIcon
              this.setIconImage(image.getImage());      //change icon of this//
              this.getContentPane().setBackground(new Color(123,50,250)); // change color of background color




        }
}
