package test;

public class TypeConversion {

	public static void main(String[] args) {
		int i;
		double f;
		
		f = 1/5;	// 정수 연산 
		System.out.println(f);
		
		f = (double)1/5;	// 1이 1.0으로 바뀐다 
		System.out.println(f);
		
		i = (int)1.7 + (int)1.8;	// 1+1로 계산된다 
		System.out.println(i);
	}

}
