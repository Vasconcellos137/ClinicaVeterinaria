package Persistencia;

import CadastroClinicaVeterinaria.Pet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDePet {

    final static Scanner LER = new Scanner (System.in);

    static List<Pet> listPets = new ArrayList<Pet>();
   
    public CadastroDePet() {
        
    }

//Método p inserir
    public void inserir(){
        Pet pet = new Pet();            
            System.out.println("•Inicio de Cadastro•");

            System.out.println("Nome:");
            String nome = LER.next();
            pet.setNome(nome);
        
            System.out.println("Id:");
            String id = LER.next();     
            pet.setId(id);             
        
            System.out.println("Raça:");
            String r = LER.next();
            pet.setRaca(r);
        
            System.out.println("Idade:");
            int i = LER.nextInt();
            pet.setIdade(i);
        
            System.out.println("Nível de cuidado:");
            String n = LER.next();
            pet.setNivelCuidado(n);

            System.out.println("Cadastro realizado com sucesso!");

        listPets.add(pet);
    }

//Método p remover
    public void remover(int pos){
        for (int i = 0; i < listPets.size(); i++) {
            if (pos == i) {
                listPets.remove(i);                 
            }
        }

        System.out.println("Remoção realizado com sucesso!");
    }

//Método p listar/mostrar as informação do pet
    public void listar(){

        if (listPets == null || listPets.isEmpty()) {
            System.out.println("Nenhum pet cadastrado.");
            return;
        }

        for (Pet pet : listPets) {
            pularLinha();
            System.out.println("•·•·• Informações do Pet •·•·•");

            System.out.println("Nome: " + pet.getNome());
            System.out.println("Id: " + pet.getId());
            System.out.println("Raça: " + pet.getRaca());
            System.out.println("Idade: " + pet.getIdade());
            System.out.println("Nível de cuidado: " + pet.getNivelCuidado());
        }
    }

//Método p pular linha
    public void pularLinha(){
        System.out.println();
        System.out.println();
    }

}
    