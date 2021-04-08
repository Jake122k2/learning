package program;

public class program {

	public static void main(String[] args) {
		
		int [] numbers = {420, 69, 35, 79, 45, 7, 12, 3, 8, 1, 4, 180};
		
		//Zad1 (Co dwie liczby)
		
		for (int i = 0; i < numbers.length - 1; i = i + 2) {
			System.out.println(numbers[i]);
		}
		
		//Zad 2 (liczby parzyste)
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) { 		//ten % znalazłem w internecie ale nwm co to jest.	
			System.out.println(numbers[i]);	
			}
		}

}
}
