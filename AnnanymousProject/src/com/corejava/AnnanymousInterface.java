package com.corejava;
 interface MyAnnabstract
 {
	 void add();
	 void sub();
}
public class AnnanymousInterface {

	public static void main(String[] args) {
		//local inner annonymous class
		MyAnnabstract ob=new MyAnnabstract() {

			@Override
			public void add() {
				System.out.println("addition");
				
			}

			@Override
			public void sub() {
				
				System.out.println("subtraction");
			}
			
		};
		ob.add();
		ob.sub();

	}

}
