package generics_set_map;
import java.util.ArrayList;
import java.util.List;

public class Curinga_Delimitados_Contravariancia {

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		
		
		/*Contravariancia � quando consegue colocar 'put' por�m n�o consegue usar o 'get'
		 
		Number x = myNums.get(0); */
		
	}

}
