package myproject9;
import java.util.*;
public class Vector1 {
 public static void main(String args[]) {
	  Vector<String>v = new Vector<String>();  
		v.add("good");
		v.add("morning");
		v.add("good");
		v.add("get");
		v.add("night");
		System.out.println("................");
		Iterator itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());
		  }
		  System.out.println("the vector is==="+v);
		  System.out.println("the size are=="+v.size());
          System.out.println("the capacity are=="+v.capacity());
            v.add("byeee");
            v.add("going");
            v.add("union");
            v.add("byeeeeeeeeeeee");
            System.out.println("................");
            v.get(2);
            System.out.println("the get element is"+v);
            v.hashCode();
            System.out.println("to  display the hashcode"+ v);
            v.addElement("edit");
            v.addElement("file");
            v.addElement("to");
            v.addElement("source");
            v.addElement("remove");
            v.addElement("next");
            System.out.println("adding is==="+v);
            System.out.println("...........");
            v.toArray();
            System.out.println("change into array="+v);
            System.out.println("........................");
            v.remove(1);
            System.out.println("remove is="+v);
            v.removeElementAt(5);
            
            System.out.println("remove at place is=="+v);
            System.out.println("................");
           System.out.println("the first element is==="+v.firstElement());
           System.out.println("................");
           System.out.println("the last element is=="+v.lastElement());
           System.out.println("..................");
            System.out.println("the vector is"+v);
            v.elementAt(3);
            System.out.println("the element at vector is=="+v);
            System.out.println("..........................");
            System.out.println("the element at vector is present or not=="+v.equals("next"));
            System.out.println(".....................");
            System.out.println("the index is==="+v.indexOf(1));
            System.out.println("the last index is=="+v.lastIndexOf(3));
            System.out.println(".........................");
            v.removeAll(v);
            System.out.println("the remove index is=="+v);
            System.out.println("....................");
            v.clear();
            System.out.println("the vector is empty==="+v);
            System.out.println("..................");
            v.removeAllElements();
           System.out.println("elements removed is==="+v); 
           System.out.println("...............");
            
            v.clone();
            System.out.println("the clone is=="+v);
            System.out.println(".....................");
            System.out.println("the vector is empty to check=="+ v.isEmpty());
            v.setSize( 5);
            System.out.println("the set size is==="+v);
            System.out.println("..............................");
            System.out.println("/****************************/");
            
}
}
	