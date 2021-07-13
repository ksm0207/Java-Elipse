package Test;

public class Gugudan {

	public static void main(String[] args) {
		
		System.out.println("Java Run");
		System.out.println("=====================================");
		for (int i = 2 ; i < 10 ; i ++) {
			
					System.out.println(i + " 단 ");
					System.out.println();
			for (int j = 1 ; j < 10 ; j ++) {
				
				System.out.print(i + " * " + j + " = " + i * j + "\n");
			}
			System.out.println();
			System.out.println("=====================================");
		}
		System.out.print("Normal Termination");

	}

}
