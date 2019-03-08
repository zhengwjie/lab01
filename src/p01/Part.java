package p01;

public abstract class Part implements Work{
	private String name;
	private int price;
	public Part()
	{
		name=Random.getRandomStr(4);
		price=Random.getRandomInt();
	}
	public Part(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	public String discribe()
	{
		return this.getPartName()+"——"+this.getBrandName()+":"+this.name;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
	    this.price=price;
	}
	public abstract String getPartName();
	public abstract String getBrandName();
	public void work()
	{
		System.out.println(getPartName()+"——"+getBrandName()+":"+getName()+" work");
	}
}
