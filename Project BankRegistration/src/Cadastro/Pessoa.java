package Cadastro;

public class Pessoa {

    private String nome;
    private int idade;
    private float renda;
    private long cpf;
    public boolean getname;

    public Pessoa(String nome, int idade, float renda, long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public boolean isGetname() {
        return getname;
    }

    public void setGetname(boolean getname) {
        this.getname = getname;
    }

    public boolean getname() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
