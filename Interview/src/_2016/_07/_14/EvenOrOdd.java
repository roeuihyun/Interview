package _2016._07._14;

/**
 * Main 메소드가 실행되어 출력될 결과를 Even,Odd로 총 2개를 적어주세요. 
 * 부분 점수 있음.
 */
public class EvenOrOdd {
	
    String evenOrOdd(int num) {
			return ((num & 1) == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
    }
}