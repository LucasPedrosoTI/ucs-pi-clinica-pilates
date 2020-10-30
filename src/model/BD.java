/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author lps10
 */
public class BD {

    public static List<Usuario> usuarios = new ArrayList<>();
    public static List<Turma> turmas = new ArrayList<>();
    ;
    public static List<Atividade> atividades = new ArrayList<>();
    public static Gestor gestor = new Gestor("gestor", "gestor", "gestor", Acesso.GESTOR);
    public static Usuario usuarioLogado;

    public static void generateBd() {
        usuarios.add(new Gestor("gestor", "gestor", Acesso.GESTOR));
        usuarios.add(new Aluno("aluno", "aluno", Acesso.ALUNO));
        usuarios.add(new Professor("prof", "prof", Acesso.PROFESSOR));
    }

    public static Usuario getUsuarioByUsername(String username) {

        return usuarios.stream().filter(usuario -> usuario.getUsername().equals(username)).collect(Collectors.toList()).get(0);
    }


    public static Usuario getUsuarioLogado() {

        return usuarioLogado;

    }

    public static void setUsuarioLogado(Usuario usuarioLogado) {
        
         if (usuarioLogado.getTipoAcesso().equals(Acesso.ALUNO)) {
            // BD.usuarioLogado = new Aluno(usarioLogado); // copiar dados do usuário logado para o novo objeto Aluno
        } else if (usuarioLogado.getTipoAcesso().equals(Acesso.PROFESSOR)) {
            //BD.usuarioLogado = new Professo(usarioLogado)
        } else {
            //BD.usuarioLogado = new Gestor(usarioLogado)
        }

    }

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(List<Usuario> usuarios) {
        BD.usuarios = usuarios;
    }

    public static List<Turma> getTurmas() {
        return turmas;
    }

    public static void setTurmas(List<Turma> turmas) {
        BD.turmas = turmas;
    }

    public static List<Atividade> getAtividades() {
        return atividades;
    }

    public static void setAtividades(List<Atividade> atividades) {
        BD.atividades = atividades;
    }

    public static Gestor getGestor() {
        return gestor;
    }

    public static void setGestor(Gestor gestor) {
        BD.gestor = gestor;
    }

}
