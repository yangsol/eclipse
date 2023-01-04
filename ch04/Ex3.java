package ch04;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//입력한 1~20사이의 숫자중에 3, 6, 9인지를 판단하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. ");
		int a = sc.nextInt();
		
		if (a<=10)	{
			if(a%9 == 0)	{
				System.out.println("짝");
			}else if(a%6 == 0)	{
				System.out.println("짝");
			}else if(a % 3 == 0) {
				System.out.println("짝");
			}else {
				System.out.println(a);
			}
		}
		else if(a<= 20)	{
			int a1 = a-10;
			if(a1%9 == 0)	{
				System.out.println("짝");
			}else if(a1%6 == 0)	{
				System.out.println("짝");
			}else if(a1 % 3 == 0) {
				System.out.println("짝");
			}else {
				System.out.println(a);
			}
					
		}
			
		}

}
