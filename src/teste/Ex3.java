package teste;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int h = sc2.nextInt();
		
		int per = (c*2) + (h*2);
		int area = c*h;
		
		System.out.println("area: " + area + "\nperimetro: " +per);
	}

}
