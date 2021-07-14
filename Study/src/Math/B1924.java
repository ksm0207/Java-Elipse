package Math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1924 {
	public static void main(String[] args) throws Exception {
		
		int month [] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine() , " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		
		for (int i = 1 ; i < x ; i ++) {
			sum += month[i];
			System.out.println("month[i] = " +month[i]);
			System.out.println("sum = "+sum);
		}
		sum =  y;
	
		
		switch (sum % 7) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		}
	}

}
