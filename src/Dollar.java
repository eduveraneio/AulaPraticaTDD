
public class Dollar extends Money {

	Dollar(int amount, String currency) {
		super(amount, currency);
	}

	Money times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hellow World!");
	}
}
