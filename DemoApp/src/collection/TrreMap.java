package collection;

import java.util.HashMap;
import java.util.TreeMap;

public class TrreMap {
public static void main(String[] args) {
	HashMap hm= new HashMap();
	
	hm.put(12, "amnt");
	hm.put(15, "sfs");
	hm.put(13, "vdfg");
	hm.put(14, "dggf");
	
	TreeMap tm=new TreeMap();
	tm.put(12, "amnt");
	tm.put(15, "amnt");
	tm.put(13, "amnt");
	tm.put(14, "amnt");
	
	System.out.println("brfore"+tm);
	
	tm.putAll(hm);
	System.out.println(tm);

	
	
	
		
		
}
}
