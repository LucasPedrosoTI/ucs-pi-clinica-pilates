/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.naming.directory.InvalidAttributeValueException;

import utils.Validator;

/**
 *
 * @author lps10
 */
public class BD {

    public static List<Usuario> usuarios = new ArrayList<>();
    public static List<Turma> turmas = new ArrayList<>();
    public static List<Atividade> atividades = new ArrayList<>();
    public static List<Matricula> matriculas = new ArrayList<>();
    public static Gestor gestor = new Gestor("gestor", "gestor", Acesso.GESTOR);
    public static Usuario usuarioLogado;

    public static void generateBd() throws InvalidAttributeValueException {
        Aluno aluno = new Aluno("30/10/2020", "Lucas", "Rua X", "14/05/1994", new Telefone("11912345678"), "75", "1.75",
                "aluno", Acesso.ALUNO);

        Professor prof = new Professor("prof", "123456", "14/10/1990", "Zumba", new ArrayList<>(), turmas, "prof",
                Acesso.PROFESSOR);

        Gestor gestor = new Gestor("Gestor", "gestor", Acesso.GESTOR);

        usuarios.add(gestor);
        usuarios.add(aluno);
        usuarios.add(prof);

        matriculas.add(new Matricula("30/10/2020", aluno, 0));

        turmas.add(new Turma(matriculas, "10:00", "60", "30/10/2020", "30/11/2020", prof));

        atividades.add(new Atividade("zumba", "aula de zumba", turmas));
    }

    public static Usuario getUsuarioByUsername(String username) {

        return usuarios.stream().filter(usuario -> usuario.getUsername().equals(username)).collect(Collectors.toList())
                .get(0);
    }

    public static Usuario getAlunoByCodigoMatricula(String codigoMatricula) {
        return usuarios.stream().filter(usuario -> {
            Aluno aluno = new Aluno();
            try {
                if (usuario.getTipoAcesso().equals(Acesso.ALUNO)) {
                    aluno = (Aluno) usuario.clone();
                    return aluno.getCodigoMatricula().equals(Long.valueOf(codigoMatricula));
                } else {
                    return false;
                }
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return false;
            }

        }).collect(Collectors.toList()).get(0);
    }

    public static Usuario getUsuarioLogado() {

        return usuarioLogado;

    }

    public static void setUsuarioLogado(Usuario usuarioLogado) throws CloneNotSupportedException {

        BD.usuarioLogado = Validator.configurarAcesso(usuarioLogado);

        // if (usuarioLogado.getTipoAcesso().equals(Acesso.ALUNO)) {
        // Aluno aluno = (Aluno) usuarioLogado;
        // BD.usuarioLogado = aluno;
        // } else if (usuarioLogado.getTipoAcesso().equals(Acesso.PROFESSOR)) {
        // Professor prof = (Professor) usuarioLogado;
        // BD.usuarioLogado = prof;
        // } else {
        // Gestor gestor = (Gestor) usuarioLogado;
        // BD.usuarioLogado = gestor;
        // }

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
