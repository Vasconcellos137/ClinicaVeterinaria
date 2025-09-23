package CadastroClinicaVeterinaria;

public class Clinica {
    
    //Atributos
    private String nome;
    private String endereco;
    private String cnpj;

    //Associações
    private Servico servico;

    //Construtor
    public Clinica() {
    }
 
    //Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

}

