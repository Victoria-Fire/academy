package by.academy.homework.hw7.task_1;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_1 {

	public static void main(String[] args) {

		List<Long> list = Stream.generate(() -> new Random().nextLong(101))
				.limit(100)
				.map(o -> Double.valueOf((o * Math.PI) - 20).longValue())
				.filter(o -> o < 100)
				.sorted()
				.skip(3)
				.collect(Collectors.toList());

		Map<Long, String> map = list.stream().collect(Collectors.toMap(o -> o, t -> "Number: " + t, (a1, a2) -> a1));

		for (Map.Entry<Long, String> entry : map.entrySet() ) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
