package Model;

public class Motorista{

    private String nome;
    private int id;
    private String cpf;

    public Motorista(int idMot, String cpf, String nome) {
        this.setId(idMot);
        this.setCpf (cpf);
        this.setNome(nome);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    @Override
    public String toString() {
        return "\n\n" + "Nome: " + this.getNome() + "\n" + "ID: " + this.getId() + "\n" + "CPF: " + this.getCpf();
    }




}

