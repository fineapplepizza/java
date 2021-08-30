package 업캐스팅;

public class Main {

	public static void main(String[] args) {
 
	animal a1= new animal();
	animal a2= new animal();
	
	Dog d = new Dog();
	Cat c = new Cat();
	
	d.eat();
	c.eat();
	
	a1 = d;
	a2 = c;
	
	a1.eat();
	a2.eat();
	}

}
