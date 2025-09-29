package CadastroClinicaVeterinaria;

public class Servico {

    //Atributos
    private String nome;
    private String descricao;
    private String valor;

    //Associações
    private Funcionario funcionario;

    //Construtor's
    public Servico() {
    }

    public Servico(String string, String string2, String string3) {
    }

    //Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
}
