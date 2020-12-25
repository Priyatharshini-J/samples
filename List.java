import java.util.*;
class Implementlist
{
	void implement()
	{
		LinkedList<String> ll=new LinkedList<String>();  
		ll.add("Apple");
		ll.add("Orange");
		ll.add("papaya");
		System.out.println("Elements in linkedlist are :" + ll);
	}
}
class Implementstack
{
	void implement()
	{
		Stack<Integer> stacks= new Stack<>();  
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		System.out.println("Elements in stack are : " + stacks);
	}
}
class Implementdeque
{	void implement()
	{
	Deque<String> deque = new ArrayDeque<>();
	deque.add("Volvo");    
    deque.add("BMW");     
    deque.add("Maruthi");
    System.out.println("Elements in deque are :");
    for (String str : deque) {  
   System.out.println(str);  
   }  
  }
}
public class List
{
	 public static void main(String[] args) {  
	 	Implementlist list = new Implementlist();
	 	Implementstack stk = new Implementstack();
	 	Implementdeque dq = new Implementdeque();
	 	list.implement();
	 	stk.implement();
	 	dq.implement();
	 }
}