package Prob11;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Prob11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		String tmp = "";
		Scanner scanner = new Scanner(System.in);
		Vector<String> phoneV = new Vector<>();

		try {
			FileReader fin = new FileReader("words.txt");

			while ((c = fin.read()) != -1) {
				tmp += (char) c;
				if ((char) c == '\n') {
					phoneV.add(tmp);
					tmp = "";
				}
			}

			fin.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}

		while (true) {
			System.out.print("�ܾ�>>");
			String word = scanner.next();
			if (word.equals("�׸�")){
				System.out.println("�����մϴ�...");
				break;}
			Iterator<String> it = phoneV.iterator();
			try {
				while (it.hasNext()) {

					String count = "";
					String tmpWord = it.next();
					for (int i = 0; i < word.length(); i++) {
						if (word.charAt(i) == tmpWord.charAt(i))
							count += word.charAt(i);
					}
					if (count.equals(word))
						System.out.print(tmpWord);

				}
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("�߰��� �� ����");
			}
		}

		scanner.close();
	}
}