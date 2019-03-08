package p02;
import p01.*;
import java.util.*;
public class ComputerStore {
	private ArrayList<Computer> computers=new ArrayList<>();
	public void addComputer()
	{
		computers.add(Computer.getAComputer());
	}
	public void addComputer(CPU cpu,Memory memory,HardDisk hardDisk,MainBoard mainBoard,String name)
	{
		computers.add(new Computer(cpu,memory,hardDisk,mainBoard,name));
	}
	public void display()
	{
		for(int i=0;i<computers.size();i++)
		{
			Computer com=computers.get(i);
			System.out.println(com.discribe());
			System.out.println("电脑价格："+com.getPrice()+"\n");
			com.work();
		}
	}
	public static void main(String[]args)
	{  
		ComputerStore sc1=new ComputerStore();
		for(int i=0;i<3;i++)
         sc1.addComputer();
		sc1.display();
	}

}
