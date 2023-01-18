package hashSetTest;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		HashSet<String> bloodType = new HashSet<String>();
		bloodType.add("A");
		bloodType.add("B");
		bloodType.add("O");
		bloodType.add("O");
		bloodType.add("O");
		bloodType.add("O");
		bloodType.add("O");
		bloodType.add("O");
		bloodType.add("O");
		bloodType.add("O");
		bloodType.add("AB");
		
		Iterator<String> iter = bloodType.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}



















