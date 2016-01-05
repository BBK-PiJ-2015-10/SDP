import java.util.ArrayList;
import java.util.List;

public class Test {


public interface Sortable<A extends Comparable<A>> extends Iterable<A> {
	
	default List<A> sort(){
		List<A> list = new ArrayList<>();
		for (A elements: this)
			list.add(elements);
			list.sort((first,second)->first.compareTo(second));
			return list;
	}


	
	
	
class Animal {}

class Lion extends Animal implements Comparable<Lion> {
	
	private int age;
	
	@Override
	public int compareTo(Lion other){
		return age.compareTo(oher.age);
	}
	
	
	
	
	
}

class Zebra extends Animal {}


	
	
class Customers implements Sortable<Customers> {
	
	
}


}

}