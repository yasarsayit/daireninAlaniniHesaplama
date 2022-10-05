package java101;

import java.util.Scanner;

public class exercise {
	public static void main(String[] args) {
		 int r;
		 int a;
		 double pi = 3.14;
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Dairenin yarıçapını giriniz : ");
		 r = input.nextInt();
		 System.out.print("Dairenin açısını giriniz:");
		 a = input.nextInt();
		 
		 double alan = pi * r*r * a/360;
		 
		 System.out.print("Dairenin alanı : " + alan);;

}
}
