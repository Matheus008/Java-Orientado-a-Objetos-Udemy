package entidade;

public class Conta {
	private int numeroDaConta;
	private String nomeDoCliente;
	private double saldo;
	private double taxa = 5.00;
	
	public Conta(int numeroDaConta, String nomeDoCliente,double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoCliente = nomeDoCliente;
		addSaldo(depositoInicial);
	}
	
	public Conta(int numeroDaConta, String nomeDoCliente) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoCliente = nomeDoCliente;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void addSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	public void removeSaldo(double saldo) {
		this.saldo -= saldo+taxa;
	}


	public String toString() {
		return "número da conta: " 
				+ numeroDaConta + ", nome do cliente: " 
				+ nomeDoCliente + ", saldo: " 
				+ saldo + " $";
	}
	
}
