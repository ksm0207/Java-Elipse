package InterfaceExample;

public class YouTuber {
	

	public void feed(Predator predator) {
		System.out.print(predator.getFood() +"\n");
	}
	
	public void getAnimalInfo(Predator predator) {
		System.out.print(predator.getName() + " 에게 " + predator.getFood() + "를 주었습니다." + "\n");
	}
	public static void main(String[] args) {
		
		YouTuber ytber = new YouTuber();
		Cheetah ct = new Cheetah();
		Lion lion = new Lion();
		Tiger tg = new Tiger();
		Wolf wf = new Wolf();
		
		ytber.getAnimalInfo(ct);
		ytber.getAnimalInfo(lion);
		ytber.getAnimalInfo(tg);
		ytber.getAnimalInfo(wf);

	}

}
