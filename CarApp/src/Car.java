
public class Car 
{
	private String color;
	private String make;
	private int maxSpeed;
	
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getMake()
	{
		return make;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	public int getMaxSpeed()
	{
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}
	
// Constructor	
	
	public Car(String newColor, String newMake, int newMaxSpeed)
	{
		color = newColor;
		make = newMake;
		maxSpeed = newMaxSpeed;
	}
	
	public String displayCarColorAndMake()
	{
		return "The car is a " + color + " " + make;
	}
	
	public String displayStarting()
	{
		return "The car is starting";
	}
	
	public String displayAccelerating()
	{
		return "The car is accelerating";
	}
	public String displaySpeed(int maxSpeed)
	{
		String.valueOf(maxSpeed);
		Integer.toString(maxSpeed);
		return "The car is going " + maxSpeed + " mph";
	}
	public String displaySlowingDown()
	{
		return "The car is slowing down";
	}
	public String displayStopped()
	{
		return "The car has stopped";
	}

}
