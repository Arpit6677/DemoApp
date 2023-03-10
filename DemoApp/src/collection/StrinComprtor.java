package collection;

import java.util.Comparator;
import java.util.TreeSet;
class Mycomprt implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		
		int i1 = s1.length();
		int i2=s2.length();
		
		
		if(i1<i2)
			return -1;
		else if(i1>i2)
		return +1;
		else
				 return s1.compareTo(s2);
	}
	
}
	public class StrinComprtor {
		public static void main(String[] args) {
			TreeSet t=new TreeSet(new Mycomprt());
			t.add(new StringBuffer("A"));
			t.add(new StringBuffer("AA"));
			t.add("ABCD");
			t.add("ABC");
			t.add(30);
			System.out.println(t);
			
		}
}


