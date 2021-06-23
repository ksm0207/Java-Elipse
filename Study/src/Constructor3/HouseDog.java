package Constructor3;

public class HouseDog extends Dog{
	
	// 1. String Input
	public HouseDog(String name) {
		this.setName(name);
	}
	
	// 2. Integer Input
	public HouseDog(int type) {
		
		if(type == 1) {
			this.setName("진돗개" +"\n");
		}else if(type == 2) {
			this.setName("말티즈" +"\n");
		}else {
			System.out.print("null");
		}
	}
	
	public void sleep() {
		System.out.print(this.name + " 잠을 잡니다 ... Zzz." + "\n");
	}
	
	public void sleep(int hour) {
		System.out.print(this.name + " Zzz.. "
	    + hour + "시간 잠을 잤습니다."+"\n");
	}
	
	public static void main(String [] args) {
		
		HouseDog houseD = new HouseDog("사모예드 \n");
		HouseDog typeD = new HouseDog(1);
		
		System.out.print(houseD.name);
		System.out.print(typeD.name);

	}
}
