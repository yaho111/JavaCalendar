package calendar;

import java.util.Scanner;

public class CalendarMethod {
	
	// 배열에 달 별 일수 저장
	private static final int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	// 입력받은 달의 일수를 돌려주는 메소드
	public int getDaysOfMonth(int month) {
		
		return days[month-1];
	}
	
	// 돌려받은 값을 출력
	public void printSampleCalendar() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	// Main 메소드
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		CalendarMethod cal = new CalendarMethod();
		int month = sc.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다.\n\n", month, cal.getDaysOfMonth(month));
		sc.close();
		
//		cal.printSampleCalendar();
	}

}
