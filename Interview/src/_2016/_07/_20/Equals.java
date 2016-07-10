package _2016._07._20;

/**
 * Main 메소드가 실행되어 출력될 결과를 true,false로 총 4개를 적어주세요. 
 * 부분 점수 있음.
 */
public class Equals {
	public static void main(String[] args) {
		String str1 = "AAA";
		String str2 = "AAA";
		String str3 = new String("AAA");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}
}