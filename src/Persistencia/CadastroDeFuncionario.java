package Persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CadastroClinicaVeterinaria.Funcionario;

public class CadastroDeFuncionario {
    final static Scanner LER = new Scanner (System.in);

    static List<Funcionario> listFuncions = new ArrayList();

    public CadastroDeFuncionario() {
    }

//Método p inserir
    public void inserir(Funcionario funcio){
        listFuncions.add(funcio);
    }

//Método p remover
    public void remover(Funcionario listFuncions, Funcionario funcio, int pos){
        // listFuncions.remove(funcio);
    }

//Método p listar/mostrar as informação do pet
    public void listar(){

        if (listFuncions == null || listFuncions.isEmpty()) {
            System.out.println("Nengum cadastro registrado.");
            return;
        }

        for (Funcionario funcio : listFuncions) {
            System.out.println("•·•·• Informações do Funcionário •·•·•");

            System.out.println("Nome: " + funcio.getNome());
            System.out.println("CPF: " + funcio.getCpf());
            System.out.println("Especialidade:" + funcio.getEspecialidade());
        }
    }

}


