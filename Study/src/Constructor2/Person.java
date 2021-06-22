package Constructor2;

public class Person {
	// �������� - �Ƿ��� �̸� , ���� �̸�
	String personName = "";
	Animal animal;
	
	// �Ƿ��� �̸� , ���� �̸� ������
	public Person(String personName , String animalName) {
		this.personName = personName;
		this.animal = new Animal(animalName);
	}
	
	// �Ƿ��� �̸� , ���� �̸� , ���� ������
	public Person(String personName , String animalName , String symPtom) {
		this.personName = personName;
		this.animal = new Animal(animalName , symPtom);
	}
	@Override
	public String toString() {
		return personName + " " + animal;
	}
}
