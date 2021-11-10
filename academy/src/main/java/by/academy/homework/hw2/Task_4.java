package by.academy.homework.hw2;

import java.util.Random;
import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Сколько игроков играет за столом в покер:");
		int player = sc.nextInt();
		int card = 5;
		String[] deck = { 
				"Т (Пики)", "2 (Пики)", "3 (Пики)", "4 (Пики)", "5 (Пики)", "6 (Пики)", "7 (Пики)", 
				"8 (Пики)", "9 (Пики)", "10 (Пики)", "В (Пики)", "Д (Пики)", "К (Пики)", 
				"Т (Червы)", "2 (Червы)", "3 (Червы)", "4 (Червы)", "5 (Червы)", "6 (Червы)", "7 (Червы)", 
				"8 (Червы)", "9 (Червы)", "10 (Червы)", "В (Червы)", "Д (Червы)", "К (Червы)", 
				"Т (Трефы)", "2 (Трефы)", "3 (Трефы)", "4 (Трефы)", "5 (Трефы)", "6 (Трефы)", "7 (Трефы)", 
				"8 (Трефы)", "9 (Трефы)", "10 (Трефы)", "В (Трефы)", "Д (Трефы)", "К (Трефы)", 
				"Т (Бубны)", "2 (Бубны)", "3 (Бубны)", "4 (Бубны)", "5 (Бубны)", "6 (Бубны)", "7 (Бубны)", 
				"8 (Бубны)", "9 (Бубны)", "10 (Бубны)", "В (Бубны)", "Д (Бубны)", "К (Бубны)" 
				};
		String[] result = new String[card];
		String[][] playerCard = new String[player][result.length];
		int length = deck.length;
		Random random = new Random();
		int min = 0;
		int max = 51;
		int diff = max - min;

		System.out.println();
		if (player > ((int) deck.length / card)) {
			System.out.println("Извините! На всех карт не хватит...");
			System.exit(1);
		}
		if (player < 2) {
			System.out.println("Недостаточно участников для игры.");
			System.exit(1);
		}

		System.out.println("Перемешали колоду...");
		for (int i = 0; i < deck.length; i++) {
			int index = random.nextInt(i + 1);
			String a = deck[index];
			deck[index] = deck[i];
			deck[i] = a;
		}

		for (int i = 0; i < playerCard.length; i++) {
			for (int j = 0; j < playerCard[i].length; j++) {
				int randomCard = random.nextInt(diff + 1);
				result[j] = deck[randomCard];
				deck[randomCard] = deck[length - 1];
				length--;
				diff--;

				playerCard[i][j] = result[j];
			}
		}

		System.out.println("Раздаем:");
		for (int i = 0; i < playerCard.length; i++) {
			System.out.println("Выводим карты игрока № " + (i + 1));
			for (int j = 0; j < playerCard[i].length; j++) {
				System.out.println(playerCard[i][j]);
			}
			System.out.println("_____________");
			System.out.println();
		}
		sc.close();
	}
}