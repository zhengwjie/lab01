package p01;

public class Intel extends CPU{
	public Intel()
	{
		
	}
    public Intel(String name,int coreNum,int price)
    {
    	super(name,coreNum,price);
    }
    public String getBrandName()
    {
    	return "Intel";
    }
}
