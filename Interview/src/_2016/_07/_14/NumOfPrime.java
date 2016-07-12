package _2016._07._14;

/**
 * Main 메소드가 실행되어 출력될 숫자를 작성해 주세요. 
 * 부분 점수 없음.
 */
class NumOfPrime {
	int numberOfPrime(int n) {
		int result = 0;
		int sqrt = 0;
		for (int i = 2; i <= n; i++) {
			sqrt = (int) Math.sqrt(i);
			for (int j = 2; j <= i; j++) {
				if (sqrt < j) {
					result += 1;
					break;
				} else {
					if (i % j == 0) {
						break;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println(prime.numberOfPrime(20));
	}

}