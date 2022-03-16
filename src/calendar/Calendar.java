package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		// 숫자를 입력받아 해당하는 달의 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		
		int month = scanner.nextInt();
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println(month+"월은 "+days[month-1]+"일까지 있습니다.");
//		System.out.printf("%d월은 %d일까지 있습니다.", month, days[month-1]);
		
		scanner.close();
	}
	
}
