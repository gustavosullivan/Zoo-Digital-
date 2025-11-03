package br.edu.atitus.gustavo_barbosa_portela.zoo_digital.animais;

import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.Corredor;

public class Lagarto extends Reptil implements Corredor {

    public Lagarto(String nome, int idade) {
        super(nome, idade, true);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo um som baixo de assobio.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo insetos.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo entre as pedras.");
    }
}
