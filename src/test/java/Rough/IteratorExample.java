package Rough;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		li.add("a");
		li.add("b");
		System.out.println(li.size());
		
		Iterator<String>it=li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
