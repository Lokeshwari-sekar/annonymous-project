package com.corejava;
//using anonymous class
class Table
{
	void printTable(int n)
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println(i+"x"+n+"="+(i*n));
	}
}}

public class AnnanymouscCassTacle 
{
	public static void main(String[] args) 
	{
		Table t1=new Table();
		
		Thread tob=new Thread()
		{
			public void run()
			{
				t1.printTable(6);
			}
			
		};
		tob.start();
		
		new Thread()
		{
			public void run()
			{
				t1.printTable(12);
			}
		}.start();
		

	}

}
