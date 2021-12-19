package by.academy.classwork.lesson14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) {
		User user = new User("SuperAdmin", "qwerty");
		try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src/user.txt"));

				ObjectOutputStream osu = new ObjectOutputStream(bufferedOutputStream)) {
			osu.writeObject(user);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try (BufferedInputStream br = new BufferedInputStream(new FileInputStream("src/user.txt"));
				ObjectInputStream isu = new ObjectInputStream(br)) {
			User user1 = (User) isu.readObject();
			System.out.println(user1);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
