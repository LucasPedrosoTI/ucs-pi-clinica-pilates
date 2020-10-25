package model;

import java.util.List;

public class Turma {

    private int turmaId;
    private List<Matricula> matriculas;
    private String horarioAula;
    private String duracaoAula;
    private String dataInicial;
    private String dataFinal;
    private Professor professor;

    private static int turmaCount;

    {
        turmaCount++;
    }

    
    public int getTotalAlunos() {
        return this.matriculas.size();
    }
    
    public static int getTotalTurmas() {
        return turmaCount;
    }

}
