package Models;

public class Estoque {
	//Atributos do Estoque
	private int id;
    private Produto produto;
    private int quantidade;
    
    //Construtor vazio
    public Estoque(){};
    
    //Construtor com par�metros
    public Estoque(Produto p, int q) {
        produto = p;
        quantidade = q;
    }    
    
    //M�todos para setar valores
    public void setId(int id) {
    	this.id = id;
    }
    public void setProduto(Produto produto) {
    	this.produto = produto;
    }
    public void setQtd(int quantidade) {
    	this.quantidade = quantidade;
    }
    
    //M�todos para obter valores
    public int getId() { return this.id; }
    public Produto getProduto() { return this.produto; }
    public int getQuantidade() { return quantidade; }
    public String toString() {
    	return produto.getNome() + ": " + quantidade;
    }
}