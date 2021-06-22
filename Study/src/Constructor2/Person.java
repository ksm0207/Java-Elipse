package Constructor2;

public class Person {
	// 동물주인 - 의뢰인 이름 , 동물 이름
	String personName = "";
	Animal animal;
	
	// 의뢰인 이름 , 동물 이름 생성자
	public Person(String personName , String animalName) {
		this.personName = personName;
		this.animal = new Animal(animalName);
	}
	
	// 의뢰인 이름 , 동물 이름 , 증상 생성자
	public Person(String personName , String animalName , String symPtom) {
		this.personName = personName;
		this.animal = new Animal(animalName , symPtom);
	}
	@Override
	public String toString() {
		return personName + " " + animal;
	}
}
