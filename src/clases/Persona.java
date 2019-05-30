package clases;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Persona es una clase, que describe los datos basicos de un usuario, los cuales
 son nombre de usuario, número de teléfono y contraseña
 * @author Carlos Daniel Martinez Durán
 */
public class Persona implements Serializable{
    /**usuario es un String, que guarda el nombre de usuario*/
    private String usuario;
    /**numTelefono es un double que guarda el número de teléfono del usuario*/
    private double numTelefono;
    /**contraseña es un String que guarda la contraseña del ususario*/
    private String contraseña;
    private String nombre;
    private String sexo;
    private String cumpleaños;
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(double numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }
    
    
    
}
