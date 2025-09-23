package Persistencia;

import CadastroClinicaVeterinaria.*;
import java.util.Scanner;

public class Main {

    final static Scanner LER = new Scanner(System.in);
  public static void main(String[] args) {
    Pet pet;

    CadastroDePet cadastroDePet = new CadastroDePet();

  /*pet.setNome("Lua");
    pet.setIdade(1);
    pet.setRaca("pincher");
    pet.setNivelCuidado("Baixo");*/

    int x = 123;
    while (x != 0) {

        System.out.println("·•·Opções·•·");
        System.out.println("Press 1 - Cadastrar novo pet.");
        System.out.println("Press 3 - Remover cadastro.");
        System.out.println("Press 7 - Listar informações do pet.");
        // System.out.println("Press 9 - Alterar alguma informação.");
        System.out.println("Press 0 - Sair.");

        x = LER.nextInt();
        switch (x) {
            case 1:
            System.out.println("•Inicio de Cadastro•");
            pet  = new Pet();
            System.out.println("Nome:");
            String nome = LER.nextLine();

            pet.setNome(nome);
        
            System.out.println("Id:");
            String id = LER.next();     
            pet.setId(id);             
        
            System.out.println("Raça:");
            String r = LER.nextLine();
            pet.setRaca(r);
        
            System.out.println("Idade:");
            int i = LER.nextInt();
            pet.setIdade(i);
        
            System.out.println("Nível de cuidado:");
            String n = LER.next();
            pet.setNivelCuidado(n);

            cadastroDePet.inserir(pet);
            System.out.println("Cadastro realizado com sucesso!");
                break;

            case 3:
            System.out.println("Indique a posição do cadastro no sistema:");
            int pos = LER.nextInt();
            // cadastroDePet.remover(pet, pos);
            System.out.println("Remoção realizado com sucesso!");
            cadastroDePet.listar();
                break;

            case 7:
            cadastroDePet.listar();
                break;

            // case 9: //ERRO
            // System.out.println("•·•Opções para alteração•·•");
            // System.out.println("1 - Nome");
            // System.out.println("2 - Idade");
            // System.out.println("3 - Raça");
            // System.out.println("4 - Nível de Cuidado");

            // int op = LER.nextInt();
            // cadastroDePet.alterar(pet, op);
            // System.out.println("Alteração realizado com sucesso!");
            //     break;

            case 0:
                break;

            default:
                System.out.println("Opção inválida colega...");
                break;
        }
    }
  }
    

}
