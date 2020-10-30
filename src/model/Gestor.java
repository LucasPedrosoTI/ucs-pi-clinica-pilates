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
public class Gestor extends Usuario {
    private String nome;

    
    public Gestor() {
    }
    
    public Gestor(String username, String senha, Acesso tipoAcesso) {
        super(username, senha, tipoAcesso);
    }

    public Gestor(String nome, String username, String senha, Acesso tipoAcesso) {
        super(username, senha, tipoAcesso);
        this.nome = nome;
    }
    
    

    @Override
    public String toString() {
        super.toString();
        return "Gestor{" + "nome=" + nome + '}';
    }

    
    
}
