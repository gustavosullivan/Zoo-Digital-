package br.edu.atitus.gustavo_barbosa_portela.zoo_digital.animais;

import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.Nadador;

public class Tartaruga extends Reptil implements Nadador {

    public Tartaruga(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo um som leve de respiração.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo algas marinhas.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando calmamente no oceano.");
    }
}

