package myproject9;
import java.util.*;
import java.util.ArrayList;
  public class Arraylistexample {
	  public static void main(String args[]) {
		  int mincapacity;
		  ArrayList<String> ar=new ArrayList<String>();
		  ar.add("to");
		  ar.add("is");
		  ar.add("key");
		  ar.add("get");
		  ar.add("no");
		  Iterator itr=ar.iterator();  
		  while(itr.hasNext()){  
		  System.out.println(itr.next());
		  }
		  ar.add(2,"point");
		 System.out.println("the arraylist is"+ar);
		 System.out.println("**************");
			 System.out.println(ar.get(2));
			 System.out.println("**************");
			  System.out.println(ar.remove(2));
			  System.out.println("**************");
			  System.out.println(ar.contains("get"));
			  System.out.println("**************");
			  System.out.println(ar.lastIndexOf("get"));
			  System.out.println("**************");
			  System.out.println(ar.clone());
			  System.out.println("**************");
			  ar.trimToSize();
			  System.out.println("trim "+ar);
			    System.out.println("after deleting"+ar);
			  System.out.println("clear");
			  System.out.println("**************");
			  System.out.println("size"+ar.size());
			  System.out.println("**************");
			  ar.clear();
			  System.out.println("the clear is"+ar);
			  System.out.println("**************");
			  System.out.println("the hashcode"+ar.hashCode());
			  System.out.println("**************");
			  System.out.println("it displays"+ar.isEmpty());
			  System.out.println("**************");
			  ar.iterator();
			  System.out.println("after"+ar);
			  System.out.println("**************");
			  System.out.println("**************");
			 }
	  
		 
		 
	  }


