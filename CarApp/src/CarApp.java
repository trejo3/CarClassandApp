
public class CarApp 
{
	public static void main(String[] args)
	{
		
		String color = "red";
		String make = "Ferrari";
		int maxSpeed = 180;
		
		
		Car myCar = new Car(color, make, maxSpeed);
		
		System.out.println(myCar.displayCarColorAndMake());
		System.out.println(myCar.displayStarting());
		System.out.println(myCar.displayAccelerating());
		System.out.println(myCar.displaySpeed(maxSpeed));
		System.out.println(myCar.displaySlowingDown());
		System.out.println(myCar.displayStopped());
		
		System.out.println(" ");
		
		String color1 = "blue";
		String make1 = "Mercedes";
		int maxSpeed1 = 170;
		
		Car myCar1 = new Car(color1, make1, maxSpeed1);
		
		System.out.println(myCar1.displayCarColorAndMake());
		System.out.println(myCar1.displayStarting());
		System.out.println(myCar1.displayAccelerating());
		System.out.println(myCar1.displaySpeed(maxSpeed));
		System.out.println(myCar1.displaySlowingDown());
		System.out.println(myCar1.displayStopped());
		
		
		
	}
}
