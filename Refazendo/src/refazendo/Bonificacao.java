/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refazendo;

/**
 *
 * @author Aluno
 */
public enum Bonificacao {
    GEREMTE (0.15),
    DIRETOR (0.25);
    
    protected double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    
}
