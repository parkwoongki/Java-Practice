package Prob10;

abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];

	abstract String get(String key);

	abstract void put(String key, String value);

	abstract String delete(String key);

	abstract int length();
}

class Dictionary extends PairMap {
	private int length, count;

	public Dictionary(int length) {
		// TODO Auto-generated constructor stub
		this.count = 0;
		this.length = length;
		keyArray = new String[length];
		valueArray = new String[length];
	}

	@Override
	String get(String key) {
		// TODO Auto-generated method stub
		int i = 0;
		for (i = 0; i < count; i++) {
			if (key.equals(keyArray[i]))
				return valueArray[i];
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		// TODO Auto-generated method stub
		int i = 0;
		for (i = 0; i < count; i++) {
			if (key.equals(keyArray[i]))
				valueArray[i] = value;
		}
		if (i == count++) {
			keyArray[i] = key;
			valueArray[i] = value;
		}
	}

	@Override
	String delete(String key) {
		// TODO Auto-generated method stub
		int i = 0;
		String delete_value = null;

		for (i = 0; i < count; i++) {
			if (key.equals(keyArray[i])) {
				delete_value = valueArray[i];
				valueArray[i] = null;
				break;
			}
		}

		return delete_value;
	}

	@Override
	int length() {
		// TODO Auto-generated method stub
		return this.count;
	}

}

public class Prob10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");

		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	}

}
