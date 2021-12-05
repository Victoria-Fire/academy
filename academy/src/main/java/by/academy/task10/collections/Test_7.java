package by.academy.task10.collections;

import java.util.HashMap;
import java.util.Map;

public class Test_7 {

	public static void main(String[] args) {
		HashMap<String, Toy> map = new HashMap<String, Toy>();

		map.put("Машинка", new Toy("Фeррари", 13.25));
		map.put("Самолетик", new Toy("Боинг-747", 20.00));
		map.put("Танк", new Toy("Т-34", 36.60));

		for (Map.Entry<String, Toy> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		System.out.println();
		for (String str : map.keySet()) {
			System.out.println(str + " - " + map.get(str));
		}

		System.out.println();
		for (Toy toy : map.values()) {
			System.out.println(toy);
		}
	}
}
//Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Toy).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.