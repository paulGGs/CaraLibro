/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibromain;

/**
 *
 * @author a22paultr
 */
public class Perfil {

    String nome;
    String contrasinal;
    String estado = "En línea";

    public Perfil(String nome, String contrasinal) {
        this.nome = nome;
        this.contrasinal = contrasinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContrasinal() {
        return contrasinal;
    }

    public void setContrasinal(String contrasinal) {
        this.contrasinal = contrasinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

    public void engadirAmigo(Perfil profile) {

    }

    public void engadirPublicacion(Publicacion post) {

    }

    public void engadirSolicitudeDeAmizade(Perfil perfilSolicitante) {

    }

    public void aceptarSolicitudeDeAmizade(Perfil perfilSolicitante) {

    }

    public void rexeitarSolicitudeDeAmizade(Perfil perfilSolicitante) {

    }

    public void engadirMensaxePrivada(Mensaxe message) {

    }
    
    public void eliminarMensaxePrivada(Mensaxe message) {

    }
}
