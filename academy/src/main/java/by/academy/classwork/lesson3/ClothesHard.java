package by.academy.classwork.lesson3;

import java.util.Scanner;

public class ClothesHard {
	String type;
	String color;
	String gender;
	int count;
	static int countObj = 0;

	public ClothesHard() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getCount() {
		return count;
	}

	public void SetCount(int count) {
		this.count = count;
	}

	public void formFilling() {
		int typeIn;
		int colorIn;
		String genderInM;
		String genderInF;
		int countIn;

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("Чего желаете у нас купить?");
			System.out.println("> Рубашка - нажмите 1");
			System.out.println("> Брюки - нажмите 2");
			System.out.println("> Юбка - нажмите 3");
			typeIn = sc1.nextInt();

			switch (typeIn) {
			case 1:
				type = "Рубашка";
				break;
			case 2:
				type = "Брюки";
				break;
			case 3:
				type = "Юбка";
				break;
			default:
				System.out.println("Товар не найден!");
			}

			if (type == null) {
				continue;
			} else {
				break;
			}
		}

		while (true) {
			System.out.println();
			System.out.println("Какого цвета?");
			System.out.println("> Белый - нажмите 1");
			System.out.println("> Черный - нажмите 2");
			System.out.println("> Серый - нажмите 3");
			colorIn = sc1.nextInt();

			switch (colorIn) {
			case 1:
				color = "Белый";
				break;
			case 2:
				color = "Черный";
				break;
			case 3:
				color = "Серый";
				break;
			default:
				System.out.println("Такого цвета у нас еще нет.");
			}

			if (color == null) {
				continue;
			} else {
				break;
			}
		}

		while (true) {
			System.out.println();
			System.out.println("Вы Супермен?");
			System.out.println("> Да или Нет");
			genderInM = sc2.nextLine();

			if ((genderInM.equals("Да")) || (genderInM.equals("да")) || (genderInM.equals("Lf"))
					|| (genderInM.equals("lf"))) {
				gender = "Мужской";
				break;
			} else if ((genderInM.equals("Нет")) || (genderInM.equals("нет")) || (genderInM.equals("Ytn"))
					|| (genderInM.equals("ytn"))) {
				System.out.println("Вы Женщина-Кошка?");
				System.out.println("> Да или Нет");
				genderInF = sc2.nextLine();
				if ((genderInF.equals("Да")) || (genderInF.equals("да")) || (genderInF.equals("Lf"))
						|| (genderInF.equals("lf"))) {
					gender = "Женский";
					break;
				} else if ((genderInF.equals("Нет")) || (genderInF.equals("нет")) || (genderInF.equals("Ytn"))
						|| (genderInF.equals("ytn"))) {
					System.out.println("КТО ВЫ ??? О_о");
				}
			} else {
				System.out.println("Не правильно введен ответ");
			}
		}

		while (true) {
			System.out.println();
			System.out.println("Какое количество наших вещей будете брать?");
			countIn = sc1.nextInt();

			if ((countIn > 0) && (countIn <= 100)) {
				count = countIn;
				break;
			} else {
				System.out.println("Вы заказали слишком много... или не заказали НИ-ЧЕ-ГО!");
			}
		}

		countObj++;
		if (countObj == 1) {
			countObj--;
		} else {
			sc1.close();
			sc2.close();
		}

	}

	public void info() {
		System.out.println();
		System.out.println("Ура! Ваш заказ оформлен.");
		System.out.println(
				"Вы выбрали: " + type + ". Цвет: " + color + ". Тип: " + gender + ". Количество: " + count + " шт.");
		System.out.println("Мы доставим его вам в течении 3-5 дней.");
		System.out.println("__________________");
		System.out.println();
	}

}
