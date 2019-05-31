package Prob02;

import java.io.FileReader;
import java.io.IOException;

public class Prob02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c = 0;

		try {
			fin = new FileReader("c:\\Temp\\phone.txt");

			while ((c = fin.read()) != -1)
				System.out.print((char)c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("입출력 오류");
		}
	}

}
