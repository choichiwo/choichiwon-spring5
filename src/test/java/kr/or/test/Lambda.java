package kr.or.test;

import java.util.function.IntSupplier;

/**
 * 이 클래스는 람다식(애로우메서드)을 테스트하는 클래스입니다.
 * @author 최치원
 *
 */
public class Lambda {

	//스테틱메서드1. 이클래스를 커파일하면 실행하면, 메모리에 등록되는 메서드를 말합니다.
	//스태틱을 지정하지 않으면, 런타임시(호출) 메모리에 등록이 됨.
	//스태틱 메서드 의미2. 이클래스에서만 메서드로 사용하겠다고 명시.(상속주거나 받거나 하지X)
	public static int plus(int x, int y, String lambda) {
		int result = 0;
		//람다식 적용전
		if(lambda.equals("nonLambda")) {
			IntSupplier intSupplier = new IntSupplier() {
				@Override
				public int getAsInt() {
					int sum = x + y;
					return sum;
				}	
			};
			result = intSupplier.getAsInt();
		}
		//람다식 적용
		if(lambda.equals("lambda")) {
			
		}
		return result;
	}
	public static void main(String[] args) {
		// plus메서드를 호츨\
		System.out.println("람다식 적용전 메서드 결과: " + plus(3, 4, "nonLambda"));
	}
}
