
package Model;


public class Produto {
    
    private int id;
    private String nome;
    private Double preço;

    public Produto() {
    }

    public Produto(int id, String nome, Double preço) {
        this.id = id;
        this.nome = nome;
        this.preço = preço;
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

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }
    
    
    
}
