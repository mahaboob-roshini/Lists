package myproject9;
import java.util.*;  
public class Hashset2 {      
	public static void main(String args[]){  
    HashSet<String> set=new HashSet<String>();  
     set.add("Ravi");  
     set.add("Vijay");  
     set.add("Ravi");  
     set.add("Ajay");  
   Iterator<String> itr=set.iterator();  
     while(itr.hasNext()){  
      System.out.println(itr.next());  
     }
     System.out.println("............");
     set.add("good");
	 set.add("morning");
	 set.add("good");
	System.out.println(".........................");
	set.remove("good");
	System.out.println("the remove is=="+set);
	System.out.println(".............................");
	 set.clear();
	 System.out.println("the clear is=="+set);
	 System.out.println(".......................");
	 set.clone();
	 System.out.println("..............");
	 System.out.println("the clone is=="+set);
	 System.out.println( "the empty is=="+set.isEmpty());
	 System.out.println("........................");
      set.size();
    System.out.println("the size is"+set);
    System.out.println("..................");
    System.out.println("the iterator is=="+set.iterator());
    System.out.println(".......................");
    System.out.println("the contains is"+set.contains("ravi"));
    System.out.println(".............................");
    System.out.println("the spliterator is======"+set.spliterator());
    System.out.println("......................");
    System.out.println("......................");
    System.out.println(".......................");
    System.out.println("......................");
    System.out.println(".........................");
	 
    }  
   }  


