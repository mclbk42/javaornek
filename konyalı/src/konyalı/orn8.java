package konyalı;

import java.util.Scanner;

public class orn8 
{

	public static void main(String[] args) 
	{
		System.out.println("\t\t\tKULLANICIYA GORE DAIRENIN CEVRESINI ALANINI HESAPLAYAN PROGRAM");
		Scanner giris=new Scanner(System.in);
		System.out.print("\nYaricap giriniz:");
		double r=giris.nextDouble();
		final double pisayisi=3.14;
		System.out.print("Dairenin neyini ogrenmek istiyorsunuz.\nCevre icin (1) ' e , Alan icin(2) 'ye basiniz: ");
		int secim=giris.nextInt();
		if(secim==1)
		{
			double cevre=2*pisayisi*r;
			System.out.print(r+" yaricapli dairenin cevresi "+cevre+" dir.");
		}
		else if(secim==2)
		{
			double alan=pisayisi*r*r;
			System.out.print(r+" yaricapli dairenin alani "+alan+" dir.");
		}
		else
		{
			System.out.println("Yanlis tusa bastiniz. \nProgrami yeniden baslatip istenilen tuslara basiniz.Yeniden baslatma kısayolu icin (F11) ' e basin.");
		}

	}

}
