package asalSayi;

public class Main {
	 public static void main(String[] args) {
	        int number = 1;
	        boolean isPrime = true;
	        if (number == 1) {
	            System.out.println("Sayı asal değildir.");
	        }

	        if (number < 1) {
	            System.out.println("Geçersiz sayı.");
	        }

	        if (number > 1) {
	            for (int i = 2; i < number; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                }
	            }
	            System.out.println("Asal sayı mı? " + isPrime);
	        }
	    }

}
