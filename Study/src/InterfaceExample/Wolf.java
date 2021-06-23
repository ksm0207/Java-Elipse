package InterfaceExample;

public class Wolf extends Animal implements Predator{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "늑대";
	}
	
	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "돼지고기";
	}

	

}
