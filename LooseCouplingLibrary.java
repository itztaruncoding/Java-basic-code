package com.dp.abstrac;

interface Categories{
	void read();
}

class Book{
	Categories c;
	
	Book(Categories c){
		this.c = c;
		c.read();
	}
	
	public void show() {
		System.out.println("This is a book...");
	}
}

class SubBook implements Categories{
	
	public void read() {
		System.out.println("Reading a book...");
	}
}

class Magazines implements Categories{
	
	public void read() {
		System.out.println("Reading a magazine...");
	}
}

public class LooseCouplingLibrary {

	public static void main(String[] args) {

		Book b = new Book(new SubBook());
		b.show();
		
		Book b1 = new Book(new Magazines());
		b1.show();

	}

}
