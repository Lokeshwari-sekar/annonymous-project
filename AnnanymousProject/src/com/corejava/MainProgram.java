package com.corejava;

public class MainProgram 
{
public static void main(String[] args)
	{
		//one way of calling(creating for for thread class)
		Thread tob=new Thread()
	{
			public void run()
			{
				System.out.println("with object run method extending thread class");
			}
	};
	tob.start();
//another way of calling(without object calling)
		new Thread()
		{
				public void run()
				{
					System.out.println("without object run method extending thread class");
				}
				
		}.start();
	
	
		Runnable rob=new Runnable()
		{
			public void run()
			{
				System.out.println("with object run method using runnable interface");
			}
			
		};
				Thread tob1=new Thread(rob);
				tob1.start();}
}
