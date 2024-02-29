package myPackage;

class animals {
	protected String name;
	protected int age;
	protected String chan;
	
	public animals(String name, int age, String Loai) {
		this.name = name;
		this.age = age;
		this.chan = Loai;
	}
}

class Cop extends animals{
	
	public void speak() {
		System.out.println("Kêu Tiếng Cọp");
	}
	
	public Cop(String name, int age, String chan) {
		super(name, age, chan);		
	}
	
}

class Tho extends animals{
	
	public void speak() {
		System.out.println("Kêu Tiếng Thỏ");
	}
	
	public Tho(String name, int age, String chan) {
		super(name, age, chan);
	}
	
}

class Bo extends animals{
	
	public void speak() {
		System.out.println("Kêu Tiếng Bò");
	}
	
	public Bo(String name , int age, String chan) {
		super(name, age, chan);
	}
	
}

public class Animals{
	public static void main(String[] args) {
		animals cop = new Cop("Cọp", 20, "4 chân");
		animals tho = new Tho("Tho", 4, "2 chân");
		animals bo = new Bo("Bò", 20, "4 chân");
	}
}
