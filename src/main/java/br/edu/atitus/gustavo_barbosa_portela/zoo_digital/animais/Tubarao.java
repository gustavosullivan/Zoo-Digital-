package br.edu.atitus.gustavo_barbosa_portela.zoo_digital.animais;

import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.Predador;

public class Tubarao extends Peixe implements Nadador, Predador {

    public Tubarao(String nome, int idade, String tipoAgua) {
        super(nome, idade, tipoAgua);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " não faz som, mas impõe respeito com sua presença silenciosa.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está devorando um peixe menor.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando velozmente pelo oceano.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando focas perto da superfície.");
    }
}

