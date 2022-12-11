package konyalı;

import java.util.Scanner;

public class orn5
{

	public static void main(String[] args) 
	{
		System.out.println("\t\t\tBIR SAYININ FAKTORIYELINI HESAPLAYAN PROGRAM");
		int faktoriyel=1;
		Scanner border=new Scanner(System.in);
		System.out.print("\nBir sayi giriniz:");
		int sayi=border.nextInt();
		for (int i = 1; i <=sayi; i++) 
		{
			faktoriyel=faktoriyel*i;  
		}
		System.out.print(sayi+"!= "+faktoriyel);

	}

}
