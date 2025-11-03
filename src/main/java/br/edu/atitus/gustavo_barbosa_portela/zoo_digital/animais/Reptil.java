package br.edu.atitus.gustavo_barbosa_portela.zoo_digital.animais;

public abstract class Reptil extends Animal {

    private boolean temEscamas;

    public Reptil(String nome, int idade, boolean temEscamas) {
        super(nome, "Réptil", idade);
        this.temEscamas = temEscamas;
    }

    public boolean isTemEscamas() {
        return temEscamas;
    }

    public void setTemEscamas(boolean temEscamas) {
        this.temEscamas = temEscamas;
    }

    public void trocarDePele() {
        System.out.println(getNome() + " está trocando de pele.");
    }
}


