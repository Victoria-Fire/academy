package by.academy.homework.hw6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_4 {

	public static void main(String[] args) {
		File dir = new File("src/main/java/by/academy/homework/hw6/myFolder");
		File file = new File("src/main/java/by/academy/homework/hw6/task_2.txt");
		File fileResult = new File(dir, "result.txt");
		List<File> fileName = new ArrayList<>();
		Random random = new Random();
		String text = null;

		if (!dir.exists()) {
			dir.mkdirs();
		}

		for (int i = 0; i < 100; i++) {
			fileName.add(new File(dir, (i + 1) + ".txt"));
		}

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			text = br.readLine();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		try (PrintWriter result = new PrintWriter(new FileWriter(fileResult));) {
			for (int i = 0; i < fileName.size(); i++) {
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileName.get(i)));
				int length = random.nextInt(text.length() + 1);
				bw.write(text.substring(0, length));
				result.println("Файл " + fileName.get(i).getName() + " - длина: " + length);
				bw.close();
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
