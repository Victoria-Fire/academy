package by.academy.homework.hw6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task_2 {

	public static void main(String[] args) {
		File dir = new File("src/main/java/by/academy/homework/hw6");
		File fileStart = new File(dir, "task_2.txt");
		File fileResult = new File(dir, "result.txt");

		try {
			if (!dir.exists()) {
				dir.mkdirs();
			}
			if (!fileResult.exists()) {
				fileResult.createNewFile();
			}

			BufferedReader br = new BufferedReader(new FileReader(fileStart));
			String text = br.readLine().replaceAll("\\s", "");
			br.close();

			BufferedWriter bwResult = new BufferedWriter(new FileWriter(fileResult));
			bwResult.write(text);
			bwResult.close();

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
