package GlassPaneDemo;

import javax.swing.*;

public class GlassPaneDemo {

    //** An application that requires no other files. */
    static private MyGlassPane myGlassPane;

      //**
      // Create the GUI and show it.  For thread safety,
      // this method should be invoked from the
      // event-dispatching thread.

      private static void createAndShowGUI(){
          // Create and set up the window
          JFrame frame = new JFrame("GlassPaneDemo");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          //Start creating and adding components
          JCheckBox changeButton = new JCheckBox("Glass pane\"visible\"");
          changeButton.setSelected(false);
      }



}
