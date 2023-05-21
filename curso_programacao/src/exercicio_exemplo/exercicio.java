package exercicio_exemplo;
import java.util.Locale;

public class exercicio {

	public static void main(String[] args) {

		String produto1 = "Computer";
		String produto2 = "Office desk";
		
		int idade = 31;
		int code = 5290;
		char gender = 'F';
		
		double prince1 = 2100.0;
		double prince2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Product:");
		System.out.printf("%s, which prine is $ %.2f%n", produto1, prince1);
		System.out.printf("%s, which price is $ %.2f%n", produto2, prince2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", idade,code,gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f",measure);
		
	}

}
