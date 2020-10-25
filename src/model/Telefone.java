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
public class Telefone {
    private int telefoneId;
    private String numero;

    public Telefone() {
    }

    public Telefone(int telefoneId, String numero) {
        this.telefoneId = telefoneId;
        this.numero = numero;
    }

    public int getTelefoneId() {
        return telefoneId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
    
}
