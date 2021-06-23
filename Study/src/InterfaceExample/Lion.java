package InterfaceExample;

public class Lion extends Animal implements Predator{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "사자";
	}
	
	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return "양고기";
	}

	

}
