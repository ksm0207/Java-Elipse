package Constructor;

public class Cooking extends Person {
	
	String cookRes = "";

	public Cooking(String name, String cookRes) {
		super(name);
		this.cookRes = cookRes;
	}
	
	public void startCook() {
		System.out.print("요리 시작 :"+cookRes +"\n");
	}
	
	public int cookResult(int count) {
		if (count == 1) {
			System.out.print("맛있는 요리가 완성되었습니다" +"\n");
		}else if(count == 2) {
			System.out.print("더 맛있는 요리가 완성되었습니다."+"\n");
		}else {
			System.out.print("???");
		}
		System.out.print("진행 된 시간 : " + count + " 시간 ");
		return count;
		
	}
}
