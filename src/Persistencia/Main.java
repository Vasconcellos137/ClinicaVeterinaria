package Persistencia;

import CadastroClinicaVeterinaria.Pet;
import java.util.Scanner;

public class Main {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        Pet pet = new Pet();

        int op = LER.nextInt();

        while (op != 0) {

            System.out.println("•·•Opções de cadastro•·•");
            System.out.println("Press 1 - Cadastro de Pet's");
            System.out.println("Press 2 - Cadastro de Tutor's");
            System.out.println("Press 3 - Cadastro de Funcionário's");
            System.out.println("Press 0 - Sair");

            int escolha = LER.nextInt();

            switch (escolha) {
                case 1:
                    CadastroDePet cadastroDePet = new CadastroDePet();
                    cadastrarPet(cadastroDePet);
                    break;

                case 2:
                    CadastroDeTutor cadastroDeTutor = new CadastroDeTutor();
                    cadastrarTutor(cadastroDeTutor);
                    break;

                case 3:
                    CadastroDeFuncionario cadastroDeFuncionario = new CadastroDeFuncionario();
                    cadastrarFuncio(cadastroDeFuncionario);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida colega...");
                    break;
            }

        }

    }

    public static void cadastrarPet(CadastroDePet cadastroDePet) {
        int op = 1;

        while (op != 0) {
            System.out.println("•·•Opções de cadastro•·•");
            System.out.println("Press 1 - Cadastrar Pet.");
            System.out.println("Press 3 - Remover um cadastro.");
            System.out.println("Press 7 - Listar as informações.");
            System.out.println("Press 0 - Sair.");

            cadastroDePet.pularLinha();

            int x = LER.nextInt();
            switch (x) {
                case 1:
                    cadastroDePet.inserir();
                    cadastroDePet.pularLinha();
                    break;

                case 3:
                    System.out.println("Indique a posição do cadastro no sistema:");
                    int pos = LER.nextInt();

                    cadastroDePet.remover(pos);
                    cadastroDePet.listar();
                    cadastroDePet.pularLinha();
                    break;

                case 7:
                    cadastroDePet.listar();
                    cadastroDePet.pularLinha();
                    break;

                case 0:
                    cadastroDePet.pularLinha();
                    break;

                default:
                    System.out.println("Opção inválida colega...");
                    cadastroDePet.pularLinha();
                    break;
            }

        }

    }

    public static void cadastrarTutor(CadastroDeTutor cadastroDeTutor) {
        int op = 2;

        while (op != 0) {
            System.out.println("•·•Opções de cadastro•·•");
            System.out.println("Press 1 - Cadastrar Tutor.");
            System.out.println("Press 3 - Remover um cadastro.");
            System.out.println("Press 7 - Listar as informações.");
            System.out.println("Press 0 - Sair.");

            cadastroDeTutor.pularLinha();

            int x = LER.nextInt();
            switch (x) {
                case 1:
                    cadastroDeTutor.inserir();
                    cadastroDeTutor.pularLinha();
                    break;

                case 3:
                    System.out.println("Indique a posição do cadastro no sistema:");
                    int pos = LER.nextInt();

                    cadastroDeTutor.remover(pos);
                    cadastroDeTutor.listar();
                    cadastroDeTutor.pularLinha();
                    break;

                case 7:
                    cadastroDeTutor.listar();
                    cadastroDeTutor.pularLinha();
                    break;

                case 0:
                    cadastroDeTutor.pularLinha();
                    break;

                default:
                    System.out.println("Opção inválida colega...");
                    cadastroDeTutor.pularLinha();
                    break;
            }

        }
    }

    public static void cadastrarFuncio(CadastroDeFuncionario cadastroDeFuncionario) {
        int op = 3;

        while (op != 0) {
            System.out.println("•·•Opções de cadastro•·•");
            System.out.println("Press 1 - Cadastrar Funcionário.");
            System.out.println("Press 3 - Remover um cadastro.");
            System.out.println("Press 7 - Listar as informações.");
            System.out.println("Press 0 - Sair.");

            cadastroDeFuncionario.pularLinha();

            int x = LER.nextInt();
            switch (x) {
                case 1:
                    cadastroDeFuncionario.inserir();
                    cadastroDeFuncionario.pularLinha();
                    break;

                case 3:
                    System.out.println("Indique a posição do cadastro no sistema:");
                    int pos = LER.nextInt();

                    cadastroDeFuncionario.remover(pos);
                    cadastroDeFuncionario.listar();
                    cadastroDeFuncionario.pularLinha();
                    break;

                case 7:
                    cadastroDeFuncionario.listar();
                    cadastroDeFuncionario.pularLinha();
                    break;

                case 0:
                    cadastroDeFuncionario.pularLinha();
                    break;

                default:
                    System.out.println("Opção inválida colega...");
                    cadastroDeFuncionario.pularLinha();
                    break;
            }

        }
    }

}
