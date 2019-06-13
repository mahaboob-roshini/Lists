package myproject9;
import java.util.*;
public class Stack1 {
	public static void main(String args[]) {
		 Stack<String>s = new Stack<String>();  
			s.add("image");
			s.add("morning");
			s.add("ball");
			s.add("net");
			s.add("night");
			Iterator itr=s.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());
			  }
			  System.out.println("the stack is=="+s);
			  System.out.println("the size are==="+s.size());
	          System.out.println("the capacity are=="+s.capacity());
	          s.push("hut");
	          s.push("join"); 
	          s.push("key");
	          s.push("ego");
	          s.push("question");
	          s.push("answer");
	          System.out.println("stack is=="+s);
	          s.pop();  
	          s.pop();
	          System.out.println("popped=="+s);
	          s.peek();
	          System.out.println("the peek is=="+s);  
	}
		

}
