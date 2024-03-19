import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
import java.sql.*;


public class Frame extends JFrame {
    JTextField productName_txtB, productPrice_txtB, productBrand_txtB; 
    public void initialize(){

        productName_txtB = new JTextField();
        productBrand_txtB = new JTextField();
        productBrand_txtB = new JTextField();

        setVisible(true);
    }

    public static void main(String[] args){

        Frame myFrame = new Frame();
        myFrame.initialize();
    }
}
