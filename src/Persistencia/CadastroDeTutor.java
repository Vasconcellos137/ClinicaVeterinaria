package Persistencia;

import CadastroClinicaVeterinaria.Tutor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDeTutor {
    final static Scanner LER = new Scanner (System.in);

    static List<Tutor> listTutors = new ArrayList<Tutor>();

    public CadastroDeTutor() {
        
    }

//Método p inserir
    public void inserir(){
        Tutor tutor = new Tutor();            
            System.out.println("•Inicio de Cadastro•");

            System.out.println("Nome:");
            String nome = LER.next();
            tutor.setNome(nome);
        
            System.out.println("CPF:");
            String cpf = LER.next();
            tutor.setNome(cpf);

            System.out.println("Contato:");
            String contt = LER.next();
            tutor.setContato(contt);

            System.out.println("Cadastro realizado com sucesso!");

        listTutors.add(tutor);
    }

//Método p remover
    public void remover(int pos){
        for (int i = 0; i < listTutors.size(); i++) {
            if (pos == i) {
                listTutors.remove(i);                 
            }
        }

        System.out.println("Remoção realizado com sucesso!");
    }

//Método p listar/mostrar as informação
    public void listar(){

        if (listTutors == null || listTutors.isEmpty()) {
            System.out.println("Nenhum Tutor cadastrado.");
            return;
        }

        for (Tutor tutor : listTutors) {
            pularLinha();
            System.out.println("•·•·• Informações do Funcionário •·•·•");

            System.out.println("Nome: " + tutor.getNome());
            System.out.println("CPF:" + tutor.getCpf());
            System.out.println("Contato:" + tutor.getContato());
        }
    }

//Método p pular linha
    public void pularLinha(){
        System.out.println();
        System.out.println();
    }

}
