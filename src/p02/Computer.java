package p02;
import p01.*;
public class Computer implements Work{
	private int price;
	private String name;
	private String discribe;
	private CPU part1;
	private Memory part2;
	private HardDisk part3;
	private MainBoard part4;
	public Computer(CPU cpu,Memory memory,HardDisk hardDisk,MainBoard mainBoard,String name)
	{
		part1=cpu;part2=memory;
		part3=hardDisk;part4=mainBoard;
		price=part1.getPrice()+part2.getPrice()+part3.getPrice()+part4.getPrice();
		this.name=name;
		discribe="电脑名："+this.name+"\n电脑组件描述：\n"+part1.discribe()+"\n"+part2.discribe()+"\n"+
		part3.discribe()+"\n"+part4.discribe()+"\n";
	}
	public Computer()
	{
		this(CPU.getACpu(),Memory.getAMemory(),HardDisk.getAHardDisk(),MainBoard.getAMainBoard(),Random.getRandomStr(4));
	}
	public String discribe()
	{
		return discribe;
	}
	public int getPrice()
	{
		return price;
	}
	public String getName()
	{
		return name;
	}
    public void work()
    {
    	System.out.println(this.name+" work:");
    	part1.work();part2.work();
    	part3.work();part4.work();
    	System.out.println("****the end of the work****");
    }
    public static Computer getAComputer()
    {
    	return new Computer();
    }
}
