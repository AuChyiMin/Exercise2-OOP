package Exercise;

public class Main {

	public static void main(String[] args) {

		Cat c = new Cat();
		/*System.out.println(c.Breed);
		System.out.println(c.Colour);
		System.out.println(c.Size);
		System.out.println(c.Coat);*/
		System.out.println("Breed is " + c.Breed);
		System.out.println("Colour is " + c.Colour);
		System.out.println("Size is " + c.Size);
		System.out.println("Coat is " + c.Coat);
		c.walk();
		c.eat();
		c.sleep();
		c.climb();
	}

}
