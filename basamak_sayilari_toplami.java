package basamak_sayilari_toplami;

import java.util.Scanner;

public class basamak_sayilari_toplami {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayı girin: ");
		int sayi = scan.nextInt();
		
		int sonuc = 0;
	
		
		while(sayi != 0) {
			sonuc += sayi % 10; 
			sayi/=10;
		}
		
		System.out.println(sonuc);
			
		}
		
	}


