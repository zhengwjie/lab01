package p01;

public class AMD extends CPU{
	public AMD()
	{
		
	}
    public AMD(String name,int coreNum,int price)
    {
    	super(name,coreNum,price);
    }
    public String getBrandName()
    {
    	return "AMD";
    }
}