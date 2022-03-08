package enumTest;

public class EnumTest {
	public static void main(String args[]) {
		System.out.println(Number.ZERO);	
		for(Number n : Number.values()) {
			System.out.println("Number="+n.value+",Square="+n.square+"Cube"+n.cube);
		}
	}
}

enum Number {
	ZERO(0),ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),EIGHT(8),NINE(9);
	
	int value;
	int square;
	int cube;
	
	Number(int num){
		this.value=num;
		this.square=num*num;
		this.cube=num*num*num;
	}
}