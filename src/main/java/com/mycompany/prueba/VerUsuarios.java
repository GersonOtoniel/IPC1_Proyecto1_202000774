/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.lang.String;        
       
/**
 *
 * @author Gerson
 */
public class VerUsuarios {

   
    JTable tbLecturas;
    String[][] datos;
    String[] cabezera;
    
     public VerUsuarios(String[][] datos, String[] cabezera){  
     
     //this.datos = datos;
     //this.cabezera = cabezera;
    
         dardatos();
         definircompo();
     
           
   
     //mod.addColumn("ID");
      //Crear.setModel(mod); 
    
    DefaultTableModel mod = new DefaultTableModel(datos,cabezera);
    
    
    
    
    
    JTable tabla = new JTable(mod);
    JScrollPane scroll = new  JScrollPane(tabla);
    scroll.setBounds(40,40,600,200);
    
    JFrame ventana = new JFrame();
    ventana.setLayout(null);
    ventana.setSize(700,400);
    ventana.setLocationRelativeTo(null);
    ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    ventana.add(scroll);
    ventana.setVisible(true);
    
}
  void setVisible(boolean b) {
        
    }

   public void definircompo(){
   setTitle("Tabla de Comics");
    setSize(800,400);
    setLayout(null);
    setLocationRelativeTo(this);
   }
  
    public void dardatos(){
    // tbLecturas = new JTable(datos,cabezera);   
    }

    private void setTitle(String tabla_de_Comics) {
        
    }

    private void setLayout(Object object) {
       
    }

    private void setSize(int i, int i0) {
        
    }

    private void setLocationRelativeTo(VerUsuarios aThis) {
        
    }

    
  
   

}