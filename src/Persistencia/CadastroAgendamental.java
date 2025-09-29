package Persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CadastroClinicaVeterinaria.Agendamento;

public class CadastroAgendamental {

    final static Scanner LER = new Scanner(System.in);

    Agendamento agerd = new Agendamento(null, null, null, null, 0);

    public CadastroAgendamental() {

    }

    static List<Agendamento> listAgendados = new ArrayList<Agendamento>();

//Método p inserir 
    public void inserir(Agendamento agerd) {
        listAgendados.add(agerd);
    }

//Método p remover
    public void remover(int pos) {
        for (int i = 0; i < listAgendados.size(); i++) {
            if (pos == i) {
                listAgendados.remove(i);
            }
        }

        System.out.println("Remoção realizado com sucesso!");
    }

//Método p listar/mostrar as informação do pet
    public void listar() {

        if (listAgendados == null || listAgendados.isEmpty()) {
            System.out.println("Nenhum agendamento cadastrado.");
            return;
        }

        for (Agendamento agerd : listAgendados) {
            pularLinha();
            System.out.println("•·•·• Informações do Agendamnto •·•·•");

        }
    }

//Método p pular linha
    public void pularLinha() {
        System.out.println();
        System.out.println();
    }

}
