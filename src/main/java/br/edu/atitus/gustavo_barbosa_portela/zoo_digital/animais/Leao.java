package br.edu.atitus.gustavo_barbosa_portela.zoo_digital.animais;

import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.Predador;

public class Leao extends Mamifero implements Corredor, Predador {

    public Leao(String nome, int idade, boolean temPelo) {
        super(nome, idade, temPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo alto!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo carne fresca.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo pela savana.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando uma zebra.");
    }
}
