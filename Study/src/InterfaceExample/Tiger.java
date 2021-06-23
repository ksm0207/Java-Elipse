package InterfaceExample;

public class Tiger extends Animal implements Predator {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "호랑이";
	}
	
	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "사슴고기";
	}

	

}
