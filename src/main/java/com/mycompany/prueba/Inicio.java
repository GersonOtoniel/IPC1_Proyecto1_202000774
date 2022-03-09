
package com.mycompany.prueba;

/**
 *
 * @author Gerson
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.imageio.*;
import javax.swing.ImageIcon;


public class Inicio extends JFrame {
    
    
    
    public Inicio(){
       
        setTitle("BIBLIOTECA FACULTAD DE INGENIERIA USAC");
        setBounds(400,200,900,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Inicio1 marc2 = new Inicio1();
        add(marc2);
       
    }
    
}

class Inicio1 extends JPanel implements ActionListener{

    private JButton boton1;
    private JLabel label1, label2,label3,label4, label5,label6;
    private JTextField textfield1;
    
    
    
    public Inicio1(){
    setBackground(Color.LIGHT_GRAY);
    
    setLayout(null);
    label1 = new JLabel("Vision");
    label1.setBounds(500,150,50,20);
    add(label1);
    
    label2 = new JLabel("Ser la unidad de informacion especializada y tecnica, "
            + "con ");
    label2.setBounds(500,160, 340, 50);
    add(label2);
    
    label3 = new JLabel("estandares de Biblioteca Universitaria, en beneficio del");
    label3.setBounds(500,175,350,50);
    add(label3);
    
    label4 = new JLabel("desarrollo de la ciencia y tecnologia del pais.");
    label4.setBounds(500,190,350,50);
    add(label4);
    
    
    boton1 = new JButton("Login");
    boton1.setBounds(750,30,70,50);
    add(boton1);
    boton1.addActionListener(this);
    
    ImageIcon imagen = new ImageIcon("src/main/cuentas-usuario-windows.jpg");
    label5 = new JLabel();
    add(label5);
    label5.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
    label5.setBounds(50,25,80,80);
    
    
    ImageIcon imagen2 = new ImageIcon("src/main/ingenieria.JPG");
    label6 = new JLabel();
    add(label6);
    label6.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH)));
    label6.setBounds(50,150,400,100);
    
    }
    private Image imagen;
    public void paintComponent(Graphics g){
    
    super.paintComponent(g);
     g.drawRect(40, 18, 800, 95);
     
    
}

@Override
public void actionPerformed(ActionEvent e){
    
    if(e.getSource()==boton1){
    Login login = new Login();
    login.setVisible(true);
     
    
    } 
    
    
}



}

    
