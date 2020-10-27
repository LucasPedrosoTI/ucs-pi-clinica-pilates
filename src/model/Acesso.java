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
public enum Acesso {

    GESTOR("Gestor"),
    PROFESSOR("Professor"),
    ALUNO("Aluno");

    private String descricao;

    Acesso(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
