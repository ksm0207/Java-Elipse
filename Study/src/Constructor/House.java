package Constructor;

public class House extends Cooking {
	
	public House (String name , String cookRes) {
		super(name , cookRes);
	}
	
	@Override
	public String toString() {
		
		return name + " " + cookRes;
	}

	public static void main(String[] args) {
		House house = new House("" , "" +"\n");
		System.out.print(house);
		
		house.name = "Kim";
		house.cookRes = "��ġ������";
		
		
		System.out.print("�̸� : " + house.name +"\n");
		System.out.print("�غ� �丮 :" + house.cookRes+"\n");
		System.out.println("\n");
		
		
		house.startCook();
		ing(true);
		house.cookResult(2);		
	}
	
	private static boolean ing(boolean a) {
		if( a ) {
			System.out.print("������ ... ... " + "\n");
		}else {
			System.out.print("Err");
		}
		return a;
	}

}
