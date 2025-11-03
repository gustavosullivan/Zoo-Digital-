package br.edu.atitus.gustavo_barbosa_portela.zoo_digital.animais;

import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.Voador;
import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.Predador;

public class Morcego extends Mamifero implements Voador, Predador {

    public Morcego(String nome, int idade, boolean temPelo) {
        super(nome, idade, temPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo sons de ecolocalização.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está se alimentando de frutas ou insetos.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando no escuro da caverna.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando insetos no ar.");
    }
}
