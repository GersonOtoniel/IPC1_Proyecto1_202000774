
package com.mycompany.prueba;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
 class Crear extends JFrame implements ActionListener{ 

    JTextField textfield1,textfield2,textfield3,textfield4,textfield5,textfield6,textfield7;
    private JLabel label1,label2,label3,label4,label5,label6,label7,labels;
    private JButton boton1, boton2, boton3;
    JComboBox<String> combo1;
    JPasswordField password1;
    JPasswordField password2;
    VerUsuarios tabla;
    
   
    
     public Crear(){
        
        //setBounds(400,200,500,400);
        setSize(500,400);
        setLocation(400,200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Crear Usuario");
         
       setBackground(Color.LIGHT_GRAY);
       setLayout(null);
        label1 = new JLabel("ID");
        label1.setBounds(50,20,300,30);
        add(label1);
        textfield1 = new JTextField();
        textfield1.setBounds(190,20,200,25);
        add(textfield1);
        
        label2 = new JLabel("Nombre");
        label2.setBounds(50,50,500,30);
        add(label2);
        textfield2 = new JTextField();
        textfield2.setBounds(190,50,200,25);
        add(textfield2);
        
        label3 = new JLabel("Apellido");
        label3.setBounds(50,80,500,30);
        add(label3);
        textfield3 = new JTextField();
        textfield3.setBounds(190,80,200,25);
        add(textfield3);
        
        label4 = new JLabel("Usuario");
        label4.setBounds(50,110,500,30);
        add(label4);
        textfield4 = new JTextField();
        textfield4.setBounds(190,110,200,25);
        add(textfield4);
        
        
        label5 = new JLabel("Rol");
        label5.setBounds(50,140,500,30);
        add(label5);
        
        combo1 = new JComboBox<>();
        combo1.setBounds(190,140,100,25);
        add(combo1);
        
        combo1.addItem("Estudiante");
        combo1.addItem("Catedrático");
        
        label6 = new JLabel("Contraseña");
        label6.setBounds(50,170,500,30);
        add(label6);
        
        password1 = new JPasswordField();
        password1.setBounds(190,170,200,25);
        add(password1);
        
        label7 = new JLabel("Confirmar Contraseña");
        label7.setBounds(50,200,500,30);
        add(label7);
        
        password2 = new JPasswordField();
        password2.setBounds(190,200,200,25);
        add(password2);
          
        //BOTONES
        setLayout(null);
        boton1 =  new JButton("Crear");
        boton1.setBounds(100,300,70,20);
        add(boton1);
        boton1.addActionListener(this);
        
        boton2 = new JButton("Modificar");
        boton2.setBounds(200,300,100,20);
        add(boton2);
        
        
        boton3 = new JButton("Eliminar");
        boton3.setBounds(330,300,90,20);
        add(boton3);
        boton3.addActionListener(this);
        
        
     } 
     
     
     @Override
    public void actionPerformed(ActionEvent e) {
        
                if(e.getSource()==boton1){
                    
                    Usuario dar = new Usuario(textfield1.getText(), textfield2.getText(), textfield3.getText(), 
                    textfield4.getText(),combo1.getSelectedItem(), password1.getText(), password2.getText());
                    
                    String[][] datos = new String[10][10];
                     datos[0][0]=textfield1.getText();
                     datos[0][1]=textfield2.getText();
                     datos[0][2]=textfield3.getText();
                     datos[0][3]=textfield4.getText();
                     datos[0][4]=(String) combo1.getSelectedItem();
                     datos[0][5]= password1.getText();
                     datos[0][6]= password2.getText();
                  
                  String[] cabezera ={"ID","Nombre","Apellido","Usuario","Rol","Contraseña","Confirmar Contraseña"};
                  /*String[][] datos=Usuario1.darusuario();*/
                 
                  tabla = new VerUsuarios(datos,cabezera); 
                    
                    
                    
                      
                } else if(e.getSource()==boton3){
                
                    textfield1.setText("");
                    textfield2.setText("");
                }
  }

     
 /*class Usuario1{

   static  Crear[] mat = new Crear[10];
     Usuario dar = new Usuario(textfield1.getText(), textfield2.getText(), textfield3.getText(), 
                    textfield4.getText(),combo1.getSelectedItem(), password1.getText(), password2.getText());
    
public static String[][] darusuario(){
            
         
        
        
        
 return ;       
}
     
}*/





   



}

 