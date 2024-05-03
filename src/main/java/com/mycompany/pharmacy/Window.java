/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacy;

/**
 *
 * @author mohamed
 */
import javax.swing.*;
import java.awt.*;


public class Window extends JFrame {


 private JPanel panel; 
 private JPanel panel2;
 private JLabel label; 
 private JTextField field; 
 private JButton button; 
 final int Window_Width=350;
  final int Window_Height=250;
  public  Window(){
     panel = new JPanel();
     label = new JLabel("Enter name");
     field = new JTextField(10);
     button =new JButton("Add");
     panel.add(label);
     panel.add(field);
     panel.add(button);
     this.add(panel);
     
     
    this.setTitle("pharmacy"); 
    this.setSize(Window_Width,Window_Height);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  
  }

}
