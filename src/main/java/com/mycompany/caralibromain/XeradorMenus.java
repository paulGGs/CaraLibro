/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibromain;

import java.util.Scanner;

/**
 *
 * @author a22paultr
 */
public final class XeradorMenus {

    public void mostrarMenuInicial() {
        Scanner leer = new Scanner(System.in);
        String respuesta;

        cleanScreen();
        System.out.println("INICIAR SESIÓN (pulse 1)");
        System.out.println("CREAR NUEVO PERFIL (pulse 2)");
        respuesta = leer.nextLine();
        cleanScreen();

        if ("1".equals(respuesta)) {
            iniciarSesion();
        }
        if ("2".equals(respuesta)) {
            crearPerfil();
            iniciarSesion();
        } else {
            System.out.println("");
        }
    }

    public void mostrarMenuPrincipal(Perfil profile) {
        Scanner leer = new Scanner(System.in);
        String respuesta;

        do {
            cleanScreen();
            System.out.println("Mostrar/Cambiar Estado (pulse 1)");
            System.out.println("Mostrar Tu Biografía (pulse 2)");
            System.out.println("Pechar Sesión (pulse 3)");
            respuesta = leer.nextLine();
            cleanScreen();

            if ("1".equals(respuesta)) {
                cambiarEstado(profile);
            }
            if ("2".equals(respuesta)) {
                mostrarBiografia(profile);
            }
            if ("3".equals(respuesta)) {
                pecharSesion();
            }
        } while ("1".equals(respuesta));
    }

    public void mostrarBiografia(Perfil profile) {
        cleanScreen();
        
        System.out.println(profile.getNome().toUpperCase() + " BIO");
        System.out.println("Estado actual: " + profile.getEstado() + "\n");
        System.out.println();

    }

    public void mostrarSolicitudesDeAmizade(Perfil profile) {

    }

    public void mostrarListaAmigos(Perfil profile) {

    }

    public void mostrarMensaxes(Perfil profile) {

    }

    public void pecharSesion() {
        cleanScreen();
        mostrarMenuInicial();
    }

    private void crearPerfil() {
        Scanner leer = new Scanner(System.in);
        String nome;
        String contrasinal;

        cleanScreen();
        System.out.println("NUEVO PERFIL");
        System.out.println("------------------------------------------------");
        System.out.print("Introduce un nombre de usuario: ");
        nome = leer.nextLine();
        System.out.print("Introduce una constraseña: ");
        contrasinal = leer.nextLine();

        Perfil profile = new Perfil(nome, contrasinal);

        CaraLibroBD.engadirPerfil(profile);
    }

    private void iniciarSesion() {
        Scanner leer = new Scanner(System.in);
        String nome;
        String contrasinal;
        boolean inicioExitoso;
        
        cleanScreen();
        do {
            inicioExitoso = false;

            System.out.println("INICIO DE SESIÓN");
            System.out.println("------------------------------------------------");
            System.out.print("Nombre de usuario: ");
            nome = leer.nextLine();
            System.out.print("Constraseña: ");
            contrasinal = leer.nextLine();
            
            if (!"".equals(CaraLibroBD.obterPerfil(nome, contrasinal).getNome())
                    && !"".equals(CaraLibroBD.obterPerfil(nome, contrasinal).getContrasinal())) {
                inicioExitoso = true;
                mostrarMenuPrincipal(CaraLibroBD.obterPerfil(nome, contrasinal));
            }
        } while (inicioExitoso == false);

    }

    private void cambiarEstado(Perfil profile) {
        Scanner leer = new Scanner(System.in);
        String estado;

        cleanScreen();
        System.out.println("Estado actual: " + profile.getEstado() + "\n");
        System.out.print("Introduzca su nuevo estado: ");
        estado = leer.nextLine();
        profile.setEstado(estado);
    }

    private void escribirComentario(Publicacion post, Perfil profile) {

    }

    private void facerMeGusta(Publicacion post) {

    }

    private void escribirMensaxe(Perfil remitente, Perfil destinatario) {

    }

    private void marcarMensaxeComoLida(Mensaxe message) {

    }

    private void eliminarMensaxe(Perfil profile, Mensaxe message) {

    }

    public void cleanScreen() {
        for (int i = 0; i < 20; i++) {
            System.out.println("");
        }
    }
}
