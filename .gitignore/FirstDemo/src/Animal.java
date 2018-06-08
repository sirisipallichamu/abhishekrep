import static java.lang.System.out;

class Animal{
	//
	void eat()
	{
		System.out.println("animal is eating");
	}
	void sleep()
	{
		System.out.println("animal is sleeping");
	}
}
class Feline extends Animal{
	void roam()
	{
		System.out.println(" animal is roaming");
	}
	public static void main(String[] args){
		Feline f = new Feline();
		f.sleep();
		f.roam();
	}
}