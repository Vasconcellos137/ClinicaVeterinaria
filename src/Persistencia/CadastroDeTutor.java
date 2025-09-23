package Persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CadastroClinicaVeterinaria.Tutor;

public class CadastroDeTutor {
    final static Scanner LER = new Scanner (System.in);

    static List<Tutor> listTutors = new ArrayList();

    public CadastroDeTutor() {
    }

//Método p inserir
    public void inserir(Tutor tutor){
        listTutors.add(tutor);
    }

//Método p remover
    public void remover(Tutor listTutors, Tutor tutor, int pos){
        // listTutors.remove(tutor);
    }

//Método p listar/mostrar as informação do pet
    public void listar(){

        if (listTutors == null || listTutors.isEmpty()) {
            System.out.println("Nengum cadastro registrado.");
            return;
        }

        for (Tutor tutor : listTutors) {
            System.out.println("•·•·• Informações do Tutor •·•·•");

            System.out.println("Nome: " + tutor.getNome());
            System.out.println("CPF: " + tutor.getCpf());
            System.out.println("Contato:" + tutor.getContato());
        }
    }

}
