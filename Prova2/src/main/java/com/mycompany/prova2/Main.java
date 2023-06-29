/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prova2;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Deivid", "123132132", "123132",
                new Endereco("Rua", "50", "casa", "123132", "salvador", UnidadeFederativa.BAHIA), Setor.OPERACOES, Genero.MASCULINO, 200, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 20));
        System.out.println("Diretor:");
        System.out.println(diretor);
        
        diretor.admitir(diretor);
        diretor.demitir(diretor);
        
        System.out.println("");
        
        Engenheiro engenheiro = new Engenheiro("123132132", "dalila", "2132132", "123132",
                new Endereco("alphaville", "44", "apartamento", "132123", "são paulo", UnidadeFederativa.SAO_PAULO), Setor.ENGENHARIA, Genero.FEMININO, 2000, EstadoCivil.DIVORCIADO, LocalDate.of(1990, Month.MARCH, 20));
        System.out.println("Engenheiro");
        System.out.println(engenheiro);
        System.out.println("");
        
        Motoboy motoboy = new Motoboy("132123", "ivanildo", "12313456465", "123132",
                new Endereco("rua", "24", "casa", "40436-440", "Rio de janeiro", UnidadeFederativa.RIO_DE_JANEIRO), Setor.OPERACOES, Genero.MASCULINO, 1200, EstadoCivil.CASADO, LocalDate.of(1985, Month.MARCH, 3));
        System.out.println("Motoboy:");
        System.out.println(motoboy);
        System.out.println("");
        
        
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "macita", "123132", "132132",
                new Endereco("Rua", "175", "apartamento", "4536-550", "salvador", UnidadeFederativa.BAHIA), Setor.MARKETING, Genero.MASCULINO, 2000, EstadoCivil.CASADO, LocalDate.of(2002, Month.JANUARY, 24));
        System.out.println("Gerente:");
        System.out.println(gerente);
    }
}
