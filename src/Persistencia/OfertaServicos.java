package Persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CadastroClinicaVeterinaria.Servico;

public class OfertaServicos {

    final static Scanner LER = new Scanner(System.in); 

    Servico serv = new Servico();

    public OfertaServicos() {

    }

    static List<Servico> listServ = new ArrayList<Servico>();

    

//Método p inserir
    public void inserir(){
        Servico serv = new Servico();            
            System.out.println("•Inicio de Cadastro•");

            System.out.println("Nome:");
            String nome = LER.next();
            serv.setNome(nome);
        
            System.out.println("Descrição:");
            String d = LER.next();
            serv.setDescricao(d);;
 
            System.out.println("Valor:");
            String v = LER.next();
            serv.setValor(v);

            System.out.println("Cadastro realizado com sucesso!");

        listServ.add(serv);
    }

//Método p remover
public void remover(int pos){
    for (int i = 0; i < listServ.size(); i++) {
        if (pos == i) {
            listServ.remove(i);                 
        }
    }

    System.out.println("Remoção realizado com sucesso!");
}

//Método p listar as informação    
    public void listar(){

        if (listServ == null || listServ.isEmpty()) {
            System.out.println("Não existe serviços cadastrados.");
            return;
        } 

        for (Servico serv : listServ) {
            pularLinha();
            System.out.println("•·•·•Informações dos serviços oferecidos•·•·•");

            System.out.println("Nome: " + serv.getNome());
            System.out.println("Descrição:" + serv.getDescricao());
            System.out.println("Valor:" + serv.getValor());
        } 
    }

//Método p pular linha
    public void pularLinha(){
        System.out.println();
        System.out.println();
    }

}
