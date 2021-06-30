package 문제풀이;

import java.util.Scanner;

public class 콘솔입력스캐너3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 입력(자바,c,파이썬)>>");
		
		String data = sc.next();
		
		if(data.equals("자바")) {
			System.out.println("JSP점프!!");
		}else if(data.equals("c++")) {
		System.out.println("ASP점프!");		
		}else {
			System.out.println("python으로 점프!!");
		}
		
		switch (data) {
		case "자바":
			System.out.println("JSP점프!!");
			break;
			
		case "c++":
			System.out.println("ASP점프!");
			break;	
			
		default:
			System.out.println("python으로 점프!!");
			break;
		}
		
		
		
	}

}
