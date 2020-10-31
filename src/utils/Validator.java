/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.List;

import model.*;

/**
 *
 * @author lps10
 */
public class Validator {

    public static boolean eUsuarioValido(List<Usuario> usuarios, String username, String password) {

        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                return usuario.getSenha().equals(password);
            }
        }

        return false;
    }

    public static Usuario configurarAcesso(Usuario usuario) throws CloneNotSupportedException {
        switch (usuario.getTipoAcesso()) {
            case ALUNO:
                return (Aluno) usuario.clone();
            case PROFESSOR:
                return (Professor) usuario.clone();
            default:
                return (Gestor) usuario.clone();
        }
    }

    public static boolean eGestor(Usuario usuario) {
        return usuario.getTipoAcesso().equals(Acesso.GESTOR);
    }

}
