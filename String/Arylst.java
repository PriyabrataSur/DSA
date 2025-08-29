import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;

public class Arylst{
	public static void main(String []args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);

		System.out.println(al.get(3));
		al.remove(2);
		System.out.println(al.size());
		System.out.println(al);
		al.set(2,60);
		al.add(1,70);
		al.add(3,90);
		System.out.println(al);
		
		ArrayList<Integer> al1 = new ArrayList<>(al);
		System.out.println(al1);
		
		//al.removeAll(al);
		//System.out.println(al);
		
		/*for(Integer i : al){
			System.out.println(i);
		}*/

		/*ListIterator<Integer> li = al.listIterator();
		while(li.hasNext()){
			Integer i = li.next();
			System.out.println(i);
		}*/

		Iterator<Integer> it =al.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println(i);
		}
			
	}
}