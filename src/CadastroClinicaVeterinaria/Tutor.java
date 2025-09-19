package CadastroClinicaVeterinaria;

public class Tutor {
    
    //Atributos
    private String nome;
    private String cpf;
    private String contato;

    //Associações
    private Pet pet;

    //Construtor
    public Tutor() {
    }

    //Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

}
