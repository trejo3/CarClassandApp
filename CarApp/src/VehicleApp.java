import java.util.Scanner;

public class VehicleApp 
{
	public static void main(String[] args)
	{
		String type = " ";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Car or Airplane? ");
		type = keyboard.next();
		
		if (type.equals("Car"))
		{
			System.out.println("What is the color? ");
			String colorC = keyboard.next();
			
			System.out.println("What is the make? ");
			String makeC = keyboard.next();
			
			System.out.println("What is the max speed? ");
			int maxSpeedC = keyboard.nextInt();	

			Car myCar = new Car(colorC, makeC, maxSpeedC);
			
			System.out.println(myCar.displayColor() + myCar.displayMake());
			System.out.println(myCar.displayStarting());
			System.out.println(myCar.displayAccelerating());
			System.out.println(myCar.displaySpeed(maxSpeedC));
			System.out.println(myCar.displaySlowingDown());
			System.out.println(myCar.displayStopped());
		}
		
		else if (type.equals("Airplane"))
		{
			System.out.println("What is the color? ");
			String colorA = keyboard.next();
			
			System.out.println("What is the airline? ");
			String airline = keyboard.next();
			
			System.out.println("What is the max speed? ");
			int maxSpeedA = keyboard.nextInt();	
			
			Airplane myAirplane = new Airplane(colorA, airline, maxSpeedA);
			
			System.out.println(myAirplane.displayColor() + myAirplane.displayAirline());
			System.out.println(myAirplane.displayStarting());
			System.out.println(myAirplane.displayAccelerating());
			System.out.println(myAirplane.displayTakingOff());
			System.out.println(myAirplane.displaySpeed(maxSpeedA));
			System.out.println(myAirplane.displayLanding());
			System.out.println(myAirplane.displaySlowingDown());
			System.out.println(myAirplane.displayStopped());
		}
		
		keyboard.close();

		
	}
}
