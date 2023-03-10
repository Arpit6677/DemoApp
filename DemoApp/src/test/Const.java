package test;

class Dog {
	private String name;
	private int cost;

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}

	Dog(String name, int cost) {
		this();
		this.name = name;

		this.cost = cost;
	}

	Dog() {
		name = "jimmy";
		cost = 7889;
	}
}

public class Const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		Dog d2 = new Dog("sheru", 455);
		System.out.println(d1.getName());
		System.out.println(d1.getCost());
		System.out.println(d2.getName());
		System.out.println(d2.getCost());
	}

}
