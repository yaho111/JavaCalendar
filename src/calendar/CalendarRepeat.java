package calendar;

import java.util.Scanner;

public class CalendarRepeat {

	public static void main(String[] args) {
	
		// 숫자를 입력받아 해당하는 달의 일수를 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		String prompt = "cal> ";		
		CalendarMethod cal = new CalendarMethod();
		
		int month = 1;
		while(true) {
			System.out.println("달을 입력하세요.");
			System.out.print(prompt);
			month = sc.nextInt();
			if(month == -1) {
				break;
			}
			
			if(month > 12) {
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다.\n\n", month, cal.getDaysOfMonth(month));
		}
		
		System.out.println("종료되었습니다.");
		
		sc.close();

	}

}
