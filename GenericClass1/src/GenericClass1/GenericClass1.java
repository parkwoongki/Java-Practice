package GenericClass1;

class GStack<T>{
	int tos;
	Object [] stck;
	public GStack() {
		// TODO Auto-generated constructor stub
		tos =0;
		stck = new Object[10];
	}
	public void push(T item){
		if(tos==10)
			return;
		stck[tos]=item;
		tos++;
	}
	public T pop(){
		if(tos==0)
			return null;
		tos--;
		return (T)stck[tos];
	}
}

public class GenericClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<String> stringStack = new GStack<String>();
		
		stringStack.push("Seoul");
		stringStack.push("Busan");
		stringStack.push("LA");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(stringStack.pop());
		}
		
		GStack<Integer> intStack = new GStack<Integer>();

		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(intStack.pop());
		}
	}

}
