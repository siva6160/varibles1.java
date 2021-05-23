package siva3;
 import java.util.*;
public class vari3 {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age ");
		age=sc.nextInt();
		if(age>=18){
			System.out.println("you are elligible for vote");
		}
		else{
			System.out.println("you are not elgibble for vote");
		}
	}

}
