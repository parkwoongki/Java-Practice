package Prob06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location {
	private String name;
	private String latitude;
	private String longitude;

	public Location(String name, String latitude, String longitude) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public String getName() {
		return this.name;
	}
}

public class Prob06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Location> l = new HashMap<String, Location>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("����, �浵, ������ �Է��ϼ���.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String str = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(str, ", ");
			str = st.nextToken();
			l.put(str, new Location(str, st.nextToken(), st.nextToken()));
		}

		Set<String> keys = l.keySet();
		Iterator<String> it = keys.iterator();

		System.out.println("------------------------");
		while (it.hasNext()) {
			Location lc = l.get(it.next());
			System.out.print(lc.getName() + "\t");
			System.out.print(lc.getLatitude() + "\t");
			System.out.println(lc.getLongitude());
		}

		System.out.println("------------------------");
		while (true) {
			System.out.print("���� �̸� >> ");
			String name = scanner.next();
			if (name.equals("�׸�"))
				break;

			if (!l.containsKey(name)) {
				System.out.println(name + "��(��) �����ϴ�.");
				continue;
			}

			Location lc = l.get(name);
			System.out.print(lc.getName() + "\t");
			System.out.print(lc.getLatitude() + "\t");
			System.out.println(lc.getLongitude());
		}

		scanner.close();
	}

}