package konyalı;

import java.util.Scanner;

public class orn6 
{

	public static void main(String[] args)
	{
		System.out.println("\t\t\t1 ' DEN n ' ye KADAR OLAN SAYILARIN TOPLAMINI BULAN PROGRAM");
		int toplam=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nBir sayi (n) giriniz:");
		int sayi=sc.nextInt();
		for (int i = 1; i <=sayi ; i++) 
		{
			toplam=toplam+i;
		}
		System.out.println("TOPLAM = "+toplam);

	}

}
