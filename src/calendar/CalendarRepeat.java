package calendar;

import java.util.Scanner;

public class CalendarRepeat {

	public static void main(String[] args) {
	
		System.out.println("반복할 횟수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		
		CalendarMethod cal = new CalendarMethod();
		
		for(int i=0; i < repeat; i++) {
			System.out.println("달을 입력하세요.");
			int month = sc.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다.\n\n", month, cal.getDaysOfMonth(month));
		}
		
		System.out.println("종료되었습니다.");
		
		sc.close();

	}

}
