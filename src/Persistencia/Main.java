package Persistencia;

import CadastroClinicaVeterinaria.*;
import java.util.Scanner;

public class Main {

    final static Scanner LER = new Scanner(System.in);
  public static void main(String[] args) {
    Pet pet = new Pet();

    CadastroDePet cadastroDePet = new CadastroDePet();

    pet.setNome("Lua");
    pet.setIdade(1);
    pet.setRaca("pincher");
    pet.setNivelCuidado("Baixo");

    int x = 123;
    while (x != 0) {

        System.out.println("·•·Opções·•·");
        System.out.println("Press 1 - Cadastrar novo pet.");
        System.out.println("Press 3 - Remover cadastro.");
        System.out.println("Press 7 - Listar informações do pet.");
        System.out.println("Press 9 - Alterar alguma informação.");
        System.out.println("Press 0 - Sair.");

        x = LER.nextInt();
        switch (x) {
            case 1:
            System.out.println("•Inicio de Cadastro•");

            System.out.println("Nome:");
            String nome = LER.next();
            pet.setNome(nome);
        
            // System.out.println("Id:");
            // String id = LER.next();     //Como criar IDs diretamente ou manualmente ? Pq mandar a
            // pet.setId(id);              //pessoa digitar não é uma boa, como vai saber em que posicao esta ?
        
            System.out.println("Raça:");
            String r = LER.next();
            pet.setRaca(r);
        
            System.out.println("Idade:");
            String i = LER.next();
            pet.setIdade(i);
        
            System.out.println("Nível de cuidado:");
            String n = LER.next();
            pet.setNivelCuidado(n);
                break;

            case 3:
            int pos = LER.nextInt();
            cadastroDePet.remover(pet, pet, pos);
                break;

            case 7:
            cadastroDePet.listar();
                break;

            case 9:
            int op = LER.nextInt();
            cadastroDePet.alterar(pet, op);
                break;

            case 0:
                break;

            default:
                System.out.println("Opção inválida colega...");
                break;
        }
    }
  }
    

}
