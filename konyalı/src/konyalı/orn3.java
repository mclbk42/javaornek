package konyalı;

import java.util.Scanner;

public class orn3 
{

	public static void main(String[] args)
	{	
		System.out.println("\t\t\tBEDEN KITLE ENDEKSINE GORE KILOMUZU ARASTIRAN PROGRAM");
		// Erkekler icin BKİ>=25 ise kilolu BKİ<25 ise kilolu degildir.
		// Bayanlar icin BKİ>=23 ise kilolu BKİ<23 ise kilolu degildir.
		// BKİ=kilo/boy*boy (kg/m^2) ile hesaplanir.
		Scanner border3=new Scanner(System.in);
		System.out.print("\nCinsiyetinizi giriniz. \nErkek icin (1) 'e kadin icin (2) 'ye basiniz:");
		int secim=border3.nextInt();
		if(secim==1)
		{
			System.out.print("Kilonuzu (kg) giriniz:");
			double kilo=border3.nextDouble();
			System.out.print("Boyunuzu (m) giriniz:");
			double boy=border3.nextDouble();
			boy=boy/100;
			double BedenKitleEndeksi=kilo/(boy*boy);
			if(BedenKitleEndeksi>=25) 
			{
				System.out.println("Ortalama Gore Kilolusunuz");
			}
			else if (BedenKitleEndeksi<25)
			{
				System.out.println("Ortalamaya Gore Kilolu Degilsiniz");
			}
		
		
		}
		else if(secim==2)
		{
			System.out.print("Kilonuzu (kg) giriniz:");
			double kilo=border3.nextDouble();
			System.out.print("Boyunuzu (m) giriniz:");
			double boy=border3.nextDouble();
			boy=boy/100;
			double BedenKitleEndeksi=kilo/(boy*boy);
			if(BedenKitleEndeksi>=23) 
			{
				System.out.println("Ortalama Gore Kilolusunuz");
			}
			else if(BedenKitleEndeksi<23)
			{
				System.out.println("Ortalamaya Gore Kilolu Degilsiniz.");
			}
			
		}
		else
		{
			System.out.println("Yanlis tusa bastiniz. \nProgrami yeniden baslatip 1 veya 2 ' ye basiniz.Yeniden baslatma kısayolu icin (F11) ' e basin.");
		}
		
		 

	}

}
