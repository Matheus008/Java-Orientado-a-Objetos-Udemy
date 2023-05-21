package exe022_1_entidade;

public class Estudante {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double media() {
		double m = (nota1+nota2+nota3);
		return m;
	}
	
	public double reprovado() {
		double r = 60 - media()  ;
		return r;
	}
	
	public String toString() {
		return "Média final= "
				+String.format("%.2f", media());
	}
	
}
