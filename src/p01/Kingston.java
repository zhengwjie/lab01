package p01;

public class Kingston extends Memory{
	public Kingston()
	{
		
	}
	public Kingston(String name,int volume,int price)
	{
		super(name,volume,price);
	}
	public String getBrandName()
	{
		return "Kingston";
	}
}