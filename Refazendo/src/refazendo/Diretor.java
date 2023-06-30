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
public class Diretor extends CargoDeConfianca implements Contratacao {
    private double PREMIO = (0.3);

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n PREMIO:" + PREMIO * 100 + "%";
        
    }

    @Override
    public double getSalarioFinal() {
        return salario + (super.salario *super.bonificacao.DIRETOR.getValor() + (super.salario * PREMIO)); 
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("contratado" + funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir" + funcionario.nome);
        
    }
    
    
}
