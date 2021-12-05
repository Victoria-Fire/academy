package by.academy.homework.hw4.task_3;

public class MyIteratorDemo<T> {

	public static void main(String[] args) {
		String[] str = {"Жираф", "Слон", "Обезьяна", "Тигр", "Носорог", "Бегемот"};
		Integer[] number = {7, 56, 34, 13, 95};
		
		MyArray<String> qwerty1 = new MyArray<>(str);
		MyIterator<String> iterator1 = qwerty1.myIterator();
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		System.out.println();
		
		MyArray<Integer> qwerty2 = new MyArray<>(number);
		MyIterator<Integer> iterator2 = qwerty2.myIterator();
		
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
