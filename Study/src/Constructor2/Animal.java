package Constructor2;

public class Animal {
	
	// 1. ���� , ����
	String animalName = ""; // �����̸�
	String symPtom = "";    // ��������
	
	// �����̸� ������
	public Animal(String animalName) {
		this.animalName = animalName;
	}
	// �����̸� , ���� ������
	public Animal(String animalName , String symPtom) {
		this.animalName = animalName;
		this.symPtom = symPtom;
	}
	
	@Override
	public String toString() {
		return animalName + " " + symPtom;
	}
}
