package konyalı;

import java.util.Scanner;

public class orn9 
{

	public static void main(String[] args)
	{
		System.out.println("\t\t\tKLAVYEDEN GIRILEN SAYININ POZITIF , NEGATIF VEYA NOTR OLDUGUNU BULAN PROGRAM");
		Scanner sc=new Scanner(System.in);
		System.out.print("\nBir sayi giriniz:");
		int sayi=sc.nextInt();
		if(sayi>0)
		{
			System.out.println("Girilen sayi pozitiftir.");
		}
		else if(sayi<0)
		{
			System.out.println("Girilen sayi negatiftir.");
		}
		else
		{
			System.out.println("Girilen sayi notrdur.");
		}
	}

}
