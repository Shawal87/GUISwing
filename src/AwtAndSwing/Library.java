package AwtAndSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.print.Book;

public class Library {

    public static void main(String[] args) {
        // container
        JFrame jframe = new JFrame("Library");
        jframe.setSize(500,600);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        jframe.setLocationRelativeTo(null);


        // end container

        //



        JLabel labelTitle = new JLabel("Library Application");
        labelTitle.setBounds(180,30,150,30);
        jframe.add(labelTitle);

        // fill forms

        JLabel uName = new JLabel("Name");
        uName.setBounds(30, 50, 150, 80);
        jframe.add(uName);

        JLabel uAddress = new JLabel("Address");
        uAddress.setBounds(30,80,150,80);
        jframe.add(uAddress);

        JLabel uEmail = new JLabel("Email");
        uEmail.setBounds(30,110,150,80);
        jframe.add(uEmail);

        JLabel uContact = new JLabel("Address");
        uContact.setBounds(30,140,150,80);
        jframe.add(uContact);

        JLabel codeLabelBook = new JLabel("Code Book");
        codeLabelBook.setBounds(30, 170, 150, 80);
        jframe.add(codeLabelBook);

        JLabel BookName = new JLabel("Book Name");
        BookName.setBounds(30,200,150,80);
        jframe.add(BookName);

        JLabel BkType = new JLabel("Book Type");
        BkType.setBounds(30,230,150,80);
        jframe.add(BkType);

        JLabel dRent = new JLabel("Date Rent");
        dRent.setBounds(30,260,150,80);
        jframe.add(dRent);

        JLabel dReturn = new JLabel("Date Return");
        dReturn.setBounds(30,290,150,80);
        jframe.add(dReturn);






        //fieldText
        JTextField tfName = new JTextField();
        tfName.setBounds(150,80,200,25);
        jframe.add(tfName);

        JTextField tfAddress = new JTextField();
        tfAddress.setBounds(150,110,200,25);
        jframe.add(tfAddress);

        JTextField tfEmail = new JTextField();
        tfEmail.setBounds(150,140,200,25);
        jframe.add(tfEmail);

        JTextField tfContact = new JTextField();
        tfContact.setBounds(150,170,200,25);
        jframe.add(tfContact);

        JTextField tfCodeBk = new JTextField();
        tfCodeBk.setBounds(150,200,200,25);
        jframe.add(tfCodeBk);

        JTextField tfBkName = new JTextField();
        tfBkName.setBounds(150,230,200,25);
        jframe.add(tfBkName);










        //Radio Button Exclusive
        JRadioButton Fict =  new JRadioButton();
        Fict.setText("Fiction");
        Fict.setBounds(150,260,80,30);
        jframe.add(Fict);

         //Radio Button General
        JRadioButton NonFict=  new JRadioButton();
        NonFict.setText("Non-Fiction");
        NonFict.setBounds(250,260,110,30);
        jframe.add(NonFict);


        // rent per day ComboBox


        /*
        JComboBox cbDay  = new JComboBox();
        cbDay.setBounds(150,170,80,30);
        jframe.add(cbDay);
        */
















    }
}
