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
		house.cookRes = "±Ëƒ°∫∫¿Ωπ‰";
		
		
		System.out.print("¿Ã∏ß : " + house.name +"\n");
		System.out.print("«ÿ∫º ø‰∏Æ :" + house.cookRes+"\n");
		System.out.println("\n");
		
		
		house.startCook();
		ing(true);
		house.cookResult(2);		
	}
	
	private static boolean ing(boolean a) {
		if( a ) {
			System.out.print("¡¯«‡¡ﬂ ... ... " + "\n");
		}else {
			System.out.print("Err");
		}
		return a;
	}

}
