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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Login extends JFrame implements ActionListener {
    private JLabel label1, label2,label3;
    private JTextField textfield1;
    private JButton boton1, boton2, boton3;
    private JPasswordField textfield2;
    
    public Login(){
    setBackground(Color.BLUE);
    setTitle("Login");
    setVisible(true);
    setSize(500,450);
    setLocation(500,200);
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    //Login1 log =  new Login1();
    //add(log);
    
        setVisible(true);
        setLayout(null);
        label1= new JLabel("Usuario");
        label1.setBounds(80, 140, 90, 25);
        add(label1);
    
        textfield1 = new JTextField();
        textfield1.setBounds(170,140,200,25);
        add(textfield1);
        
        label2 = new JLabel("Contraseña");
        label2.setBounds(80, 190, 90, 25);
        add(label2);
        
        textfield2 =  new JPasswordField();
        textfield2.setBounds(170,190,200,25);
        add(textfield2);
        
        
        boton1 = new JButton("Ingresar");
        boton1.setBounds(80, 290, 90, 25);
        add(boton1);
        boton1.addActionListener(this);
        
        boton2 = new JButton("Cancelar");
        boton2.setBounds(190, 290, 90, 25);
        add(boton2);
        
        boton3 = new JButton("Crear");
        boton3.setBounds(300, 290, 90, 25);
        add(boton3);
        boton3.addActionListener(this);
        
         ImageIcon imagen = new ImageIcon("src/Pacman/cuentas-usuario-windows.jpg");
        label3 = new JLabel();
        add(label3);
        label3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH)));
        label3.setBounds(200,25,90,90);
        
     
        
    
    }
    
    @Override
    
    public void actionPerformed(ActionEvent e){
        
       
         
        if(e.getSource()==boton3){
            Crear crear = new Crear();
            crear.setVisible(true);
           
           dispose();
           
        } else if (e.getSource()==boton1){
             String usuario = "admin";
             String contra="123";
             String pass = new  String(textfield2.getPassword());
                if(textfield1.getText().equals(usuario)&&pass.equals(contra)){
                    Admin ad= new Admin();
                    ad.setVisible(true);
                    dispose();
                } else{
               
               
               JOptionPane.showMessageDialog(null, "Usuario o Contrasenia incorrectos", "Alerta", JOptionPane.PLAIN_MESSAGE);


                }
               
        }
      
  
    }

  
  
}


