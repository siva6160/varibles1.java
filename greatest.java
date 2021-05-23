package siva4;

import java.util.Scanner;

public class satya {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		a=sc.nextInt();
		System.out.println("enter a number");
		b=sc.nextInt();
		System.out.println("enter a number");
		c=sc.nextInt();
		if (a>b && a>c){
			System.out.println("a is biggesst"+a);
			
		}
		else if(b>a && b>c){
			System.out.println(" b is biggest number"+b);
		}
		else if(c>a && c>b){
			System.out.println("c is biggest number"+c);
		}
		
	}

}
