package myproject9;
import java.util.*;
import java.util.LinkedList;
public class Linkedlist {
	 public static void main(String args[]) {
		  LinkedList<String> list=new LinkedList<String>();
		  list.add("good");
		  list.add("morning");
		  list.add("good");
		  list.add("get");
		  list.add("night");
		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		  System.out.println(itr.next());
		  }
		  System.out.println("the linkedlist is=="+list);
		  System.out.println("////////////");
		  list.add(2,"evening");
		  System.out.println("**************");
			 System.out.println(list.get(1));
			 System.out.println("/*************/");
			 list.addFirst("hello");
			 System.out.println("after =="+list);
			 list.addLast("bye");
			 System.out.println("after adding=="+list);
			 System.out.println("after=="+list.getFirst());
			 System.out.println("........................................"); 
			 System.out.println("the element is=="+list.element());
			 System.out.println("..............................................");  
			  System.out.println(list.remove(2));
			  System.out.println(".............");
			  System.out.println("after"+list.getLast());
			  System.out.println("first"+list.removeFirst());
			  System.out.println("first"+list.removeLast());
			  System.out.println("..............................."); 
			  System.out.println(" the remove is==="+list.removeFirstOccurrence(""));
			  System.out.println("..........................................");
			  System.out.println(" the last remove is=="+list.removeLastOccurrence(""));
			  System.out.println("........................................");  
			  System.out.println(list.contains("get"));
			  System.out.println(".............");
			  System.out.println(list.lastIndexOf("get"));
			  System.out.println("--------");
			  System.out.println(list.clone());
			  System.out.println("+++++++++++");
			  System.out.println("the offer element is=="+list.offerFirst("lim"));  
			  System.out.println("...........................................");
			  System.out.println("the offer last element is=="+list.offerLast("exit")); 
			  System.out.println("...................................................");  
			  System.out.println("peek is=="+list.peek());
			  System.out.println("peek is=="+list.peekFirst());
			  System.out.println("peek is=="+list.peekLast());
			  System.out.println("....................................");  
			  System.out.println("after deleting=="+list);
			  list.set(1,"link");
			  System.out.println("the value=="+list);
			  System.out.println("...............................");  
			  
			  System.out.println("clear");
			  System.out.println("**************");
			  System.out.println("size=="+list.size());
			  System.out.println(".............");
			  list.clear();
			  System.out.println("the clear is==="+list);
			  System.out.println("!!!!!!!!!");
			  System.out.println("the hashcode==="+list.hashCode());
			  System.out.println("...........");
			  System.out.println("it displays"+list.isEmpty());
			  System.out.println("..............");
			  System.out.println("after retrieve===="+list.poll());
			  System.out.println("after retrieve==="+list.pollFirst());
			  System.out.println("after retrieve==="+list.pollLast());
			  System.out.println("after"+list);
			  list.push("key");
			  System.out.println("pushed=="+list);
			  System.out.println("popped=="+list.pop());
			  System.out.println("............");
			  System.out.println(".................");
			  System.out.println("......................");
			  System.out.println("/*****************************/");
			 }
	  
		 
		 
	  }




