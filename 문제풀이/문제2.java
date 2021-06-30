package 문제풀이;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		// 입력값 3개
		//안정성 점수(30%)
		//속도 점수(50%)
		//연비 점수(20%)
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("안정성 점수를 입력하세요(30%) >>");
		int data1 = sc.nextInt(); 
		Double data11 = data1 * 0.3;
		//System.out.println(data11);
		
		System.out.print("속도 점수를 입력하세요(50%) >>");
		int data2 = sc.nextInt();
		Double data22 = data2 * 0.5;
		//System.out.println(data22);
		
		System.out.print("연비 점수를 입력하세요(20%) >>");
		int data3 = sc.nextInt();
		Double data33 = data3 * 0.2;
		//System.out.println(data33);
		
		Double result = data11 + data22 + data33;
		System.out.println(result + "점입니다.");
		
		System.out.println("==========================");
		
		if (90 <= result) {
			System.out.println("최우수입니다");
		}else if(80 <= result) {
			System.out.println("우수입니다");
		}else if(70 <= result){
			System.out.println("보통입니다");
		}else
			System.out.println("미달입니다");
		
	}

}
