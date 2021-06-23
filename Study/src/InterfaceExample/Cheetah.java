package InterfaceExample;

public class Cheetah extends Animal implements Predator{

	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "치타";
	}
	
	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "닭고기";
	}

	

}
