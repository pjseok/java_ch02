package ch02_4;

import java.io.IOException;

public class input_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int keycode = System.in.read();
			System.out.println(keycode);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
//		if (10>100) {
//			int a = 100;
//			System.out.println(a);
//		}
		
		
		
	}

}
