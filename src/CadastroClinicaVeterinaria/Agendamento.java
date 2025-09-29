package CadastroClinicaVeterinaria;

public class Agendamento {

    //Atributos
    private String data;
    private int horario;

    //Associações
    private Servico servico;
    private Tutor tutor;
    private Pet pet;

    //Construtor
    public Agendamento(Tutor tutor, Pet pet, Servico servico, String data, int horario2) {
        this.tutor = tutor;
        this.pet = pet;
        this.servico = servico;
        this.data = data;
        this.horario = horario2;
    }

    //Métodos de acesso
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
