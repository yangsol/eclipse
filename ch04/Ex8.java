package ch04;

public class Ex8 {

	public static void main(String[] args) {
		//문제1. 1~30사이의 값중에 3의 배수의 합을 구하시오.
		int sum = 0;
		for(int i = 0; i < 31; i++) {
			if(i %3 == 0) {
			sum = sum + i;
			}
		}
		System.out.println("1~30사이의 값중 3의 배수의 합은 : " + sum);
		
						
				//문제2. 1~30사이의 값중에 짝수와 홀수의 합을 각각 구하시오.
	
		int holl = 0;
		int jjak = 0;	
		for(int j = 0; j < 31; j++ )	{
			if (j % 2 == 1) {	
				holl = holl + j;				
			} else {
				jjak = jjak + j;
			}		
		}
		System.out.println("홀수의 합 = " + holl);
		System.out.println("짝수의 합 = " + jjak);
				
				/*문제3. 1~50사이의 3,6,9의 합은?
				Hint : %와 /를 사용. 33/10 => 3
				sum : 627*/
		
	int total = 0;
	for(int k = 0; k < 51; k++)	{
		int m = k%10;
		if(m%3 ==0)	{
			total = total + k;
		}
	}
	System.out.println("문제3, 합은: " + total);

	}
}
