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
public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n carteiraDeHabilitacao:" + carteiraDeHabilitacao ;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }
    
    
}
