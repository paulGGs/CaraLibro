/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibromain;

import java.time.LocalDateTime;

/**
 *
 * @author a22paultr
 */
public class Publicacion {
    LocalDateTime data;
    String texto;

    public Publicacion(Perfil autor, String texto) {
        
    }
    
    public LocalDateTime getData() {
        return data;
    }

    public String getTexto() {
        return texto;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    public void publicacion(Perfil autor, String texto){
        /*if(autor.getNome()){
            System.out.println("Ti escribiches:");
            System.out.println(texto);
            System.out.println("Publicado: " + data);
        }
        else{
            System.out.println(autor + " escribiu:");
            System.out.println(texto);
            System.out.println("Publicado: " + data);
        }*/
    }
    public void engadirMeGusta(Perfil profile){
        
    }
    public void engadirComentario(Comentario c){
        
    }
}

