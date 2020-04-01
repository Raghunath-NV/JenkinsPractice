import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("You are in main class");
		
		ArrayList a = new ArrayList();
		a.add('e');
		a.add(123);
       Iterator i= a.iterator();
       
		while(i.hasNext())
			System.out.print(i.next());
		
		List<Integer> l=new ArrayList<Integer>();
	}

}
