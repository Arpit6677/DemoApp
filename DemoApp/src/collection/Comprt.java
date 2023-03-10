package collection;

import java.util.Comparator;
import java.util.TreeSet;


class Mycomparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		System.out.println("sghwWG");
	
		// TODO Auto-generated method stub
		Integer i=(Integer) o1;
		Integer i2=(Integer) o2;
		return -i.compareTo(i2);
		
//		if(i<i2)
//			return +1;
//		else if(i>i2)
//		return -1;
//		else
//		return 0;
	}
	
}
public class Comprt {
public static void main(String[] args) {
	
	TreeSet t=new TreeSet(new Mycomparator());
	t.add(10);
	t.add(8);
	t.add(20);
	t.add(15);
	t.add(13);
	
	System.out.println(t);
	
	
}
}
