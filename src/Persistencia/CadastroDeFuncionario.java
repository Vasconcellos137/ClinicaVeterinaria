package Persistencia;

import CadastroClinicaVeterinaria.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDeFuncionario {

    final static Scanner LER = new Scanner (System.in);

    static List<Funcionario> listFuncions = new ArrayList<Funcionario>(); 

    public CadastroDeFuncionario(){

    } 

//Método p inserir
    public void inserir(){
        Funcionario funcio = new Funcionario();            
            System.out.println("•Inicio de Cadastro•");

            System.out.println("Nome:");
            String nome = LER.next();
            funcio.setNome(nome);
        
            System.out.println("CPF:");
            String cpf = LER.next();
            funcio.setNome(cpf);

            System.out.println("Especialidade:");
            String es = LER.next();
            funcio.setNome(es);

            System.out.println("Cadastro realizado com sucesso!");

        listFuncions.add(funcio);
    }

//Método p remover
    public void remover(int pos){
        for (int i = 0; i < listFuncions.size(); i++) {
            if (pos == i) {
                listFuncions.remove(i);                 
            }
        }

        System.out.println("Remoção realizado com sucesso!");
    }

//Método p listar/mostrar as informação
    public void listar(){

        if (listFuncions == null || listFuncions.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        for (Funcionario funcio : listFuncions) {
            pularLinha();
            System.out.println("•·•·• Informações do Funcionário •·•·•");

            System.out.println("Nome: " + funcio.getNome());
            System.out.println("CPF:" + funcio.getCpf());
            System.out.println("Especialidade:" + funcio.getEspecialidade());
        }
    }

//Método p pular linha
    public void pularLinha(){
        System.out.println();
        System.out.println();
    }

}


