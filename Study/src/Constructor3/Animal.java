package Constructor3;

public class Animal {
	
	String name;
	int time;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int sleepDog(int time) {
		this.time = time;
		
		if (this.time == 1) {
			System.out.print("잠 꾸러기" +"\n");
		}else if(this.time == 2) {
			System.out.print("잠 만 보 !!" + "\n");
		}else {
			System.out.print("null" + "\n");
		}
		
		return this.time;
	}
}
