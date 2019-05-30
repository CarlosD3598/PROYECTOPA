/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Carlos
 */
public class Usuario extends Persona{
    private Amigo amigito;

    public Amigo getAmigito() {
        return amigito;
    }

    public void setAmigito(Amigo amigito) {
        this.amigito = amigito;
    }
}
