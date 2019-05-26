package Prob08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Prob08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> clientMap = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("이름과 포인트 입력>> ");
			String name = scanner.next();
			if (name.equals("그만"))
				break;
			int point = scanner.nextInt();

			if (!clientMap.containsKey(name))
				clientMap.put(name, point);
			else
				clientMap.put(name, point + clientMap.get(name));

			Set<String> keys = clientMap.keySet();
			Iterator<String> it = keys.iterator();

			while (it.hasNext()) {
				name = it.next();
				System.out.print("(" + name + "," + clientMap.get(name) + ")");
			}
			System.out.println();
		}

		scanner.close();
	}

}
