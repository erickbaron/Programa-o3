package Models;

public class Produto {
	
	//Atributos do Estoque
	private int id;
    private String nome;
    private String codigo;
    private double valor;
    
    //Construtor vazio
    public Produto(){};
    
    //Construtor com par�metros
    public Produto(String n, String c, double v) {
    	nome = n;
        codigo = c;
        valor = v;
    }    
    
    //M�todos para setar valores
    public void setId(int id) {
    	this.id = id;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public void setCod(String codigo) {
    	this.codigo = codigo;
    }
    public void setValor(double valor) {
    	this.valor = valor;
    }
    
    //M�todos para obter valores
    public int getId() { return this.id; }
    public String getNome() { return this.nome; }
    public String getCodigo() { return this.codigo; }
    public double getValor() { return this.valor; }
    public String toString() {
    	return id + ") " + nome + ", " + codigo + ", R$" + valor;
    }
}
