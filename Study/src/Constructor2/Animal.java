package Constructor2;

public class Animal {
	
	// 1. 동물 , 증상
	String animalName = ""; // 동물이름
	String symPtom = "";    // 현재증상
	
	// 동물이름 생성자
	public Animal(String animalName) {
		this.animalName = animalName;
	}
	// 동물이름 , 증상 생성자
	public Animal(String animalName , String symPtom) {
		this.animalName = animalName;
		this.symPtom = symPtom;
	}
	
	@Override
	public String toString() {
		return animalName + " " + symPtom;
	}
}
