package generics_set_map;
import java.util.ArrayList;
import java.util.List;

public class Curinga_Delimitados_Covariancia {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		List<? extends Number> list = intList;
		Number x = list.get(0);
		
		
		/* Covariancia é quando a opção de 'get' é permitida mas a de 'put' ou inserir não é. 
		
		list.add(20); */
		
	}

}
