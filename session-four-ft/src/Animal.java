interface Animal {
	@Override
	String toString();
	int getAge();
	void setAge(int age);
} // comes from Object anyway

abstract class AnimalImpl implements Animal { // extend one class, but implement as many interfaces as you like
	private int age;

	@Override
	public int getAge(){ return age;}

	@Override
	public void setAge(int age){ this.age = age;}

	@Override
	public String toString(){
		return "Animal";
	}
}

abstract class Dog extends AnimalImpl {
	@Override
	public String toString(){
		return "Dog";
	}
}

class RobotDog extends Dog {}

class SmallDog extends Dog {}