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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Acesso getTipoAcesso() {
        return tipoAcesso;
    }

    public void setTipoAcesso(Acesso tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }

}
