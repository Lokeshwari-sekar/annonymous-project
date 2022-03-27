package com.corejava;
 abstract class MyAnoAbstract{
	public abstract void add();
	public abstract void sub();
}

public class AnnonymousInnerClass {

	public static void main(String[] args) {
		//Anonymous inner class
		//can be applied to abstract class or interface
		MyAnoAbstract ob=new MyAnoAbstract() {

			@Override
			public void add() {
				System.out.println("Add method");
				
			}

			@Override
			public void sub() {
				System.out.println("Subtract method");
				
			}
			
		};
		ob.add();
		ob.sub();
		

	}

}
