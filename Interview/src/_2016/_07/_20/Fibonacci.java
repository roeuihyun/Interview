package _2016._07._20;

/**
 * Main 메소드가 실행되어 출력될 숫자를 작성해 주세요. 
 * 부분 점수 없음.
 */
class Fibonacci {
	public long fibonacci(int num) {
		if (num <= 1) {
			return num;
		}
		return fibonacci(num-1) + fibonacci(num-2);

    }

  // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		System.out.println(c.fibonacci(7));
	}
}
