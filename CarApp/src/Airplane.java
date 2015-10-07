
public class Airplane extends Vehicle
{
	private String color;
	private String airline;
	private int maxSpeed;
	
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getAirline()
	{
		return airline;
	}
	public void setAirline(String airline)
	{
		this.airline = airline;
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
	
	public Airplane(String newColor, String newAirline, int newMaxSpeed)
	{
		color = newColor;
		airline = newAirline;
		maxSpeed = newMaxSpeed;
	}

	
//Methods
	
	public String displayColor()
	{
		return "The airplane is a " + color;
	}
	
	public String displayAirline()
	{
		return " " + airline + " airplane";
	}
	
	public String displayStarting()
	{
		return "The airplane is starting";
	}
	
	public String displayAccelerating()
	{
		return "The airplane is accelerating";
	}
	public String displayTakingOff()
	{
		return "The airplane is taking off";
	}
	public String displaySpeed(int maxSpeed)
	{
		String.valueOf(maxSpeed);
		Integer.toString(maxSpeed);
		return "The airplane is going " + maxSpeed + " mph";
	}
	public String displaySlowingDown()
	{
		return "The airplane is slowing down";
	}
	public String displayLanding()
	{
		return "The airplane is landing";
	}
	public String displayStopped()
	{
		return "The airplane has stopped";
	}
}
