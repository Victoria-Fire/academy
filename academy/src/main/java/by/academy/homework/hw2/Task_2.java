package by.academy.homework.hw2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите сколько будет слов:");
		int number = sc.nextInt();
		System.out.println("Введите " + number + " слов:");
		String[] str = new String[number];
		char[] ch = new char[str.length];
		int[] countСhar = new int[number];

		for (int i = 0; i < number; i++) {
			str[i] = sc.next();
		}

		for (int i = 0; i < str.length; i++) {
			ch = str[i].toCharArray();
			Arrays.sort(ch);
			int count = 1;
			for (int j = 1; j < ch.length; j++) {
				if (ch[j] != ch[j - 1]) {
					count++;
				}
			}
			countСhar[i] = count;
		}

		int minValue = countСhar[0];
		int index = 0;
		for (int i = 0; i < countСhar.length; i++) {
			if(countСhar[i] < minValue) {
				minValue = countСhar[i];
				index = i;
			}
		}
		
		System.out.println("Cлово, в котором число различных символов минимально:");
		System.out.println(str[index]);

		sc.close();
	}
}
