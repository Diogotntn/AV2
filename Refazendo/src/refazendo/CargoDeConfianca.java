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
public abstract class CargoDeConfianca extends Funcionario{
    protected Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n bonificacao:" + bonificacao;
        
    }
    
    
}
