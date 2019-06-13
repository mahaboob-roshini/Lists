package myproject9;
import java.util.*; 
public class Linkedhashset {
public static void main(String args[]){  
      LinkedHashSet<String>a=new LinkedHashSet<String>();  
      a.add("delete");  
      a.add("fast");  
      a.add("insert");  
      a.add("home");
      Iterator<String> itr=a.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      }
      a.add("end");
      a.add("page");
      a.add("num");
      a.add("down");
      a.add("you");
      System.out.println("the adding after=="+a);
      System.out.println(".....................");
      a.remove("num");
      System.out.println("the after remove is===="+a);
      a.clear();
      System.out.println("the clear is="+a);
      System.out.println(".....................");
      System.out.println("the clone is=="+a.clone());
      a.size();
      System.out.println("the size is=="+a);
      System.out.println("...........................");
      System.out.println("it contains is=="+a.contains("ajay"));
      System.out.println(".............................");
      System.out.println("the iterator is=="+a.iterator());
      System.out.println(".......................");
      System.out.println("the spilerator is=="+a.spliterator());
      System.out.println("to check is=="+a.isEmpty());
      System.out.println(".....................");
      System.out.println("/***********************/");
     }  
    }  


