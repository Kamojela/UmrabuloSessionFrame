/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author mojel
 */
public class FirstFrame extends JFrame {

    public FirstFrame(){
        setTitle("My First GUI");
        setSize(400, 450);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.red);
        setVisible(true);
    }
    
    
    
}
