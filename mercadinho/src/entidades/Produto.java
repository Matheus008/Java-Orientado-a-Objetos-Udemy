package entidades;

public class Produto {

	private String nomes;
	private double preco;
	private int quantidades;
	
	

	public Produto() {
		
	}
	
	public Produto(String nome,double preco, int quantidade) {
		this.nomes = nome;
		this.preco = preco;
		this.quantidades = quantidade;
	}
	
	public Produto(String nome,double preco) {
		this.nomes = nome;
		this.preco = preco;
	}
	
	public String getName() {
		return nomes;
	}
	
	public void setName(String nome) {
		this.nomes = nome;
	}
	
	public double getPreco(){ //pegar 
		return preco;
	}
	
	public void setPreco(double preco) { //alterar
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidades;
	}
	
	public double valorTotalEmEstoque() {
		return preco*quantidades;
	}
	
	public void addProdutos(int quantidade) {
		
		this.quantidades += quantidade;
		
	}
	
	public void removerProdutos(int quantidade) {
		
		this.quantidades -= quantidade;
		
	}
	
	public String toString() {
		return nomes 
			+ ", $ "
			+ String.format("%.2f", preco)
			+ ", "
			+quantidades
			+" unidades, Total: $ "
			+ String.format("%.2f",valorTotalEmEstoque());
	}
	
}
