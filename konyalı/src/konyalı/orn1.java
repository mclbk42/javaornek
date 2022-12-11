package konyalı;

import java.util.Scanner;

public class orn1 {

	public static void main(String[] args) 
	{
		System.out.println("\t\t\tIKINCI DERECEDEN DENKLEMIN KOKLERINI BULMA");
		System.out.println("\nDENKLEM TIPI:ax^2+bx+c=0 seklindedir. ");
		Scanner border1=new Scanner (System.in);
		System.out.print("x^2 ' nin onundeki katsayiyi (a) giriniz:");
		double a=border1.nextDouble();
		System.out.print("x ' in onundeki katsayiyi (b) giriniz:");
		double b=border1.nextDouble();
		System.out.print("Sabit sayiyi (c) ' yi giriniz:");
		double c=border1.nextDouble();
		final double delta=(b*b)-4*a*c;
		if (delta>0)
		{
			double x1=(-b)+Math.pow(delta, 0.5)/2*a , x2=(-b)-Math.pow(delta, 0.5)/2*a;
			System.out.print("Bu denklemin kokleri x1:"+x1+"  x2: "+x2);
		}
		else if(delta==0)
		{
			double x=(-b)/2*a;
			System.out.println("Bu denklemin koku x: "+x);
		}
		else
		{
			System.out.println("Bu denklemin reel koku yoktur");
		}
 	
	
	
	
	}
	

}
