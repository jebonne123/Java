import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
import java.sql.*;

public class Main extends JFrame {
    JTextField productName_txtB, productPrice_txtB, productBrand_txtB; 


    public void initialize(){
        
        productName_txtB = new JTextField();
        productBrand_txtB = new JTextField();
        productBrand_txtB = new JTextField();

        
        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(3,1,5,5));
        formPanel.add(productName_txtB);
        formPanel.add(productPrice_txtB);
        formPanel.add(productBrand_txtB);



        add(formPanel);
        setVisible(true);

    }

    public static void main(String[] args){

        Main myFrame = new Main();
        myFrame.initialize();
    }
    
}
