package exe020_2_entidade;

public class retangulo {

	public double x;
	public double y;
	
	public double area() {
		
		double resultadoArea = x * y;
		return resultadoArea;
	}
	
	public double perimetro() {
		
		double resultadoPerimetro = x + x + y + y;
		return resultadoPerimetro;
	}
	
	public double diagonal() {
		
		double D = Math.pow(x, 2.0) + Math.pow(y, 2.0);
		return Math.sqrt(D);
	}
}
