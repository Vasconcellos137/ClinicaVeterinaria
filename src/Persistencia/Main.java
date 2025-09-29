package Persistencia;

import CadastroClinicaVeterinaria.Agendamento;
import CadastroClinicaVeterinaria.Funcionario;
import CadastroClinicaVeterinaria.Tutor;
import CadastroClinicaVeterinaria.Servico;
import CadastroClinicaVeterinaria.Pet;

import java.util.Scanner;

public class Main {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        Pet pet = new Pet();

        int op = 777;

        while (op != 0) {

            System.out.println("•·•Opções de cadastro•·•");
            System.out.println("Press 1 - Cadastro de Pet's");
            System.out.println("Press 2 - Cadastro de Tutor's");
            System.out.println("Press 3 - Cadastro de Funcionário's");
            System.out.println("Press 4 - Menu de Ofertas de Serviço.");
            System.out.println("Press 5 - Agendamento de serviço.");
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

                case 4:
                    System.out.println("•·•Menu - Ofertas de Serviço•·•");
                    System.out.println("Press 1 - Listar serviços ofertados.");
                    System.out.println("Press 2 - Realizar cadastro de serviço.");
                    System.out.println("Press 0 - Sair.");

                    OfertaServicos oferSer = new OfertaServicos();

                    int hah = LER.nextInt();
                    switch (hah) {
                        case 1:
                            oferSer.listar();
                            oferSer.pularLinha();
                            break;

                        case 2:
                            cadastrarOfertasServico(oferSer);

                        case 0:
                            break;

                        default:
                            System.out.println("Opção inválida..");
                            oferSer.pularLinha();
                            break;
                    }
                    break;

                case 5:
                    System.out.println("•·•Menu - Agendamento•·•");
                    System.out.println("1 - Cadastrar Agendamento");
                    System.out.println("2 - Listar Agendamentos");
                    System.out.println("3 - Remover Agendamento");
                    System.out.println("0 - Sair");

                    CadastroAgendamental cadasAgend = new CadastroAgendamental();

                    int booh = LER.nextInt();
                    switch (booh) {
                        case 1:
                            cadastrarAgendamento(cadasAgend);
                            cadasAgend.pularLinha();
                            break;
                        
                        case 2:
                            cadasAgend.listar();
                            cadasAgend.pularLinha();    
                            break;

                        case 3:
                        System.out.println("Indique a posição do cadastro no sistema:");
                        int pos = LER.nextInt();
    
                        cadasAgend.remover(pos);
                        cadasAgend.listar();
                        cadasAgend.pularLinha();
                        break;    

                        case 0:
                            break;

                        default:
                        System.out.println("Opção inválida..");
                        cadasAgend.pularLinha();
                        break;
                    }

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida colega...");
                    break;
            }

        }

    }

    public static void cadastrarOfertasServico(OfertaServicos oferServ) {
        int op = 4;

        while (op != 0) {
            System.out.println("•·•Opções de cadastro•·•");
            System.out.println("Press 1 - Cadastrar novo serviço.");
            System.out.println("Press 3 - Remover um cadastro.");
            System.out.println("Press 0 - Sair.");

            oferServ.pularLinha();

            int x = LER.nextInt();
            switch (x) {
                case 1:
                    oferServ.inserir();
                    oferServ.pularLinha();
                    break;

                case 3:
                    System.out.println("Indique a posição do cadastro no sistema:");
                    int pos = LER.nextInt();

                    oferServ.remover(pos);
                    oferServ.listar();
                    oferServ.pularLinha();
                    break;

                case 0:
                    oferServ.pularLinha();
                    break;

                default:
                    System.out.println("Opção inválida colega...");
                    oferServ.pularLinha();
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

    public static void cadastrarAgendamento(CadastroAgendamental cadasAgend) {
        System.out.println("Digite o índice do Cliente:");
        for (int i = 0; i < CadastroDeTutor.listTutors.size(); i++) {
            System.out.println(i + " - " + CadastroDeTutor.listTutors.get(i).getNome());
        }
        int idTutor = LER.nextInt();

        System.out.println("Digite o índice do Pet:");
        for(int i = 0; i < CadastroDePet.listPets.size(); i++){
            System.out.println(i + " - " + CadastroDePet.listPets.get(i).getNome());
        }
        int idPet = LER.nextInt();

        System.out.println("Digite o índice do Serviço:");
        for(int i = 0; i < OfertaServicos.listServ.size(); i++){
            System.out.println(i + " - " + OfertaServicos.listServ.get(i).getNome());
        }
        int idServ = LER.nextInt();

        System.out.println("Data:");
        String data = LER.next();

        System.out.println("Horário:");
        String horario = LER.next();

        Tutor tutor = CadastroDeTutor.listTutors.get(idTutor);
        Pet pet = CadastroDePet.listPets.get(idPet);
        Servico servico = OfertaServicos.listServ.get(idServ);

        Agendamento novo = new Agendamento(tutor, pet, servico, data, horario);
        cadasAgend.inserir(novo);
        System.out.println("Agendamento cadastrado com sucesso!");
    }
}
