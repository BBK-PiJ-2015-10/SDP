import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main (String [] args) {
		
		//List<Lion> enclosure = new ArrayList<>();
		//enclosure.add(new Lion(12));
		//enclosure.add(new Lion(18));
		//sort(enclosure);
		
		List<Animal> zoo = new ArrayList<>();
		zoo.add(new Lion(12));
		zoo.add(new Zebra(10));		
	}
	
	public static <A extends Comparable<? super A>> void sort (List<A> list){
		throw new NotImplementedException();
		}
	


	public interface Sortable<A extends Comparable<A>> extends Iterable<A> {
		
		default List<A> sort(){
			List<A> list = new ArrayList<>();
			for (A elements: this)
				list.add(elements);
				list.sort((first,second)->first.compareTo(second));
				return list;
		}


		
		
		
	class Animal implements Comparable<Animal> {
		
	}

	class Lion extends Animal //implements Comparable<Lion>// {
		
		{
		
		private int age;
		
		//@Override
		//public int compareTo(Lion other){
			//return age.compareTo(other.age);
		//}	
		
	}

	class Zebra extends Animal //implements Comparable<Zebra> {
		
		{
		private int age;
		
		
		
		
		
		
	}
	
	


	}

}