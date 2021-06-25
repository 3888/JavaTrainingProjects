package todo.Hexelet.Course_1_Lecture_10_Exception;
import java.util.Iterator;


public class Building_ implements Iterable<Human> {
	
	private static final int BUILDING_CAPASITY = 10;
	
	private Human[] humans = new Human [BUILDING_CAPASITY];
	
	private int size = 0;

	public int getSize(){
		return size;
	}

public void addHuman(Human human){
	if (getSize()== BUILDING_CAPASITY)
		return;
	
	humans[size++] = human;
	}
public Human get(int index){
	return humans[index];
}

@Override
public Iterator<Human> iterator() {
			return new HumanIterator();
}
private class HumanIterator implements Iterator<Human>{

	private int current = 0;
	
	@Override
	public boolean hasNext() {

		return current < size;
	}

	@Override
	public Human next() {
		
		return humans [current++];
		
	}

	@Override
	public void remove() {
		
		
	}


}


	
}



