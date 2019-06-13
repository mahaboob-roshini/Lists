package myproject9;
import java.util.*;
public class Treeset { 
 public static void main(String args[]){  
	 TreeSet<String> set=new TreeSet<String>();  
	         set.add("demo");  
	         set.add("print");  
	         set.add("eraser");  
	         System.out.println("Traversing element through Iterator in descending order");  
	         Iterator i=set.descendingIterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         } 
	         set.add("esc");
	         set.add("web");
	         set.add("up"); 
	         set.add("down");
	         set.add("memory");
	         set.add("time");
	         set.add("scroll");
	         System.out.println("after adding the treeset is"+set);
	         System.out.println("...............................");  
	         System.out.println("after checking is"+set.isEmpty()); 
	         System.out.println("..................................");
	         set.size();
	         System.out.println("the size is"+set);
	         System.out.println("......................................");
	         System.out.println("the first element is=="+set.first()); 
	         System.out.println("....................................");
	         System.out.println("the last element=="+set.last());
	         System.out.println(".............................................");  
	         System.out.println("the floor element is===="+set.floor(""));
	         System.out.println("...........................");
	         System.out.println("the ceiling is==="+set.ceiling("")); 
	         System.out.println(".............................................");  
	         System.out.println("the first poll element is=="+set.pollFirst());
	         System.out.println("..........................."); 
	         System.out.println("the last poll element is=="+set.pollLast());
	         System.out.println(".........................................");
	         System.out.println("the closet highest element is"+set.higher("time"));
	         System.out.println(".............................................");
	         System.out.println("the lowest element is=="+set.lower("scroll"));
	         System.out.println(".............................................");  
	         set.clone();
	         System.out.println("the clone is"+set); 
	         System.out.println("............................................");  
	         set.remove("print");
	         System.out.println("after removing"+set); 
	         System.out.println("........................................");
	         set.clear();
	         System.out.println("after clear is=="+set); 
	         System.out.println("...................................................");  
	         System.out.println("it contains the word=="+set.contains("print")); 
	         System.out.println("......................................................");
	         System.out.println("................................................."); 
	         System.out.println("......................................................."); 
	         System.out.println("******************************/");
	         System.out.println("the end");  
	         
	 }  
	}  


