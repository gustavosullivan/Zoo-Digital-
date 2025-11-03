package br.edu.atitus.gustavo_barbosa_portela.zoo_digital.app;

import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.animais.*;
import br.edu.atitus.gustavo_barbosa_portela.zoo_digital.comportamentos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> animais = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n===  Zoo Digital ===");
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Listar Todos os Animais");
            System.out.println("3. Listar Animais Corredores");
            System.out.println("4. Listar Animais Nadadores");
            System.out.println("5. Listar Animais Voadores");
            System.out.println("6. Listar Animais Predadores");
            System.out.println("7. Exibir Total de Animais");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Cadastrar Animal ===");
                    System.out.print("Informe o tipo (leao, morcego, pato, sardinha, tubarao, traira, tartaruga,pinguin, peixe morcego\n, papagaio, largarto, jacare, golfinho, cobra, cachorro ): ");
                    String tipo = sc.nextLine().toLowerCase();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    Animal novoAnimal = null;

                    switch (tipo) {
                        case "leao":
                            System.out.print("Tem pelo? (true/false): ");
                            boolean temPelo = sc.nextBoolean();
                            novoAnimal = new Leao(nome, idade, temPelo);
                            break;
                        case "morcego":
                            System.out.print("Tem pelo? (true/false): ");
                            temPelo = sc.nextBoolean();
                            novoAnimal = new Morcego(nome, idade, temPelo);
                            break;
                        case "pato":
                            System.out.print("Cor das penas: ");
                            String corPenas = sc.nextLine();
                            novoAnimal = new Pato(nome, idade, corPenas);
                            break;
                        case "sardinha":
                            System.out.print("Tipo de água doce/salgada: ");
                            String tipoAgua = sc.nextLine();
                            novoAnimal = new Sardinha(nome, idade, tipoAgua);
                            break;
                        default:
                            System.out.println("Tipo de animal não reconhecido");
                            break;
                    }

                    if (novoAnimal != null) {
                        animais.add(novoAnimal);
                        System.out.println("Animal cadastrado com sucesso");
                    }
                    break;

                case 2:
                    System.out.println("\n=== Lista de Todos os Animais ===");
                    for (Animal a : animais) {
                        System.out.println(a.getNome() + " | " + a.getEspecie() + " | " + a.getIdade() + " anos");
                        a.emitirSom();
                        a.comer();
                    }
                    break;

                case 3:
                    System.out.println("\n=== Animais Corredores ===");
                    for (Animal a : animais) {
                        if (a instanceof Corredor) {
                            Corredor c = (Corredor) a;
                            System.out.println(a.getNome() + " é corredor.");
                            c.correr();
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n=== Animais Nadadores ===");
                    for (Animal a : animais) {
                        if (a instanceof Nadador) {
                            Nadador n = (Nadador) a;
                            System.out.println(a.getNome() + " é nadador.");
                            n.nadar();
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n=== Animais Voadores ===");
                    for (Animal a : animais) {
                        if (a instanceof Voador) {
                            Voador v = (Voador) a;
                            System.out.println(a.getNome() + " é voador.");
                            v.voar();
                        }
                    }
                    break;

                case 6:
                    System.out.println("\n=== Animais Predadores ===");
                    for (Animal a : animais) {
                        if (a instanceof Predador) {
                            Predador p = (Predador) a;
                            System.out.println(a.getNome() + " é predador.");
                            p.cacar();
                        }
                    }
                    break;

                case 7:
                    System.out.println("\n=== Total de Animais Cadastrados ===");
                    System.out.println("Total: " + Animal.getContador());
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
