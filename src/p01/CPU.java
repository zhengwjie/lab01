package p01;

public abstract class CPU extends Part{
	private int coreNum;
	public CPU()
	{
		coreNum=Random.getRandomInt();
	}
    public CPU(String name,int coreNum,int price)
    {
    	super(name,price);
    	this.coreNum=coreNum;
    }
    public int getCoreNum()
    {
    	return coreNum;
    }
    public void setCoreNum(int coreNum)
    {
    	this.coreNum=coreNum;
    }
    public String getPartName()
    {
    	return "CPU";
    }
    public static CPU getACpu()
    {
    	int k=Random.getRandomInt();
    	if(k%2==0)
    		return new Intel();
    	else 
    		return new AMD();
    }
}
