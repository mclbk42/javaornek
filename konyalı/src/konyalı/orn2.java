package konyalı;

import java.util.Scanner;

public class orn2 {

	public static void main(String[] args) 
	{
		System.out.println("\t\t\tDIK UCGENIN KENARLARINI BULAN PROGRAM");
		Scanner border2=new Scanner(System.in);
		System.out.print("\nHangi kenarı ogrenmek istiyorsunuz? \na icin ('1') ' e  b icin ('2') ' ye  c(hipotenus) icin ('3') ' e basiniz: ");
		int secim=border2.nextInt();
		if (secim==1) 
		{	
			System.out.print("c ' yi giriniz:");
			double c=border2.nextDouble();
			System.out.print("b ' yi giriniz:");
			double b=border2.nextDouble();
			double a=Math.pow( (c*c)-(b*b) , 0.5);
			System.out.print("a kenarinin degeri: "+a);
		}
		else if(secim==2)
		{
			System.out.print("a ' yi giriniz:");
			double a=border2.nextDouble();
			System.out.print("c ' yi giriniz:");
			double c=border2.nextDouble();
			double b=Math.pow( (c*c)-(a*a) , 0.5);
			System.out.print("b kenarinin degeri: "+b);
		}
		else if(secim==3)
		{
			System.out.print("a ' yi giriniz:");
			double a=border2.nextDouble();
			System.out.print("b ' yi giriniz:");
			double b=border2.nextDouble();
			double c=Math.pow( (a*a)+(b*b) , 0.5);
			System.out.print("c (hipotenüs) kenarinin degeri: "+c);
		}
		else
		{
			System.out.println("Yanlis tusa bastiniz. Lutfen programi tekrar baslatip 1 ile 3 arasinda deger giriniz.Yeniden baslatma kısayolu icin (F11) ' e basin.");
		}
	}

}
