package by.academy.task10.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Test_2 {
	public static void main(String[] args) {
		TreeSet<HeavyBox> box = new TreeSet<>();

		box.add(new HeavyBox(9, 8, 13, 8));
		box.add(new HeavyBox(78, 4, 17, 23));
		box.add(new HeavyBox(99, 14, 16, 33));
		box.add(new HeavyBox(7, 45, 51, 2));
		box.add(new HeavyBox(6, 8, 11, 9));
		
		Iterator <HeavyBox> iterator = box.iterator();
		
		while(iterator.hasNext() ) {
			HeavyBox str = iterator.next();
			System.out.println(str);
		}
	}
}

//Создать TreeSet содержащий HeavyBox. HeavyBox должен реализовать интерфейс Comparable. Распечатать содержимое с помощью for each. (по весу)
