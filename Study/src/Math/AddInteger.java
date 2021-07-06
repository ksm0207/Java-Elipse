package Math;

import java.util.Scanner;

public class AddInteger {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		int firstValue = 0 , secondValue = 0;
		int check = 0;
		boolean checkValue = false;
		
	
		while(true) {
			try {
				if (firstValue == secondValue) {
					checkValue = true;
					check ++;
					
					if (check == 1) {
						System.out.print("Plus\n");
						System.out.print("First Number : ");
						firstValue = scan.nextInt();
						System.out.print("Second Number : ");
						secondValue = scan.nextInt();	
						System.out.print("Result = " + cal.addSum(firstValue, secondValue) + "\n");
						check ++;
					}
					if (check == 2) {
						System.out.print("Minus\n");
						System.out.print("First Number : ");
						firstValue = scan.nextInt();
						System.out.print("Second Number : ");
						secondValue = scan.nextInt();	
						System.out.print("Result = " + cal.miuSum(firstValue, secondValue) + "\n");
						check ++;
					}
					if (check == 3) {
						System.out.print("Multiplication\n");
						System.out.print("First Number : ");
						firstValue = scan.nextInt();
						System.out.print("Second Number : ");
						secondValue = scan.nextInt();	
						System.out.print("Result = " + cal.mulSum(firstValue, secondValue) + "\n");
						check ++;
					}
					if (check == 4) {
						System.out.print("division\n");
						System.out.print("First Number : ");
						firstValue = scan.nextInt();
						System.out.print("Second Number : ");
						secondValue = scan.nextInt();	
						System.out.print("Result = " + cal.divSum(firstValue, secondValue) + "\n");
						check ++;
					}else {
						if (check == 5) {
							check = 1;
							continue;
						}
					}
					
				}
				
			} catch (Exception e) {
				e.getMessage().getClass();
			}
		}
		
		
		
	}
}
class Calculator {
	int x = 0;
	int y = 0;
	
	public int addSum(int x , int y) {
		this.x = x;
		this.y = y;

		return this.x + this.y;
	}
	public int miuSum(int x , int y) {
		this.x = x;
		this.y = y;
		
		return this.x - this.y;
	}
	
	public int mulSum(int x , int y) {
		this.x = x;
		this.y = y;
		
		return this.x * this.y;
	}
	public int divSum(int x , int y) {
		this.x = x;
		this.y = y;
		
		return this.x / this.y;
	}
}
