package by.academy.classwork.lesson2;

public class Dog {
	
	public void bark( ) {
		System.out.println("��������� ������ ������� �� ����!!!");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dog []");
		return builder.toString();
	}
	
	

}
