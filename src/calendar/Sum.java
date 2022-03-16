package calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// 문제: 두 수를 입력받고 합을 구하기
		// 1) 입력: 키보드로 두 수의 입력을 받는다.
		// 2) 출력: 화면에 두 수의 합을 출력한다.
		
// 1. next()로 값을 받고 int형으로 형변환		
//		System.out.println("두 수를 입력하세요.");
//		int a, b, sum;
//		String s1, s2;
//		Scanner scanner = new Scanner(System.in);
//		s1 = scanner.next();
//		s2 = scanner.next();
//		System.out.println("입력한 두 수는 "+s1+", "+s2+"입니다.");
//		a = Integer.parseInt(s1);
//		b = Integer.parseInt(s2);
//		sum = a + b;
//		System.out.println("입력하신 두 수의 합은 \""+sum+"\"입니다.");
		
// 2. nextInt()로 받아서 int형 변수에 바로 저장		
		// 입력
		System.out.println("두 수를 입력하세요.");
		int a, b, sum;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a + b;
		
		// 출력
		System.out.println("입력하신 두 수의 합은 \""+sum+"\"입니다.");
//		System.out.printf("두 수의 합은 %d입니다.", a+b);
//		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a+b);
		
		sc.close();
	}

}
