package br.edu.atitus.gustavo_barbosa_portela.zoo_digital.animais;

import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.Predador;

public class Cobra extends Reptil implements Predador {

    public Cobra(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando: ssssss...");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está engolindo sua presa inteira!");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando um pequeno roedor.");
    }
}
