package ch02_4;

public class equalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 100;
		
		
		// num1이 100과 같은지 if문으로 작성
		if(num1 == num2) { // if 조건 : 들여쓰기
			System.out.println("num1은 100입니다");
			System.out.println("num2은 100입니다");
		}
		
		
		String str1 = "korea";
		String str2 = new String("korea");
		
//		System.out.println(str1);
//		System.out.println(str1);
		
		
		if (str1.equals(str2)) { // equals 문자열의 내용만 비교
			// 일반 변수는 == 로 같은지 비교하고, 문자열을 비교할 때는 .equals() 매서드를 사용해라!
			System.out.println("equals 비교: str1은 korea 입니다!");
			
		}
		
		if (str1 == str2) { // == 연산자는 주소를 비교
			System.out.println("== 비교 : str1과 str2은 korea입니다!");
			
			
		}
		
		
		
	}

}
