package by.academy.task7and8_OOP.Test_1;

public class Application {

	public static void main(String[] args) {
		Phone phone1 = new Phone(3076277, "Huawei", 230);
		Phone phone2 = new Phone(7854589, "Nokia", 578);
		Phone phone3 = new Phone(6553321, "Samsung", 300);
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println(phone3);
		
		System.out.println();
		
		phone1.receiveCall("Джеймс");
		System.out.println(phone1.getNumber());
		phone2.receiveCall("Кэтрин");
		System.out.println(phone2.getNumber());
		phone3.receiveCall("Арнольд");
		System.out.println(phone3.getNumber());
		
		System.out.println();

		phone1.receiveCall("Джордж", 3456576);
		phone1.receiveCall("Эндрю", 5676555);
		phone1.receiveCall("Джессика", 2847799);
		
		System.out.println();
		
		phone1.sendMessage(1214578, 78921, 7987);
		phone2.sendMessage(789);
		phone3.sendMessage();
	}

}
