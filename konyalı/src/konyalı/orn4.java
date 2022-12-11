package konyalı;

import java.util.Scanner;

public class orn4 {

	public static void main(String[] args) 
	{
		System.out.println("\t\t\t IKI SAYIYA GORE HESAP MAKINESI");
		Scanner giris=new Scanner(System.in);
		System.out.print("\nBirinci sayiyi giriniz:");
		double sayi1=giris.nextDouble();
		System.out.print("Ikinci sayiyi giriniz:");
		double sayi2=giris.nextDouble();
		System.out.print("Hangi islemi yapmak istiyorsunuz. \nToplama icin (1) , Cikarma icin (2) , Carpma icin (3) , Bolme icin (4) ' e basiniz:");
		int secim=giris.nextInt();
		double toplam=sayi1+sayi2 , fark=sayi1-sayi2 , carp=sayi1*sayi2 , bol=sayi1/sayi2;
		if (secim==1) 
		{
			System.out.println("sayi1+sayi2= "+toplam);
		}
		else if(secim==2)
		{
			System.out.println("sayi-sayi2= "+fark);
		}
		else if(secim==3)
		{
			System.out.println("sayi*sayi2= "+carp);
		}
		else if(secim==4)
		{
			System.out.println("sayi/sayi2= "+bol);
		}
		else
		{
			System.out.println("Yanlis tusa bastiniz. \nProgrami yeniden baslatip istenilen tuslara basiniz.Yeniden baslatma kısayolu icin (F11) ' e basin.");
		}
	}

}
