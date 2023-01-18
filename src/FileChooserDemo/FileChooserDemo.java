package FileChooserDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileChooserDemo extends JPanel implements ActionListener {

    static private final String newline  ="\n";
    JButton openButton, saveButton;
    JTextArea log;
    JFileChooser fc;

    public FileChooserDemo(){

        super(new BorderLayout());
        //Create the log first, because the action listeners
        //need to refer to it.
        log = new JTextArea((5),20);
        log.setMargin(new Insets(5,5,5,5));
        log.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(log);

        // create a file chooser
        fc = new JFileChooser();
        //then the default mode (FILES_ONLY) will be used
        //fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        openButton = new JButton("Open a File");
        openButton.addActionListener(this);

        saveButton  = new JButton(" save");
        saveButton.addActionListener(this);

        //For layout purposes, put the buttons in a separate panel
        JPanel buttonPanel = new JPanel(); //use FlowLayout
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);

        //For layout purposes, put the buttons in a separate panel
        add(buttonPanel, BorderLayout.PAGE_START);
        add(logScrollPane, BorderLayout.CENTER);

    }



    @Override
    public void actionPerformed(ActionEvent e) {

         if(e.getSource() == openButton){
             int returnVal = fc.showOpenDialog(FileChooserDemo.this);

             if(returnVal == JFileChooser.APPROVE_OPTION){
                 File file = fc.getSelectedFile();
                 log.append("opening file" + file.getName() + "." + newline);
             }else{
                 log.append("Open command cancelled by user"+ newline);
             }
             log.setCaretPosition(log.getDocument().getLength());
         }else if(e.getSource()== saveButton){
             int returnVal = fc.showSaveDialog(FileChooserDemo.this);
             if(returnVal == JFileChooser.APPROVE_OPTION){
                 File file = fc.getSelectedFile();
                 log.append("saving" + file.getName()+ "." + newline);
             }else{
                 log.append("Save command cancel by user" + newline);
             }
             log.setCaretPosition(log.getDocument().getLength());
         }
    }

      /* protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = FileChooserDemo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
       */

       private static void createAndShowGUI(){
           JFrame frame = new JFrame("FileChooseDemo");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

           frame.add(new FileChooserDemo());

           frame.pack();
           frame.setVisible(true);
       }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UIManager.put("swing.boldmetal",Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }




}
