package javaDemos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");

		// variables, camel casing, reusability
		int oglenciSayisi = 11;
		String mesaj = "Öðrenci sayýsý";
		System.out.println(mesaj + ":" + oglenciSayisi);

		/*
		 * double sayi = 12.5; sayi = -129;
		 */
		char karakter = 'A';

		boolean dogruMu = false;

		// if-else
		int sayi = 24;
		if (sayi < 20) {
			System.out.println("Sayý 20'den küçüktür.");
		} else if (sayi == 20) {
			System.out.println("Sayý 20'ye eþittir.");
		} else {
			System.out.println("Sayý 20'den büyüktür.");
		}

		// find biggest number using if-else block
		int sayi1 = 24;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyuk = sayi1;
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}

		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}

		System.out.println("En büyük = " + enBuyuk);

		// switch-case
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'F':
			System.out.println("Kaldýnýz");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

		// for
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		int i = 1;
		// while
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		// do-while
		do {
			System.out.println(i);
			i++;
		} while (i < 20);

		// arrays
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Ali";
		ogrenciler[1] = "Erdem";
		ogrenciler[2] = "Salih";

		for (int j = 0; j < ogrenciler.length; j++) {
			System.out.println(ogrenciler[j]);
		}

		// foreach
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

		double[] myList = { 1.2, 1.3, 1.4, 1.5 };
		double total = 0;
		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}

		System.out.println("Toplam : " + total);
		System.out.println("En büyük : " + max);
		
		//multi dimentional array
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakýr";
		sehirler[2][1] = "Þanlýurfa";
		sehirler[2][2] = "Gaziantep";
		
		//nested loop
		for (int n = 0; n<=2; n++) {
			for(int o=0; o<=2; o++) {
				System.out.println(sehirler[n][o]);
			}			
		}
		
		//Strings ~ char array
		String mesaj1 = "What is the weather like in your city?";
		System.out.println("Eleman sayýsý :" + mesaj1.length());
		System.out.println("6. eleman :" + mesaj1.charAt(5));
		System.out.println(mesaj1.concat(" heyy"));
		System.out.println(mesaj1.startsWith("W"));
		System.out.println(mesaj1.endsWith("O"));
		char[] karakterler = new char[5];
		mesaj1.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj1.indexOf('w'));
		System.out.println(mesaj1.lastIndexOf('?'));
		String yenimesaj = mesaj1.replace(' ', '-');
		System.out.println(yenimesaj);
		System.out.println(mesaj1.substring(2,9));
		
		for (String kelime : mesaj1.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj1.toLowerCase());
		System.out.println(mesaj1.toUpperCase());
		
		System.out.println(mesaj1.trim());
		
		//Prime?
		int number3 = 23;
		int remainder = number3 % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		
		if (number3== 1) {
			System.out.println("Geçersiz sayý");
			return;
		}
		
		for (int k = 2; k < number3; k++) {
			if (number3 % k ==0 ) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println("The number is a prime number");
		}else {
			System.out.println("The number is not a prime number");
		}
		
		//kalýn ve ince sesli harf
		char harf = 'E';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		{			
			System.out.println("Kalýn sesli harf");
			break;
		}
		default:
			System.out.println("ince sesli harf");
		}
		
		//Mükemmel sayý 6,28
		int number4 = 6;
		int total3 = 0;
		for (int p = 1; p < number4; p++) {
			if (number4 % p == 0) {
				total3 = total3 + p;
			}
		}
		
		if (total3 == number4) {
			System.out.println("mükemmel sayýdýr.");
		}

		

	}

}
