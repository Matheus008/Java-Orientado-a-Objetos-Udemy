package set;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<>();
		//Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		//set.remove("Tablet");
		//set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0)  == 'T');
		
		//System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
