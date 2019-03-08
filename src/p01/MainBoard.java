package p01;

public abstract class MainBoard extends Part{
	private int speed;
	public MainBoard()
	{
		speed=Random.getRandomInt();
	}
	public MainBoard(String name,int speed,int price)
	{
		super(name,price);
		this.speed=speed;
	}
	public int getspeed()
	{
		return speed;
	}
	public void setspeed(int speed)
	{
		this.speed=speed;
	}
    public String getPartName()
    {
    	return "主板";
    }
    public static MainBoard getAMainBoard()
    {
    	if(Random.getRandomInt()%2==0)
    		return new Asus();
    	else 
    		return new Gigabyte();
    }

}
