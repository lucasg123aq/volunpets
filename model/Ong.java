package model;


public class Ong {
    private int id;
    private String nome;
    private String cidade;
    private String contato;
    private String link;

    public Ong(){}
    
    public Ong(String nome, String cidade, String contato, String link) {
        this.nome = nome;
        this.cidade = cidade;
        this.contato = contato;
        this.link = link;
    }

    public Ong(int id, String nome, String cidade, String contato, String link) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.contato = contato;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Ong{" + "id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", contato=" + contato + ", link=" + link + '}';
    }
        
}
