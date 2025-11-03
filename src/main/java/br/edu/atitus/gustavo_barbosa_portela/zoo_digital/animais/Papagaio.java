package br.edu.atitus.gustavo_barbosa_portela.zoo_digital.animais;

import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.Voador;

public class Papagaio extends Ave implements Voador {

    public Papagaio(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está repetindo palavras engraçadas!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sementes e frutas.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando pelo viveiro colorido.");
    }

    public void cacar() {
        System.out.println(getNome() + " está brincando de caçar sementes no chão.");
    }
}
