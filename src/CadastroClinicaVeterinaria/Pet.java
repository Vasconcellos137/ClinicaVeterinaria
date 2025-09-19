package CadastroClinicaVeterinaria;

public class Pet {
    
    //Atributos
    private String nome;
    private String id;
    private String idade;
    private String raca;
    private String nivelCuidado;

    //Construtor
    public Pet() {
    }

    //Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNivelCuidado() {
        return nivelCuidado;
    }

    public void setNivelCuidado(String nivelCuidado) {
        this.nivelCuidado = nivelCuidado;
    }
}
