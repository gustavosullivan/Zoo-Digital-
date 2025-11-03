package br.edu.atitus.gustavo_barbosa_portela.zoo_digital.animais;

import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.Voador;
import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.Predador;

public class Aguia extends Ave implements Voador, Predador {

    public Aguia(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está soltando um grito agudo!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo um pequeno roedor.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando alto em círculos no céu.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando um coelho na montanha.");
    }
}
