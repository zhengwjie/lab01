package p01;

public abstract class HardDisk extends Part{
	private int volume;
	public HardDisk()
	{
		volume=Random.getRandomInt();
	}
	public HardDisk(String name,int volume,int price)
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
    	return "硬盘";
    }
    public static HardDisk getAHardDisk()
    {
    	if(Random.getRandomInt()%2==0)
    		return new Seagate();
    	else 
    		return new WestDigitals();
    }
}
