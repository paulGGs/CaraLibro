/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibromain;

import java.util.ArrayList;

/**
 *
 * @author a22paultr
 */
public final class CaraLibroBD {

    private static ArrayList<Perfil> perfiles = new ArrayList<>();

    public CaraLibroBD() {

    }

    public static ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }

    public static void setPerfiles(ArrayList<Perfil> perfiles) {
        CaraLibroBD.perfiles = perfiles;
    }

    public static Perfil obterPerfil(String nome, String contrasinal) {
        Perfil perfilInicioSesion = new Perfil(nome, contrasinal);
        boolean existe = false;

        for (int i = 0; i < perfiles.size(); i++) {
            if (perfilInicioSesion.getNome().equals(perfiles.get(i).getNome())
                    && perfilInicioSesion.getContrasinal().equals(perfiles.get(i).contrasinal)) {
                existe = true;
            }
        }
        if (existe == false) {
            System.out.println("\nNo existe este nombre de usuario o la contraseña es incorrecta\n");
            perfilInicioSesion.setNome("");
            perfilInicioSesion.setContrasinal("");
        }
        return perfilInicioSesion;
    }

    public static Perfil buscarPerfil(String nome) {
        String contrasinal = "";
        String nomeUsuario = "";
        Perfil perfilInicioSesion = new Perfil(nome, contrasinal);
        Perfil perfilNoExistente = new Perfil(nome, contrasinal);
        boolean existe = false;

        for (int i = 0; i < perfiles.size(); i++) {
            if (perfilInicioSesion.getNome().equals(perfiles.get(i).getNome())) {
                existe = true;
            }
        }
        if (existe == false) {
            System.out.println("No existe este nombre de usuario");
        }
        return perfilInicioSesion;
    }

    public static void engadirPerfil(Perfil novoPerfil) {
        perfiles.add(novoPerfil);
    }
}
