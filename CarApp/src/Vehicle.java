
public abstract class Vehicle 
{
	private String color;
	private int maxSpeed;
	
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
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
	


	
//Methods
	
	public String displayColor()
	{
		return "The vehicle is " + color;
	}
	
	public String displayStarting()
	{
		return "The vehicle is starting";
	}
	
	public String displayAccelerating()
	{
		return "The vehicle is accelerating";
	}
	public String displaySpeed(int maxSpeed)
	{
		String.valueOf(maxSpeed);
		Integer.toString(maxSpeed);
		return "The vehicle is going " + maxSpeed + " mph";
	}
	public String displayStopped()
	{
		return "The vehicle has stopped";
	}

}

