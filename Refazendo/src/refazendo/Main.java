/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refazendo;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Motoboy motoboy = new Motoboy("carteiraDeHabilitacao", "motoboy", "cpf", "rg", 
                new Endereco("logradouro", "numero", "complemento", "cep", "cidade", UnidadeFederativa.BAHIA), Setor.SAUDE, Genero.FEMININO, 1200, EstadoCivil.CASADO, LocalDate.of(2004, Month.MARCH, 24));
        
        
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "nome", "cpf", "rg",
                new Endereco("logradouro", "numero", "complemento", "cep", "cidade", UnidadeFederativa.BAHIA), Setor.OPERACOES, Genero.FEMININO, 200, EstadoCivil.CASADO, LocalDate.of(1980, Month.MARCH, 5));
        System.out.println(diretor);
        diretor.demitir(motoboy);
    }
    
}
