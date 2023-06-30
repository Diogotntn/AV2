/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refazendo;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String crea, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n crea:" + crea;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }
    
    
}
