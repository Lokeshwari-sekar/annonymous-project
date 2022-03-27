package com.corejava;
class Bank
{
	static int amount=10000;
	synchronized void deposite(int damt)
	{
		System.out.println("deposite method");
		amount=amount+damt;
		System.out.println("after deposite amount is"+amount);
		System.out.println("deposite is completed");
		notify();
	}
	synchronized void withdraw(int wamt) throws InterruptedException
	{
		System.out.println("withdraw method");
		
		if(wamt>amount)
		{
			wait();
		}
		amount=amount-wamt;
		System.out.println("after withdraw amount is"+amount);
		System.out.println("withdraw is completed");
	}
	
}
public class MyBank
{
public static void main(String[] args) 
{
		Bank ob=new Bank();
		new Thread(){
			public void run(){
				ob.deposite(50000);}
		}.start();
		new Thread(){
			public void run(){
				try {
					ob.withdraw(60000);
				} catch (InterruptedException e) {
				e.printStackTrace();}}
		}.start();
		
}
}
