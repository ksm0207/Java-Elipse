package Constructor;

public class Cooking extends Person {
	
	String cookRes = "";

	public Cooking(String name, String cookRes) {
		super(name);
		this.cookRes = cookRes;
	}
	
	public void startCook() {
		System.out.print("�丮 ���� :"+cookRes +"\n");
	}
	
	public int cookResult(int count) {
		if (count == 1) {
			System.out.print("���ִ� �丮�� �ϼ��Ǿ����ϴ�" +"\n");
		}else if(count == 2) {
			System.out.print("�� ���ִ� �丮�� �ϼ��Ǿ����ϴ�."+"\n");
		}else {
			System.out.print("???");
		}
		System.out.print("���� �� �ð� : " + count + " �ð� ");
		return count;
		
	}
}
