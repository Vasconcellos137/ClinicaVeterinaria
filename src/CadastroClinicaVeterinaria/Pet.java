package CadastroClinicaVeterinaria;

public class Pet {
    
    //Atributos
    private String nome;
    private String id;
    private int idade;
    private String raca;
    private String nivelCuidado;
   

    //Construtor
    public Pet() {
        
    }

    //Métodos de acesso
    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

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
