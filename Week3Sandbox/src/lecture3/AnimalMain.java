package lecture3;

public class AnimalMain {
	
	public static void main(String[] args) {
		Animal a = new Animal(true);
		Animal b = new Animal(10);
		a.setAge(10);
		
		//a.type = "Cat";
		
		
		
		
		a.setAge(-1000);
		
		System.out.println(a.getAge());
		
		
		
		
	}

}
