package by.academy.classwork.lesson3;

public class Product {
	String name;
	int dataRelease;
//	цена, количество
	
	public Product() {
		super();
	}
	
	public Product(String name, int dataRelease) {
		super();
		this.name = name;
		this.dataRelease = dataRelease;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDatRelease(int dataRelease) {
		this.dataRelease = dataRelease;
	}
	
	public int getDatRelease() {
		return dataRelease;
	}
	
	public void info() {
		System.out.println("Это " + name + " " + dataRelease + " года выпуска");
	}
	
	

}
