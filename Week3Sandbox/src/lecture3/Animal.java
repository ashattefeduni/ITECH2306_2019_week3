package lecture3;

public class Animal {
	
	private int age = 0;
	public final String type = "Dog";
	

	public void setBreed(String breed) {
	
	}


	public Animal() {
		
	}
	
	public Animal(String breed) {
		
	}
	
	public Animal(int age) {
		
	}
	
	public Animal(boolean isRegistered) {
		
	}
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	private boolean validateAge(int age) {
		if (age > 0) {
			return true;
		}
		return false;
	}
	
	


}
