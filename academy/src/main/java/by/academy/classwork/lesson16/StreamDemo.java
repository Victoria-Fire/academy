package by.academy.classwork.lesson16;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		Random random = new Random();
		
		List<Integer> listInt = Stream.generate(() -> random.nextInt(1000) + 500)
				.limit(1000)
				.skip(100)
				.filter(o -> o % 2 != 0)
				.sorted()
				.distinct()
				.limit(350)
				.collect(Collectors.toList());
		
		List<String> list = listInt.stream()
				.map(o -> "Строка с номером: " + o)
				.collect(Collectors.toList());

		System.out.println(listInt);
		System.out.println(listInt.size());
		System.out.println();
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println();

		System.out.println(listInt.stream().min(Comparator.comparing(Integer::valueOf)));
		System.out.println(listInt.stream().max(Comparator.comparing(Integer::valueOf)));
		System.out.println(list.stream().anyMatch(o -> o.equals("Строка с номером: 501")));
	}
}

//1. Сгенерировать 1000 чисел в диапазоне от 500 до 1500 используя Stream API.  
//2. Нужно пропустить первые 100 элементов. 
//3. Оставить только нечетные числа. 
//4. Отсортировать числа. 
//5. Оставить только уникальные значения. 
//6. Преобразовать с помощью map числа в строки в формате: "Строка с номером: " + n 
//7. Органичить количество элементов 350. 
//8. Сгенерировать List (.collect(Collectors.toList())
//================================
//1. Найти min/max с помощью Stream API. 
//2. Проверить, есть ли в коллекции строка, которая equals строке "Строка с номером: 501"