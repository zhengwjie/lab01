package p01;

public class Asus extends MainBoard{
	public Asus()
	{
		
	}
	public Asus(String name,int speed,int price)
	{
		super(name,speed,price);
	}
    public String getBrandName()
    {
    	return "Asus";
    }

}
