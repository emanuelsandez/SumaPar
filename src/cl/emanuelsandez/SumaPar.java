package cl.emanuelsandez;

import java.util.Scanner;

public class SumaPar {
	public static void main(String[] args) {
		int x, acum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar un número");
		x = sc.nextInt();
		
		for(int i = 1;i<=x;i++) {
			if (i%2==0) {
			acum +=i;
			}acum +=0;
									
			}
		System.out.printf("Su número es %d", acum);
		
		sc.close();
	}
}
