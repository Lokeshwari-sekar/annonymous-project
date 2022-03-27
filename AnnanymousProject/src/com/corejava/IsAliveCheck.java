package com.corejava;
class Myclass extends Thread 
{
	public void run()
	{
		System.out.println("run method");
	}
}

public class IsAliveCheck {

	public static void main(String[] args) throws InterruptedException
	{
		Myclass ob=new Myclass();
		Myclass ob1=new Myclass();
		System.out.println("state of the ob "+ob.isAlive());
		System.out.println("state of the ob1 "+ob1.isAlive());
		ob.start();
		System.out.println("state of the ob "+ob.isAlive());
		ob.join();
		System.out.println("state of the ob "+ob.isAlive());
		ob1.start();

	}

}
