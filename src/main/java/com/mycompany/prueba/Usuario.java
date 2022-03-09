/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

import javax.swing.JFrame;

/**
 *
 * @author Gerson
 */
public class Usuario {

    
    
    private String ID;
    private String Nombre;
    private String Apellido;
    private String Usuario;
    private String Rol;
    private String Contrasena;
    private String Confirmar_Contrasena;
    
    Usuario (String id, String nombre, String apellido, String usuario, Object rol, String contrasena, String conficontra){
        ID =  id;
        Nombre = nombre;
        Apellido = apellido;
        Usuario = usuario;
        Rol = (String)  rol;
        Contrasena = contrasena;
        Confirmar_Contrasena = conficontra;
    }
    
    
    public String getid(){
    return ID;
    }
    
    public void setid(String id){
    ID=id;
    }
    
    
    public String getnom(){
    return Nombre;
    }
    
    public void setnom(String nombre){
    Nombre=nombre;
    }
    
    
    public String getape(){
    return Apellido;
    }
    
    public void setape(String apellido){
    Apellido=apellido;
    }
    
    public String getus(){
    return Usuario;
    }
    
    public void setus(String usuario){
    Usuario=usuario;
    }
  public String getrol(){
    return Rol;
    }
    
    public void setrol(String rol){
    Rol = rol;
    }
    
    public String getcontra(){
    return Contrasena;
    }
    
    public void setcontra(String contrasena){
    Contrasena = contrasena;
    }
    
    public String getconfi(){
    return Confirmar_Contrasena;
    }
    
    public void setconfi(String conficontra){
    Confirmar_Contrasena = conficontra;
    }
    
    
    public String toString(){
    return ID + "" + Nombre + "" + Apellido + "" + Usuario + "" + Rol + "" + Contrasena + "" + Confirmar_Contrasena;
    }

   
    
}


