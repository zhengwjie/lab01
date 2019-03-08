package p01;

public class Seagate extends HardDisk{
	public Seagate()
	{
		
	}
	public Seagate(String name,int volume,int price)
	{
		super(name,volume,price);
	}
	public String getBrandName()
	{
		return "Seagate";
	}

}
