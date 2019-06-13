package day4.assignment8;
class Animal{
	public static void testClassMethod() {
		System.out.println("The class Method in Animal");
	}
	public void testInstanceMethod() {
		System.out.println("The instance method in Animal.");
	}
	
}

class Cat extends Animal {
	public static void testClassMethod() {
		System.out.println("The class method in Cat");
	}
	public void testInstanceMethod() {
		System.out.println("The instance method in Cat");
	}

	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		//Animal.testClassMethod();
		myAnimal.testInstanceMethod();
		//Animal animal = new Animal();
		//animal.testInstanceMethod();
	}

}
