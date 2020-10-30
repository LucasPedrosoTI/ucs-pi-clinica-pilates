/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.List;
import model.Usuario;

/**
 *
 * @author lps10
 */
public class Validator {

    public static boolean eUsuarioValido(List<Usuario> usuarios, String username, String password) {
        
        boolean eValido = false;
        
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                if(usuario.getSenha().equals(password)){
                    eValido = true;
                    return eValido;
                }
            }
        }

        return eValido;
    }

}
