package br.edu.atitus.gustavo_barbosa_portela.zoo_digital.animais;

import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.Nadador;

public class Sardinha extends Peixe implements Nadador {

    public Sardinha(String nome, int idade, String tipoAgua) {
        super(nome, idade, tipoAgua);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz pequenas bolhas na água.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo plâncton.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em um grande cardume.");
    }
}
