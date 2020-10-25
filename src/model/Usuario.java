/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lps10
 */
public class Usuario {
    private String username, senha;
    private Acesso tipoAcesso;

    public Usuario() {
    }

    public Usuario(String username, String senha, Acesso tipoAcesso) {
        this.username = username;
        this.senha = senha;
        this.tipoAcesso = tipoAcesso;
    }

    
    
}
