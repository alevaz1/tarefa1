package Tarefa;

public abstract class Pessoa {

    private String nome;

    private String sobrenome;

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

   
}
