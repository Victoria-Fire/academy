package by.academy.homework.hw6;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Task_3 {

	public static void main(String[] args) {

		List<User> list = new ArrayList<>();
		list.add(new User("Киану", "Ривз", 57));
		list.add(new User("Мэтт", "Деймон", 51));
		list.add(new User("Кира", "Найтли", 36));
		list.add(new User("Сандра", "Буллок", 57));
		list.add(new User("Том", "Круз", 59));
		list.add(new User("Джулия", "Робертс", 54));
		list.add(new User("Зак", "Эфрон", 34));
		list.add(new User("Риз", "Уизерспун", 45));
		list.add(new User("Кирстен", "Данст", 39));
		list.add(new User("Ченнинг", "Татум", 41));

		File dir = new File("src/main/java/by/academy/homework/hw6/users");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		List<File> fileName = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			fileName.add(new File(dir, list.get(i).getName() + "_" + list.get(i).getSurname() + ".txt"));
		}

		try {
			for (int i = 0; i < list.size(); i++) {
				ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream(fileName.get(i))));
				oos.writeObject(list.get(i));
				oos.close();
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
