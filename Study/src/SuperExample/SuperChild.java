package SuperExample;

public class SuperChild extends SuperParent {
	
	int number = 50;
	
	public void result() {
		System.out.print("number = " + number +"\n");
		System.out.print("this.number = " + this.number+"\n");
		System.out.print("super.number = " + super.number+"\n");
	}
	
	public void result2() {
		System.out.print(super.check + "\n");
		System.out.print(super.name + "\n" + this.name);
	}
}
