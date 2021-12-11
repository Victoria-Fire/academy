package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task_4 {

	static class Student {
		private String name;
		private int estimation;

		public Student() {
			super();
		}

		public Student(String name, int estimation) {
			super();
			this.name = name;
			this.estimation = estimation;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getEstimation() {
			return estimation;
		}

		public void setEstimation(int estimation) {
			this.estimation = estimation;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Ученик: ");
			builder.append(name);
			builder.append(", оценка - ");
			builder.append(estimation);
			return builder.toString();
		}
	}

	public static void main(String[] args) {
		Random random = new Random();

		List<Student> array = new ArrayList<>();
		array.add(new Student("Антон", random.nextInt(10) + 1));
		array.add(new Student("Маша", random.nextInt(10) + 1));
		array.add(new Student("Михаил", random.nextInt(10) + 1));
		array.add(new Student("Даша", random.nextInt(10) + 1));
		array.add(new Student("Света", random.nextInt(10) + 1));
		array.add(new Student("Артур", random.nextInt(10) + 1));
		array.add(new Student("Наташа", random.nextInt(10) + 1));

		System.out.println("Список учеников с оценками:");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

		System.out.println();

		Iterator<Student> iterator = array.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getEstimation() < 9) {
				iterator.remove();
			}
		}

		System.out.println("Список учеников с оценками выше 9:");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
