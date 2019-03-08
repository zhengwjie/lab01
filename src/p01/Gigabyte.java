package p01;

public class Gigabyte extends MainBoard{
	public Gigabyte()
	{
		
	}
	public Gigabyte(String name,int speed,int price)
	{
		super(name,speed,price);
	}
    public String getBrandName()
    {
    	return "Gigabyte";
    }
}
