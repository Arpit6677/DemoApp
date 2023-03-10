package java8stream;

import java.util.ArrayList;
import java.util.function.Consumer;

class Myconsumer implements Consumer<String>{

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		
	System.out.println("acdept method called");
	System.out.println(t);
	}
	
}
public class Constrreference {
	public static void main(String[] args) {
		
	
ArrayList<String> a=new ArrayList<String>();
a.add("sachin");
a.add("dhoni");
a.add("rohit");
a.add("kohli");
 
//traditional apprpoach
Consumer<String> c= new Myconsumer();
a.forEach(c);
System.out.println();

//lambda  expression 
a.forEach(x->System.out.println(x));
System.out.println();

//method reference
a.forEach(System.out::println);



}
}