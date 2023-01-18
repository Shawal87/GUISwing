import javax.swing.*;
import java.awt.*;

public class Jlayer {

    public static void main(String [] args) {

        //JLayeredPane = Swing container that provides a third dimension
        //               third dimension for positioning components
        //                ex.depth , Z-index

        //Jlabel
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.LIGHT_GRAY);
        label1.setBounds(50,50,200,200);



        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.RED);
        label3.setBounds(150,150,200,200);









         // JPanel
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        layeredPane.add(label1);
        layeredPane.add(label2);
        layeredPane.add(label3);

        // Frame
        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);

















    }
}

