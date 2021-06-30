package SuperExample;

public class Child extends Parent{
	
	String gender = "";
	
	public Child(String name, int age, int favNum , String gender) {
		super(name, age, favNum);
		this.gender = gender;
	}
	
	Child() {
		this("",0,0,"");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + name + "\n나이 :  " + age + "\n좋아하는 숫자 :  "+favNum + "\n성별 :  " + gender;
	}	
}
