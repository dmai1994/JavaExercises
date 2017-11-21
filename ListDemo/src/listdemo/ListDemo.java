package listdemo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	
	public static void main(String args[]) {
		LinkedList<Integer> userAgeList = new LinkedList<>();
		
		userAgeList.add(40);
		userAgeList.add(53);
		userAgeList.add(45);
		userAgeList.add(53);
		userAgeList.add(2, 51);
		
		Integer[] userAgeArray = userAgeList.toArray(new Integer[0]);
		System.out.println(userAgeArray[0]);
		System.out.println(userAgeList);
		//returns first element or heard and removes it from the list
		System.out.println(userAgeList.poll());
		System.out.println(userAgeList);
		//returns first element but does not remove
		System.out.println(userAgeList.peek());
		//same as peek but gives NoSuchelementException if empty
		System.out.println(userAgeList.getFirst());
		System.out.println(userAgeList.getLast());



	}

}
