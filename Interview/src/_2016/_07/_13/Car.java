package _2016._07._13;

/**
 * Main 메소드가 실행되어 출력될 결과를 서술하세요. 
 * % 연산자는 좌측의 수를 우측의 수로 나눈 나머지 값 입니다. 
 * 부분 점수 있음.
 */
public class Car {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (((i % 3) == 0) && ((i % 5) == 0)) {
				System.out.print("뛰뛰빵빵");
			} else if ((i % 3) == 0) {
				System.out.print("뛰뛰");
			} else if ((i % 5) == 0) {
				System.out.print("빵빵");
			} else {
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}
}
