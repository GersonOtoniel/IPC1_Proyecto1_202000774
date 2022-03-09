/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;



import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 *
 * @author Gerson
 */
public class Admin extends JFrame implements ActionListener{
    
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    private JLabel label6;
    
    public Admin(){
     
        setSize(800,500);
        setLocation(400,100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("ADMINISTRADOR");
    
        setLayout(null);
        b1 = new JButton("Crear");
        b1.setBounds(50, 250, 90, 25);
        add(b1);
        b1.addActionListener(this);
        
        b2= new JButton("Ver");
        b2.setBounds(170, 250, 90, 25);
        add(b2);
        
        b3= new JButton("Modificar");
        b3.setBounds(50, 350, 90, 25);
        add(b3);
        
        b4= new JButton("Eliminar");
        b4.setBounds(170, 350, 90, 25);
        add(b4);
        
        
        b5= new JButton("Logout");
        b5.setBounds(620, 50, 100, 25);
        add(b5);
        
        
        b6= new JButton("Usuarios");
        b6.setBounds(400, 150, 90, 25);
        add(b6);
        
        
        b7= new JButton("Bibliografias");
        b7.setBounds(500, 150, 110, 25);
        add(b7);
        
        
        b8= new JButton("Prestamos");
        b8.setBounds(620, 150, 100, 25);
        add(b8);
        
        
        b9= new JButton("Crear");
        b9.setBounds(430, 250, 90, 25);
        add(b9);
        
        
        b10=new JButton("Ver");
        b10.setBounds(580, 250, 90, 25);
        add(b10);
        
        
        b11= new JButton("Modificar");
        b11.setBounds(430, 350, 90, 25);
        add(b11);
        
        
        b12= new JButton("Eliminar");
        b12.setBounds(580, 350, 90, 25);
        add(b12);
        
        ImageIcon imagen2 = new ImageIcon("src/main/ingenieria.JPG");
       label6 = new JLabel();
       add(label6);
       label6.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(300, 100, Image.SCALE_SMOOTH)));
       label6.setBounds(40,10,300,180);
    
    }
    
    @Override
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==b1){
                 Crear crear = new Crear();
            crear.setVisible(true);
        }
        
    }
    
}
