package BorderLayout;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String [] args) {

        //Layout Manager = Defines the natural layout for components within a container

        // 3 common managers

        // BorderLayout = A BorderLayout places components in five areas:
        // All extra space is placed in the center area.

          // Syntax library object : frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,0));
        frame.setVisible(true);

        // // Syntax library object : panel
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();



        panel1.setBackground(Color.black);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.orange);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));


        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.WEST);
        frame.add(panel5,BorderLayout.CENTER);





    }
}
