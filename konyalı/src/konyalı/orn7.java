package konyalı;

import java.util.Scanner;

public class orn7 
{

	public static void main(String[] args) 
	{
		System.out.println("\t\t\tBIR SAYININ TEK , CIFT OLDUGUNU BULAN PROGRAM");
		Scanner sc=new Scanner(System.in);
		System.out.print("\nBir sayi giriniz:");
		int sayi=sc.nextInt();
		if(sayi%2==0)
		{
			System.out.println("Girilen sayi cifttir.");
		}
		else if(sayi%2==1)
		{
			System.out.println("Girilen sayi tekttir.");
		}
		

	}

}
