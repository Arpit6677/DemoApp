package java8stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamapi {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(10);
	a1.add(34);
	a1.add(13);
	a1.add(19);
	a1.add(26);
	System.out.println(a1);
	//
	
	//till jdk 1.7
	for (Integer a2 : a1) 
		if(a2%2==0)
//			a1.add(a2);
		System.out.println(a2);
	
		//from jdk 1.8 we use streams
	   //1.configuration
	   //2.processing
	    List<Integer> streamlist = a1.stream().filter(x->x%2==0).collect(Collectors.toList());
	      System.out.println(streamlist);
	      streamlist.forEach(System.out::println);
}
}
