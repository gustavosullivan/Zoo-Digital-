package br.edu.atitus.gustavo_barbosa_portela;

import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.animais.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            // Só um exemplo, se quiser mostrar o loop rodando
            System.out.println("Iteração número " + i);
        }

        Jacare j = new Jacare("Jacaré Açu", 12);
        Lagarto l = new Lagarto("Lagartinho", 3);
        Tartaruga t = new Tartaruga("Tartaruga Marinha", 80);
        Cobra c = new Cobra("Naja", 5);

        j.emitirSom();
        l.correr();
        t.nadar();
        c.cacar();
    }
}
