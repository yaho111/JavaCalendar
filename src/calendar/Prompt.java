package calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal> ";
	
	public void runPrompth() {
		Scanner sc = new Scanner(System.in);		
		CalendarPrint1 cal = new CalendarPrint1();
		
		int month = 1;
		
		while(true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = sc.nextInt();
			if(month == -1) {
				break;
			}
			
			if(month > 12) {
				continue;
			}
			cal.printCalendar(2022, month);
		}
		
		System.out.println("종료되었습니다.");
		
		sc.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompth();
		
	}

}
