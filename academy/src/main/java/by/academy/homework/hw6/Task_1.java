package by.academy.homework.hw6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		File dir = new File("src/main/java/by/academy/homework/hw6");
		File file = new File(dir, "task_1.txt");

		if (!dir.exists()) {
			dir.mkdirs();
		}

		System.out.println("Введите инфу для записи в файл:");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file)); Scanner sc = new Scanner(System.in)) {
			while (true) {
				String text = sc.nextLine();
				if (!text.equals("stop")) {
					bw.write(text + "\n");
				} else {
					break;
				}
			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
