package collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayL {
	public static void main(String[] args) {
		boolean s=true;
		ArrayList a=	new ArrayList();
		a.add(10);
		a.add(20);
		a.add(40);
		System.out.println(a);
		
		/*
		 * for (Object object : a) { System.out.println(object);
		 * 
		 * }
		 */
		
//			for (int i = 0; i <=5; ++i) {
//				System.out.println(a);
//				
//			}
		
		Iterator iterator =  a.iterator();
		while(iterator.hasNext()==true) {
			Object next = iterator.next();
			System.out.println(" "+next);
			
		}
				
//			ArrayList<Integer> d	=new	ArrayList<Integer>();
		ArrayDeque a1=new ArrayDeque();
		a1.add(12);
		a1.add(13);
		a1.add(14);
		a1.add(15);
		System.out.println(a1);
		
		LinkedList l1 = new LinkedList();	
//		l1.add(a1);
		l1.addAll(a1);
		System.out.println(l1);
		ListIterator listIterator = l1.listIterator(l1.size());
		while(listIterator.hasPrevious()==true) {
			System.out.print(" "+listIterator.previous());
			
		
	}
		
	}}


