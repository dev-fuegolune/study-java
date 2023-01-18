package hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetTest {
	
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 20, 30, 30, 20, 50));
		HashSet<Integer> dataSet = new HashSet<Integer>(datas);
		datas = new ArrayList<Integer>(dataSet);
		System.out.println(datas);
	}
}




















