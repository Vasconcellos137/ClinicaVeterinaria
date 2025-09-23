package Persistencia;

import CadastroClinicaVeterinaria.Pet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDePet {

    final static Scanner LER = new Scanner (System.in);

    static List<Pet> listPets = new ArrayList();
   
    public CadastroDePet() {
        
    }

//Método p inserir
    public void inserir(Pet pet){
        listPets.add(pet);
    }

//Método p remover
    public void remover(Pet pet, int pos){
        listPets.remove(pet); 
    }

//Método p listar/mostrar as informação do pet
    public void listar(){

        if (listPets == null || listPets.isEmpty()) {
            System.out.println("Nenhum pet cadastrado.");
            return;
        }

        for (Pet pet : listPets) {
            System.out.println("•·•·• Informações do Pet •·•·•");

            System.out.println("Nome: " + pet.getNome());
            System.out.println("Id: " + pet.getId());
            System.out.println("Raça: " + pet.getRaca());
            System.out.println("Idade: " + pet.getIdade());
            System.out.println("Nível de cuidado: " + pet.getNivelCuidado());
        }
    }

//Método p alterar alguma informação - ERRO
    public void alterar(Pet lisPet, int x){

        if (x >= 0 && x < listPets.size()) {
            Pet pet = listPets.get(x);
            
            int escoliose = LER.nextInt();
            
            switch (escoliose) {
                case 1:  // Alterar nome
                    System.out.print("Novo nome: ");
                    String novoNome = LER.next();
                    pet.setNome(novoNome);
                    System.out.println("Nome alterado com sucesso!");
                    break;

                case 2:  // Alterar idade
                    System.out.print("Nova idade: ");
                    int newIdade = LER.nextInt();
                    pet.setIdade(newIdade);
                    System.out.println("Idade alterada com sucesso!");
                    break;

                    case 3:  // Alterar raça
                    System.out.print("Nova raça: ");
                    String newRaca = LER.next();
                    pet.setRaca(newRaca);
                    System.out.println("Raça alterada com sucesso!");
                    break;

                case 4:  // Alterar nível de cuidado
                    System.out.println("Novo nível de cuidado (baixo, médio, alto): ");
                    String newNC = LER.next();
                    pet.setNivelCuidado(newNC);
                    System.out.println("Nível de cuidado alterado com sucesso!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
  
}
    