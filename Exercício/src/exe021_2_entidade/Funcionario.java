package exe021_2_entidade;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double taxa;
	 
	public double salarioLiquido() {
		double l = salarioBruto - taxa;
		return l;
	}
	
	public void porcento(double porcentagem) {
		salarioBruto += salarioBruto* porcentagem /100.0;
	}
	
	public String toString() {
		return "Empregado: "
				+nome
				+", $"
				+String.format("%.2f", salarioLiquido());
	}
	
}
