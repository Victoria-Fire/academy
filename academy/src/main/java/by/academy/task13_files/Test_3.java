package by.academy.task13_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test_3 {

	public static void main(String[] args) throws IOException {
		File dir = new File("src/main/java/by/academy/task13_files");
		File fileStart = new File(dir, "text.txt");
		File fileResult = new File(dir, "result.txt");
		
		if (!dir.exists()) {
			dir.mkdirs();
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileStart));
			bw.write("Learn\nJava\n");
			bw.close();

			List<String> list = new ArrayList<>();
			BufferedReader br = new BufferedReader(new FileReader(fileStart));
			while (br.ready()) {
				list.add(br.readLine());
			}
			br.close();

			BufferedWriter bwResult = new BufferedWriter(new FileWriter(fileResult));
			for (int i = 0; i < list.size(); i++) {
				bwResult.write(list.get(i) + "\n");
			}
			bwResult.close();

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}

//Написать класс, который копирует содержимое из одного файла в другой.
//Используем классы BufferedReader, FileReader, BufferedWriter, FileWriter.

