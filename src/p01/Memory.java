package p01;

public abstract class Memory extends Part{
	private int volume;
	public Memory()
	{
		volume=Random.getRandomInt();
	}
	public Memory(String name,int volume,int price)
	{
		super(name,price);
		this.volume=volume;
	}
	public int getVolume()
	{
		return volume;
	}
	public void setVolume(int volume)
	{
		this.volume=volume;
	}
    public String getPartName()
    {
    	return "内存";
    }
    public static Memory getAMemory()
    {
    	if(Random.getRandomInt()%2==0)
    		return new Samsung();
    	else 
    		return new Kingston();
    }

}
