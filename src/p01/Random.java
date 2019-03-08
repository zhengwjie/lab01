package p01;
import java.math.*;
public class Random {
	public static String getRandomStr(int n)
	{
		String str="";
		for(int i=0;i<n;i++)
		{
			int k='A'+((int)(Math.random()*100))%26;
			str+=(char)k;			
		}
		return str;
	}
	//100-300之间
	public static int getRandomInt()
	{
		int k=100+((int)(Math.random()*1000))%200;
		return k;
	}
	public static void main(String []args)
	{
		System.out.println(Random.getRandomInt());
		System.out.println(Random.getRandomInt());
		System.out.println(Random.getRandomInt());
		System.out.println(Random.getRandomStr(4));
		
	}

}
