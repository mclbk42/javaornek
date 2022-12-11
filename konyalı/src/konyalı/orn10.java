package konyalı;

import java.util.Scanner;

public class orn10 
{

	public static void main(String[] args) 
	{
		 System.out.println("\t\t\tKULLANCII TARAFINDAN GIRILEN SAYI KADAR FIBONACCI DIZISI YAZDIRAN PROGRAM");
		 Scanner scan=new Scanner(System.in);
	     int s1=0,s2=1,toplam;
	     System.out.print("\nBir sayı giriniz:");
	     int sayi=scan.nextInt();
	     for(int i=1;i<=sayi;i++) {
	    	 System.out.print(+s1+",");
	    	 toplam=s1+s2;
	    	 s1=s2;
	    	 s2=toplam;
	     }

	}

}
