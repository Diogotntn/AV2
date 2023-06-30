package refazendo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public enum Setor {
    ENGENHARIA ("Egenharia"),
    SAUDE ("Saúde"),
    ENGENHEIRO ("Engenheiro"),
    RECURSOS_HUMANOS ("Recursos Humanos"),
    MARKETING ("Marketing"),
    OPERACOES ("Operações");
    
    protected final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
