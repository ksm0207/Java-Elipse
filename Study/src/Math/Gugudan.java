package Math;

import java.util.Scanner;

public class Gugudan {
	
	int N = 0;

	public void Result(int N) {
		
		System.out.print(N + " 단 을 출력합니다.\n");
		for (int i = 1 ; i < 10 ; i ++) {
			System.out.print(N + " x " + i + " = " + N * i +"\n");
//			for (int j = 1 ; j < 10 ; j ++ ) {
			// Not Input
//				
//				System.out.print(i + " x " + j + " = " + (i * j) +"\n");
//			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Gugudan gd = new Gugudan();
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단 시작 : ");
		int setValue = scan.nextInt();
		gd.Result(setValue);
	}

}
