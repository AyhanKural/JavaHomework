package recapDemo1;

public class Main {
	
	public static void main(String[] args) {
        int sayi1 = 20, sayi2 = 25, sayi3 = 2;
        int enBuyuk = sayi1;
        if (enBuyuk < sayi2) {
            enBuyuk = sayi3;
            System.out.println("En Buyuk Sayi: " + enBuyuk);

        } else if (enBuyuk < sayi3) {
        	enBuyuk = sayi3;
            System.out.println("En Buyuk Sayi: " + enBuyuk);

        } else {
        	enBuyuk = sayi1;
            System.out.println("En Buyuk Sayi: " + enBuyuk);
        }

    }

}
