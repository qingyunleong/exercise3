
public class Exercise3 {

	public static void main(String[] args) {
		
		double average;
		int lowerbound=1;
		int upperbound=100;
		
		//FOR LOOP
		System.out.println("For Loop");
		int sum1 = 0;
		
			for(int number1 = lowerbound; number1 <= upperbound; number1++) {
				sum1 = sum1+number1;
			
			} 
			average = sum1/100.00;
		
		System.out.println("The sum of 1 to 100 is " + sum1);
		System.out.println("The average is " + average);
		System.out.println();

		//WHILE LOOP
		System.out.println("While Loop");
		int sum2 = 0;
		
		int number2 = lowerbound;
		while(number2 <= upperbound) {
			sum2 = sum2 + number2;
			number2++;
		}
		average = sum2/100.00;
		
		System.out.println("The sum of 1 to 100 is " + sum2);
		System.out.println("The average is " + average);
		System.out.println();
		
		//DO WHILE LOOP
		System.out.println("Do While Loop");
		int sum3 = 0;
		
		int number3 = lowerbound;
		do {
			sum3 = sum3 + number3;
			number3++;
		}while(number3 <= upperbound);
		average = sum3/100.00;
		
		System.out.println("The sum of 1 to 100 is " + sum3);
		System.out.println("The average is " + average);
		System.out.println();
		
	}

}